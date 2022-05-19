package easv.dk.BLL;

import easv.dk.DAL.AdminDAO;
import easv.dk.BE.Admin;

public class AdminManager {

    AdminDAO adminDAO = new AdminDAO();

    public AdminManager() throws Exception {
    }

    public Admin adminFound(String emails, String password) throws Exception{
        Admin admin = adminDAO.getAdminLogin(emails, password);
        if (admin != null) return loginHelper.getInstance(admin);
        else return null;
    }

    public void updateAdmin(Admin admin) throws Exception{
        adminDAO.updateAdmin(admin);
    }
}
