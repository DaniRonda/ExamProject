package easv.dk.BLL;

import easv.dk.BE.Case;
import easv.dk.BE.GeneralInfo;
import easv.dk.DAL.CaseDAO;
import easv.dk.DAL.DALFacade;
import easv.dk.DAL.IDataAccess;

import java.util.List;

public class CaseManager {

    private IDataAccess dataAccess;
    public CaseManager() throws Exception {
        dataAccess = DALFacade.getInstance();
    }


    public Case getCase(int idCase) throws Exception {
        return dataAccess.getCase(idCase);
    }

    public List<Case> getCases() throws Exception {
        return dataAccess.getAllCases();
    }

    public Case createCase(String caseText,  int citizen) throws Exception{
        return dataAccess.createCase(caseText, citizen);
    }
}
