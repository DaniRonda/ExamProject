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

    public List<GeneralInfo> getAllGeneralInfo() throws Exception {
        return citizenGeneralInfoDAO.getAllGeneralInfo();
    }

    public void updateGeneralInfo(GeneralInfo generalInfo) throws Exception {
        citizenGeneralInfoDAO.updateGeneralInfo1(generalInfo);
    }

    public GeneralInfo createGeneralInfo(String coping, String motivation, String resources, String roles, String habits, String education, String lifestory, String healthinfo, String aid, String furnishing, String network, int citizen) throws Exception{
        return citizenGeneralInfoDAO.createGeneralInfo(coping, motivation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network, citizen);
    }

}
