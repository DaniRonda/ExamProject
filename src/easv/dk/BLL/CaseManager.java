package easv.dk.BLL;

import easv.dk.BE.Case;
import easv.dk.BE.GeneralInfo;
import easv.dk.DAL.CaseDAO;

import java.util.List;

public class CaseManager {
CaseDAO caseDAO = new CaseDAO();


    public Case getCase(int idCase) throws Exception {
        return caseDAO.getCase(idCase);
    }

    public List<Case> getCases() throws Exception {
        return caseDAO.getAllCases();
    }

    public Case createCase(String caseText,  int citizen) throws Exception{
        return caseDAO.createCase(caseText, citizen);
    }
}
