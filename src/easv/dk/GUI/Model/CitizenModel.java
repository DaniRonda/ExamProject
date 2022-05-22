package easv.dk.GUI.Model;

import easv.dk.BE.Citizen;
import easv.dk.BE.Student;
import easv.dk.BLL.CitizenManager;
import easv.dk.BLL.Manager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class CitizenModel {
    ObservableList<Citizen> getAllCitizens;
    CitizenManager citizenManager = new CitizenManager();
    Manager manager = new Manager();

    public CitizenModel() throws Exception {
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
}
