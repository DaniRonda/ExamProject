package easv.dk.BLL;

import easv.dk.BE.Admin;
import easv.dk.DAL.DALFacade;
import easv.dk.DAL.IDataAccess;

public class AdminManager {
    private IDataAccess dataAccess;


    public AdminManager() throws Exception {dataAccess= DALFacade.getInstance(); }

    public Admin adminFound(String emails, String password) throws Exception{
        Admin admin = dataAccess.getAdminLogin(emails, password);
        if (admin != null) return loginHelper.getInstance(admin);
        else return null;
    }


}
