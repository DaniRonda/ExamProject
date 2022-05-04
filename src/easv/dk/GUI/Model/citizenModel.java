package easv.dk.GUI.Model;

import easv.dk.BE.Citizen;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class citizenModel {
    ObservableList<Citizen> getAllCitizens;

    public citizenModel() throws IOException {
        getAllCitizens = FXCollections.observableArrayList();
    }

    public void deleteCitizen(Citizen selectedItem) throws SQLException {
        //manager.deleteCitizen(selectedItem);
    }

    public void setGetAllMovies(ObservableList<Citizen> getAllMovies) {
        this.getAllCitizens = getAllMovies;
    }

    public List<Citizen> getAllCitizen() throws SQLException, IOException {
        this.getAllCitizens = FXCollections.observableArrayList();
        //this.getAllCitizens.addAll(this.manager.getAllMovies());
        return this.getAllCitizens;
    }



}
