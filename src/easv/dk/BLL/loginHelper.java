package easv.dk.BLL;

import easv.dk.BE.Admin;

public class loginHelper {
    private static Admin admin;

    public static Admin getInstance(Admin theadmin)
    {
        if(admin==null)
        {
            admin = theadmin;
        }
        return admin;
    }

}
