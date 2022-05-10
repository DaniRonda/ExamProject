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
            adminCreated = new Admin(admin.getEmail(),
                    admin.getPassword(),
                    rs.getInt(1)
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
            String email = rs.getString("email");
            String password = rs.getString("password");
            int Id = rs.getInt("id");
            Admin admin = new Admin(email, password, Id);
            adminList.add(admin);
        }
        rs.close();
        psSelectAdmin.close();
        con.close();
        return adminList;
    }


    public void updateAdmin(Admin admin) throws Exception {
        Connection con = cm.getConnection();
        String sqlUpdateAdmin = "UPDATE  Admin SET email=?, password=? WHERE ID=?;";
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


    public Admin getAdminLogin(String email, String password) throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Admin adminfound = null;
        try {
            connection = ConnectionManager.getConnection();
            preparedStatement = connection.prepareStatement("SELECT password FROM admin WHERE email = ?");
            preparedStatement.setString(1, email);
            resultSet = preparedStatement.executeQuery();

            if(!resultSet.isBeforeFirst()){
                System.out.println("user not found");
            }
            else{
                while (resultSet.next()) {
                    String retrievedPassword = resultSet.getString("password");
                    if (retrievedPassword.equals(password)){
                        int ID = resultSet.getInt("ID");
                        String mail = resultSet.getString("email");
                        String login = resultSet.getString("password");
                        adminfound = new Admin(mail, login, ID);
                    }
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return adminfound;
    }
}


