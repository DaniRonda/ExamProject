package easv.dk.GUI.Model;
import easv.dk.BE.Admin;
import easv.dk.BLL.AdminManager;


public class AdminModel {
    AdminManager adminManager = new AdminManager();

    public AdminModel() throws Exception {
    }

    public Admin adminFound(String emails, String password) throws Exception {
        return adminManager.adminFound(emails, password);
    }
}
