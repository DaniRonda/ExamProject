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

    public Admin getAdminLogin(String email, String password) throws Exception {

        Admin adminfound = null;
        try(Connection connection = cm.getConnection()) {
            String sqlAdmin = ("SELECT * FROM Admins WHERE emails = ? AND password = ?");
            PreparedStatement preparedStatement = connection.prepareStatement(sqlAdmin);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int ID = resultSet.getInt("ID");
                String emails = resultSet.getString("emails");
                String login = resultSet.getString("password");
                System.out.println("admin found");
                adminfound = new Admin(ID, emails,login );
            }
        }
        catch (Exception e){
            adminfound = null;
            e.printStackTrace();
        }
        return adminfound;
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








}


