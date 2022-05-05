package easv.dk.BLL;

import easv.dk.BE.Citizen;
import easv.dk.DAL.CitizenDAO;

import java.sql.SQLException;
import java.util.List;

public class Manager {

    CitizenDAO citizenDAO = new CitizenDAO();

    public Manager() throws Exception {
    }

    public List<Citizen> getAllCitizens() throws Exception {
        return this.citizenDAO.getAllCitzens();

    }
}
