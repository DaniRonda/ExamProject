package easv.dk.DAL;

import easv.dk.BE.Admin;
import easv.dk.BLL.Manager;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {
    private static ConnectionManager cm;

    public AdminDAO() throws Exception {
        cm = new ConnectionManager();
    }

    public Admin getAdminLogin(String emails, String password) throws Exception {

        Admin adminfound = null;
        try(Connection connection = cm.getConnection()) {
            String sqlAdmin = ("SELECT * FROM Admins WHERE emails = admin AND password = admin");
            PreparedStatement preparedStatement = connection.prepareStatement(sqlAdmin);
            preparedStatement.setString(1, emails);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int ID = resultSet.getInt("ID");
                String email = resultSet.getString("emails");
                String login = resultSet.getString("password");

                adminfound = new Admin(ID, email,login );
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return adminfound;
    }

    public Admin CreateAdmin(Admin admin) throws Exception {
        Admin adminCreated = null;
        Connection con = cm.getConnection();
        String sqlSelectAdmin = "INSERT INTO Admin VALUES(?,?)";
        PreparedStatement psInsertAdmin = con.prepareStatement(sqlSelectAdmin, Statement.RETURN_GENERATED_KEYS);
        psInsertAdmin.setString(1, admin.getEmail());
        psInsertAdmin.setString(2, admin.getPassword());
        psInsertAdmin.addBatch();
        psInsertAdmin.executeBatch();
        ResultSet rs = psInsertAdmin.getGeneratedKeys();
        while (rs.next()) {
            adminCreated = new Admin( rs.getInt(1) ,admin.getEmail() ,admin.getPassword()
            );
        }
        return adminCreated;
    }
@Test
    public List<Admin> getAllAdmin() throws Exception {
        List<Admin> adminList = new ArrayList<>();
        Connection con = cm.getConnection();
        String sqlSelectAdmin = "select admin.id,email,password from Admin;";
        PreparedStatement psSelectAdmin = con.prepareStatement(sqlSelectAdmin);
        ResultSet rs = psSelectAdmin.executeQuery();
        while (rs.next()) {
            int Id = rs.getInt("ID");
            String email = rs.getString("email");
            String password = rs.getString("password");
            Admin admin = new Admin(Id , password, email );
            adminList.add(admin);
        }
        rs.close();
        psSelectAdmin.close();
        con.close();
        return adminList;
    }


    public void updateAdmin(Admin admin) throws Exception {
        Connection con = cm.getConnection();
        String sqlUpdateAdmin = "UPDATE  Admin SET emails=?, password=? WHERE ID=?;";
        PreparedStatement psUpdateAdmin = con.prepareStatement(sqlUpdateAdmin, Statement.RETURN_GENERATED_KEYS);
        psUpdateAdmin.setString(1, admin.getEmail());
        psUpdateAdmin.setString(2, admin.getPassword());
        psUpdateAdmin.executeUpdate();
        psUpdateAdmin.close();
        con.close();
    }

    public void deleteAdmin(Admin admin) throws Exception {
        Connection con = cm.getConnection();
        String sqlDeleteAdmin = "DELETE FROM Admin WHERE ID=?;";
        PreparedStatement psDeleteAdmin = con.prepareStatement(sqlDeleteAdmin, Statement.RETURN_GENERATED_KEYS);
        psDeleteAdmin.setInt(1, admin.getId());
        psDeleteAdmin.execute();
        psDeleteAdmin.close();
        con.close();

    }



}


