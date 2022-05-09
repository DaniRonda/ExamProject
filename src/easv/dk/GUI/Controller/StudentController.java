package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;
import easv.dk.GUI.Model.citizenModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.sql.SQLException;

public class StudentController {
    private final ObservableList<Citizen> dataList = FXCollections.observableArrayList();
    public javafx.scene.control.TextField textFieldSearch2;
    public Button ButtonToCase;
    public Button ButtonLogOut;
    public Button ButtonHealthDiagnose;
    public Button ButtonFunctionalDiagnose;

    @FXML
    private Button sendToCaseScreen;
    @FXML
    private Button logOut;
    @FXML
    private Button toHealthDiagnoseScreen;
    @FXML
    private Button toFunctionalDiagnoseScreen;
    @FXML
    private TextField textFieldSearch1;
    @FXML
    private TableView tableViewCitizens;
    @FXML
    private ListView listViewAbout;

    private final static int CitizenSelected = 0;   //constant
    private int mode = CitizenSelected;

    citizenModel citizenmodel;
    public void initialize() throws Exception {

        search();
        setUpTableView();
    }

    public void sendToCaseScreen(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/caseView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("New Cases");
        stage.centerOnScreen();
        stage.show();
    }

    public void logOut(ActionEvent actionEvent) throws IOException {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/LogInView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.setTitle("Log In");
            stage.centerOnScreen();
            stage.show();
    }

    public void toHealthDiagnoseScreen(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/healthDiagnoseView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Diagnose Screen");
        stage.centerOnScreen();
        stage.show();
    }

    public void toFunctionalDiagnoseScreen(ActionEvent actionEvent) {
    }

    public void search() throws Exception {
        textFieldSearch2.textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                dataList.addAll(citizenmodel.getAllCitizen()); //<-- depending on what name the method gets
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            FilteredList<Citizen> filteredData = new FilteredList<>(dataList, b -> true);
            filteredData.setPredicate(citizen -> {

                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }


                String lowerCaseFilter = newValue.toLowerCase();

                //List<Integer> result = (List<Integer>) filteredData.stream().filter(val -> val.intValue() > searchBar.textProperty()).collect(Collectors.toList());
                if (citizen.getFirstName().toLowerCase().contains(lowerCaseFilter))
                    return true; // Filter title.

                else return String.valueOf(citizen.getLastName()).contains(lowerCaseFilter); //getcase might be changed
            });

            SortedList<Citizen> sortedData = new SortedList<>(filteredData);
            sortedData.comparatorProperty().bind(tableViewCitizens.comparatorProperty());
            tableViewCitizens.setItems(sortedData);
        });
    }

    public void setUpTableView() throws Exception {
        TableColumn<Citizen, String> column1 = new TableColumn<>("firstName");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Citizen, String> column2 = new TableColumn<>("lastName");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        TableColumn<Citizen, String> column3 = new TableColumn<>("adress");
        column2.setCellValueFactory(new PropertyValueFactory<>("adress"));
        TableColumn<Citizen, String> column4 = new TableColumn<>("birthDate");
        column2.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        TableColumn<Citizen, String> column5 = new TableColumn<>("phoneNumber");
        column2.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        tableViewCitizens.getColumns().add(column1);
        tableViewCitizens.getColumns().add(column2);
        tableViewCitizens.getColumns().add(column3);
        tableViewCitizens.getColumns().add(column4);
        tableViewCitizens.getColumns().add(column5);

        tableViewCitizens.getItems().clear();
        tableViewCitizens.getItems().addAll(citizenmodel.getAllCitizen());


    }

    private void clearListView() {
        listViewAbout.getItems().clear();
    }

    public void showCitizenInfo() {
        clearListView();
        mode = CitizenSelected;
        Citizen selectedCitizen = (Citizen) tableViewCitizens.getSelectionModel().getSelectedItem();  //get selected movie in movie table
        /*try {


        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }


}

