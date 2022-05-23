package easv.dk.BLL;

import easv.dk.BE.Citizen;
import easv.dk.BE.GeneralInfo;
import easv.dk.BE.GeneralInfoCitizen;
import easv.dk.DAL.CitizenGeneralInfoDAO;

import java.sql.SQLException;
import java.util.List;

public class GeneralInfoManager {
    CitizenGeneralInfoDAO citizenGeneralInfoDAO = new CitizenGeneralInfoDAO();

    public GeneralInfo getGeneralInfo(int idGeneralInfo) throws Exception {
        return citizenGeneralInfoDAO.getGeneralInfo(idGeneralInfo);
    }
}
