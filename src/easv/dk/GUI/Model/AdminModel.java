package easv.dk.GUI.Model;

import easv.dk.BE.Admin;
import easv.dk.BLL.Manager;

public class AdminModel {
    Manager manager = new Manager();

    public AdminModel() throws Exception {
    }

    public Admin adminFound(String emails, String password) throws Exception {
        return manager.adminFound(emails, password);
    }
}
