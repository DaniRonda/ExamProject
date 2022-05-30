package easv.dk.BLL;

import easv.dk.BE.Citizen;
import easv.dk.BE.GeneralInfo;
import easv.dk.BE.Student;
import easv.dk.DAL.CitizenDAO;
import easv.dk.DAL.CitizenGeneralInfoDAO;
import easv.dk.DAL.DALFacade;
import easv.dk.DAL.IDataAccess;

import java.sql.SQLException;
import java.util.List;

public class CitizenManager {
    private IDataAccess dataAccess;

    public CitizenManager() throws Exception { dataAccess= DALFacade.getInstance(); }


    public List<Citizen> getAllCitizens() throws Exception{
        return this.dataAccess.getAllCitizens();
    }

    public void deleteCitizen(Citizen selectedItem) throws Exception {
        dataAccess.deleteCitizen(selectedItem);

    }

    public void updateCitizen(Citizen citizen) throws Exception{
        dataAccess.saveUpdateCitizen(citizen);
    }

    public void createCitizen(Citizen citizen) throws Exception{
        dataAccess.createCitizen(citizen);
    }


    /*public void addInfoToCitizen(Citizen selectedItem, ) throws SQLException {
        CitizenGeneralInfoDAO.addMovieToCategory(selectedItem, selectedMovie);

    /*public GeneralInfo getGeneralInfo(int idGeneralInfo) throws Exception {
        return .getGeneralInfo(idGeneralInfo);

    }*/



}
