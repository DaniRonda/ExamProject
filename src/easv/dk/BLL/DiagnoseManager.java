package easv.dk.BLL;

import easv.dk.BE.FunctionalDiagnose;
import easv.dk.BE.GeneralInfo;
import easv.dk.BE.HealthDiagnose;
import easv.dk.DAL.FunctionalDiagnoseDAO;
import easv.dk.DAL.HealthConditionDAO;

import java.util.List;

public class DiagnoseManager {
    FunctionalDiagnoseDAO functionalDiagnoseDAO = new FunctionalDiagnoseDAO();
    HealthConditionDAO healthConditionDAO = new HealthConditionDAO();

    public HealthDiagnose getHealthDiagnose(int idHealthDiagnose) throws Exception {
        return healthConditionDAO.getHealthDiagnose(idHealthDiagnose);
    }

    public List<HealthDiagnose> getAllHealthDiagnose() throws Exception {
        return healthConditionDAO.getAllHealthDiagnose();
    }

    public void updateHealthDiagnose(HealthDiagnose healthDiagnose) throws Exception {
        healthConditionDAO.updateHealthDiagnose(healthDiagnose);
    }

    public HealthDiagnose createHealthDiagnose(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int citizen, int healthtype) throws Exception{
        return healthConditionDAO.createHealthCondition(profnote, currentass, anticipatedlvl, followupdate, observenote, citizen, healthtype);
    }

    public FunctionalDiagnose getFunctionalDiagnose(int idFunctionalDiagnose) throws Exception {
        return functionalDiagnoseDAO.getFunctionalDiagnose(idFunctionalDiagnose);
    }

    public List<FunctionalDiagnose> getAllFunctionalDiagnose() throws Exception {
        return functionalDiagnoseDAO.getAllFunctionalDiagnose();
    }

    public void updateFunctionalDiagnose(FunctionalDiagnose functionalDiagnose) throws Exception {
        functionalDiagnoseDAO.updateFunctionalDiagnose(functionalDiagnose);
    }

    public FunctionalDiagnose createFunctionalDiagnose(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int currlvl, int expectedlvl, String wishes, int citizen, int functionaltype) throws Exception{
        return functionalDiagnoseDAO.createFunctionalDiagnose(profnote, currentass, anticipatedlvl, followupdate, observenote, currlvl, expectedlvl, wishes, citizen, functionaltype);
    }
}
