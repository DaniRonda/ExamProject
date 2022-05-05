package easv.dk.GUI.Model;

import easv.dk.BE.Citizen;
import easv.dk.BLL.Manager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class citizenModel {
    ObservableList<Citizen> getAllCitizens;
    Manager manager = new Manager();

    public citizenModel() throws Exception {
        getAllCitizens = FXCollections.observableArrayList();
    }

    public void deleteCitizen(Citizen selectedItem) throws SQLException {
        //manager.deleteCitizen(selectedItem);
    }

    public void setGetAllCitizens(ObservableList<Citizen> getAllMovies) {
        this.getAllCitizens = getAllCitizens;
    }

    public List<Citizen> getAllCitizen() throws Exception {
        this.getAllCitizens = FXCollections.observableArrayList();
        this.getAllCitizens.addAll(this.manager.getAllCitizens());
        return this.getAllCitizens;
    }



}
