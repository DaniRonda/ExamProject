package easv.dk.BLL;

import easv.dk.BE.Citizen;
import easv.dk.BE.GeneralInfo;
import easv.dk.BE.GeneralInfoCitizen;
import easv.dk.DAL.CitizenGeneralInfoDAO;
import easv.dk.DAL.DALFacade;
import easv.dk.DAL.IDataAccess;

import java.sql.SQLException;
import java.util.List;

public class GeneralInfoManager {
    CitizenGeneralInfoDAO citizenGeneralInfoDAO = new CitizenGeneralInfoDAO();
    private IDataAccess dataAccess;
    public GeneralInfoManager() throws Exception { dataAccess= DALFacade.getInstance(); }

    public GeneralInfo getGeneralInfo(int idGeneralInfo) throws Exception {
        return dataAccess.getGeneralInfo(idGeneralInfo);
    }

    public List<GeneralInfo> getAllGeneralInfo() throws Exception {
        return dataAccess.getAllGeneralInfo();
    }

    public void updateGeneralInfo(GeneralInfo generalInfo) throws Exception {
        dataAccess.updateGeneralInfo1(generalInfo);
    }

    public GeneralInfo createGeneralInfo(String coping, String motivation, String resources, String roles, String habits, String education, String lifestory, String healthinfo, String aid, String furnishing, String network, int citizen) throws Exception{
        return dataAccess.createGeneralInfo(coping, motivation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network, citizen);
    }

}
