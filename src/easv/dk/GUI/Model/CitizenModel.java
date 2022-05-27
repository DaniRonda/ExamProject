package easv.dk.GUI.Model;

import easv.dk.BE.Citizen;
import easv.dk.BE.GeneralInfo;
import easv.dk.BE.Student;
import easv.dk.BLL.CitizenManager;
import easv.dk.BLL.GeneralInfoManager;
import easv.dk.BLL.Manager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class CitizenModel {
    ObservableList<Citizen> getAllCitizens;
    CitizenManager citizenManager = new CitizenManager();
    Manager manager = new Manager();
    GeneralInfoManager managerInfo;
    public static Citizen clickedCitizen;;

    public CitizenModel() throws Exception {
        managerInfo = new GeneralInfoManager();
        getAllCitizens = FXCollections.observableArrayList();
    }

    public static void deleteCitizen(Citizen selectedItem) throws Exception {
        CitizenManager.deleteCitizen(selectedItem);
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
    }

