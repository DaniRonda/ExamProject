package easv.dk.BLL;

import easv.dk.BE.Citizen;
import easv.dk.DAL.CitizenDAO;
import easv.dk.GUI.Controller.LogInController;
import java.util.List;

public class Manager {
    LogInController logInController;
    CitizenDAO citizenDAO = new CitizenDAO();

    public Manager() throws Exception {
    }

    public List<Citizen> getAllCitizens() throws Exception {
        return this.citizenDAO.getAllCitzens();
    }

    public String getLogInEmail(){
        return logInController.getTextFieldMail().toString();
    }

    public String getLogInPassword(){
        return logInController.getTextFieldPassword().toString();
    }
}
