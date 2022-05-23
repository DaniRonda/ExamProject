package easv.dk.BLL;

import easv.dk.BE.Citizen;
import easv.dk.BE.Student;
import easv.dk.DAL.CitizenDAO;

import java.util.List;

public class CitizenManager {

    CitizenDAO citizenDAO = new CitizenDAO();

    public CitizenManager() throws Exception {
    }

    public List<Citizen> getAllCitizens() throws Exception{
        return this.citizenDAO.getAllCitizens();
    }

    public static void deleteCitizen(Citizen selectedItem) throws Exception {
        CitizenDAO.deleteCitizen(selectedItem);

    }

    public void updateCitizen(Citizen citizen) throws Exception{
        citizenDAO.updateCitizen(citizen);
    }
}
