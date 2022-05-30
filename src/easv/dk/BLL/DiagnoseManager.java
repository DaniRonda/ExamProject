package easv.dk.BLL;

import easv.dk.BE.FunctionalDiagnose;
import easv.dk.BE.GeneralInfo;
import easv.dk.BE.HealthDiagnose;
import easv.dk.DAL.DALFacade;
import easv.dk.DAL.FunctionalDiagnoseDAO;
import easv.dk.DAL.HealthConditionDAO;
import easv.dk.DAL.IDataAccess;

import java.util.List;

public class DiagnoseManager {
    FunctionalDiagnoseDAO functionalDiagnoseDAO = new FunctionalDiagnoseDAO();
    HealthConditionDAO healthConditionDAO = new HealthConditionDAO();
    private IDataAccess dataAccess;

    public DiagnoseManager() throws Exception { dataAccess= DALFacade.getInstance(); }

    public HealthDiagnose getHealthDiagnose(int idHealthDiagnose) throws Exception {
        return dataAccess.getHealthDiagnose(idHealthDiagnose);
    }

    public List<HealthDiagnose> getAllHealthDiagnose() throws Exception {
        return dataAccess.getAllHealthDiagnose();
    }

    public void updateHealthDiagnose(HealthDiagnose healthDiagnose) throws Exception {
        dataAccess.updateHealthDiagnose(healthDiagnose);
    }

    public HealthDiagnose createHealthDiagnose(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int citizen, int healthtype) throws Exception{
        return healthConditionDAO.createHealthCondition(profnote, currentass, anticipatedlvl, followupdate, observenote, citizen, healthtype);
    }

    public FunctionalDiagnose getFunctionalDiagnose(int idFunctionalDiagnose) throws Exception {
        return dataAccess.getFunctionalDiagnose(idFunctionalDiagnose);
    }

    public List<FunctionalDiagnose> getAllFunctionalDiagnose() throws Exception {
        return dataAccess.getAllFunctionalDiagnose();
    }

    public void updateFunctionalDiagnose(FunctionalDiagnose functionalDiagnose) throws Exception {
        dataAccess.updateFunctionalDiagnose(functionalDiagnose);
    }

    public FunctionalDiagnose createFunctionalDiagnose(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int currlvl, int expectedlvl, String wishes, int citizen, int functionaltype) throws Exception{
        return dataAccess.createFunctionalDiagnose(profnote, currentass, anticipatedlvl, followupdate, observenote, currlvl, expectedlvl, wishes, citizen, functionaltype);
    }
}
