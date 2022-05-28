package easv.dk.GUI.Model;

import easv.dk.BE.*;
import easv.dk.BLL.*;
import easv.dk.DAL.CaseDAO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class CitizenModel {
    ObservableList<Citizen> getAllCitizens;
    CitizenManager citizenManager = new CitizenManager();
    Manager manager = new Manager();
    GeneralInfoManager managerInfo;
    CaseManager caseManager = new CaseManager();
    DiagnoseManager diagnoseManager = new DiagnoseManager();
    public static Citizen clickedCitizen;;

    public CitizenModel() throws Exception {
        managerInfo = new GeneralInfoManager();
        getAllCitizens = FXCollections.observableArrayList();
    }

    public static void deleteCitizen(Citizen selectedItem) throws Exception {
        CitizenManager.deleteCitizen(selectedItem);
    }

    public Case createCade(String caseText,  int citizen) throws Exception{
        return caseManager.createCase(caseText, citizen);
    }

    public void setGetAllCitizens(ObservableList<Citizen> getAllMovies) {
        this.getAllCitizens = getAllCitizens;
    }

    public List<Citizen> getAllCitizen() throws Exception {
        this.getAllCitizens = FXCollections.observableArrayList();
        this.getAllCitizens.addAll(this.citizenManager.getAllCitizens());
        return this.getAllCitizens;
    }


    public List<Citizen> getAllCitizens1 () throws Exception{
        this.getAllCitizens=FXCollections.observableArrayList();
        this.getAllCitizens.addAll(this.citizenManager.getAllCitizens());
        return this.getAllCitizens;
    }
    public void addToCitizen(Citizen selectedItem, int selectedIndex, Student selectedStudent) throws Exception {
        manager.addCitizenToStudent(selectedItem, selectedStudent);
        List<Student> newList = selectedItem.getStudentsInCitizen();
        newList.add(selectedStudent);
        selectedItem.setStudentsInCitizen(newList);
        selectedItem.setStudentCount(selectedItem.getStudentCount() + 1);
        getAllCitizens.set(selectedIndex, selectedItem);
    }
    public GeneralInfo getGeneralInfo(int idGeneralInfo) throws Exception {
        return managerInfo.getGeneralInfo(idGeneralInfo);
    }
    public Citizen setCurrentCitizen(Citizen citizen){
        clickedCitizen = citizen;
        System.out.println("Current citizen: " + clickedCitizen);
        return clickedCitizen;
    }

    public void updateGeneralInfo(GeneralInfo generalInfo) throws Exception {
        managerInfo.updateGeneralInfo(generalInfo);
    }

    public void updateCitizen(Citizen citizenUpdated) throws Exception {
            citizenManager.updateCitizen(citizenUpdated);
         }

    public GeneralInfo createGeneralInfo(String coping, String motivation, String resources, String roles, String habits, String education, String lifestory, String healthinfo, String aid, String furnishing, String network, int citizenId) throws Exception {
        return managerInfo.createGeneralInfo(coping, motivation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network, citizenId);
    }


    public List<GeneralInfo> getAllGeneralInfo() throws Exception {
        return managerInfo.getAllGeneralInfo();
    }

    public Case getCase(int idCase) throws Exception {
        return caseManager.getCase(idCase);
    }

    public List<Case> getCases() throws Exception {
        return caseManager.getCases();
    }
    public HealthDiagnose getHealthDiagnose(int idHealthDiagnose) throws Exception {
        return diagnoseManager.getHealthDiagnose(idHealthDiagnose);
    }

    public List<HealthDiagnose> getAllHealthDiagnose() throws Exception {
        return diagnoseManager.getAllHealthDiagnose();
    }

    public void updateHealthDiagnose(HealthDiagnose healthDiagnose) throws Exception {
        diagnoseManager.updateHealthDiagnose(healthDiagnose);
    }

    public HealthDiagnose createHealthDiagnose(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int citizen) throws Exception{
        return diagnoseManager.createHealthDiagnose(profnote, currentass, anticipatedlvl, followupdate, observenote, citizen);
    }

    public FunctionalDiagnose getFunctionalDiagnose(int idFunctionalDiagnose) throws Exception {
        return diagnoseManager.getFunctionalDiagnose(idFunctionalDiagnose);
    }

    public List<FunctionalDiagnose> getAllFunctionalDiagnose() throws Exception {
        return diagnoseManager.getAllFunctionalDiagnose();
    }

    public void updateFunctionalDiagnose(FunctionalDiagnose functionalDiagnose) throws Exception {
        diagnoseManager.updateFunctionalDiagnose(functionalDiagnose);
    }

    public FunctionalDiagnose createFunctionalDiagnose(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int currlvl, int expectedlvl, String wishes, int citizen) throws Exception{
        return diagnoseManager.createFunctionalDiagnose(profnote, currentass, anticipatedlvl, followupdate, observenote, currlvl, expectedlvl, wishes, citizen);
    }
    }

