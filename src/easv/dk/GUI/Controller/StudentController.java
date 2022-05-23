package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;
import easv.dk.BE.GeneralInfo;
import easv.dk.BLL.GeneralInfoManager;
import easv.dk.GUI.Model.CitizenModel;
import easv.dk.GUI.Model.StudentModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.TextField;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class StudentController {
    private final ObservableList<Citizen> dataList = FXCollections.observableArrayList();
    public javafx.scene.control.TextField textFieldSearch2;
    public Button ButtonToCase;

    @FXML
    private Button sendToCaseScreen;
    @FXML
    private Button btnStudentLogOut;
    @FXML
    private Button btnHealthConditions;
    @FXML
    private Button btnFunctionalAbilities;
    @FXML
    private TextField textFieldSearch1;
    @FXML
    private TableView tableViewCitizens;
    @FXML
    private TextArea textAreaGeneralCoping;
    @FXML
    private TextArea textAreaGeneralMotevation;
    @FXML
    private TextArea textAreaGeneralRessources;
    @FXML
    private TextArea textAreaGeneralRoles;
    @FXML
    private TextArea textAreaGeneralHabits;
    @FXML
    private TextArea textAreaGeneralEdu;
    @FXML
    private TextArea textAreaGeneralLifeStory;
    @FXML
    private TextArea textAreaGeneralHealthInfo;
    @FXML
    private TextArea textAreaGeneralAid;
    @FXML
    private TextArea textAreaGeneralFurnice;
    @FXML
    private TextArea textAreaGeneralNetwork;
    StudentModel studentModel = new StudentModel();




    private final static int CitizenSelected = 0;   //constant
    private int mode = CitizenSelected;

    CitizenModel citizenmodel = new CitizenModel();

    public StudentController() throws Exception {
    }

    public void initialize() throws Exception {
        search();
        setUpTableView();
       // showCitizenInfo();
    }

    public void sendToCaseScreen(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/CaseView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("New Cases");
        stage.centerOnScreen();
        stage.show();
    }


    public void studentLogOut(ActionEvent actionEvent) throws Exception{

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to log out?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnStudentLogOut.getScene().getWindow();
            stage.close();
        }
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


    public void openHealthConditionsView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/HealthConditionsView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Diagnose");
        stage.centerOnScreen();
        stage.show();
        Stage stageThis = (Stage) btnStudentLogOut.getScene().getWindow();
        stageThis.close();
        StudentModel.diagnose = 1;
    }

    public void openFunctionalAbilitiesView(ActionEvent actionEvent) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/HealthConditionsView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Functional Abilities");
        stage.centerOnScreen();
        stage.show();
        StudentModel.diagnose = 2;
    }



    public void search() throws Exception {
        textFieldSearch2.textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                dataList.addAll(citizenmodel.getAllCitizen()); //<-- depending on what name the method gets
            } catch (Exception e) {
                e.printStackTrace();
            }
            FilteredList<Citizen> filteredData = new FilteredList<>(dataList, b -> true);
            filteredData.setPredicate(citizen -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();

                //List<Integer> result = (List<Integer>) filteredData.stream().filter(val -> val.intValue()
                // > searchBar.textProperty()).collect(Collectors.toList());
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
        column3.setCellValueFactory(new PropertyValueFactory<>("adress"));
        TableColumn<Citizen, String> column4 = new TableColumn<>("birthDate");
        column4.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        TableColumn<Citizen, String> column5 = new TableColumn<>("phoneNumber");
        column5.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        tableViewCitizens.getColumns().add(column1);
        tableViewCitizens.getColumns().add(column2);
        tableViewCitizens.getColumns().add(column3);
        tableViewCitizens.getColumns().add(column4);
        tableViewCitizens.getColumns().add(column5);

        tableViewCitizens.getItems().clear();
        tableViewCitizens.getItems().addAll(citizenmodel.getAllCitizen());


    }

    private void clearLists(){
    textAreaGeneralCoping.clear();
    textAreaGeneralMotevation.clear();
    textAreaGeneralRessources.clear();
    textAreaGeneralRoles.clear();
    textAreaGeneralHabits.clear();
    textAreaGeneralEdu.clear();
    textAreaGeneralLifeStory.clear();
    textAreaGeneralHealthInfo.clear();
    textAreaGeneralAid.clear();
    textAreaGeneralFurnice.clear();
    textAreaGeneralNetwork.clear();
    }

    /*public void showCitizenInfo() throws Exception {
        clearLists();
        mode = CitizenSelected;
        Citizen selectedCitizen = (Citizen) tableViewCitizens.getSelectionModel().getSelectedItem();  //get selected movie in movie table
        try {
            GeneralInfoManager bll = new GeneralInfoManager();  //get bll interface to use data from database
            List<GeneralInfo> generalInfo = citizenmodel.getGeneralInfo(selectedCitizen);      //load movies for selected category
            textAreaGeneralCoping.setText(String.valueOf(generalInfo.get(1)));
            textAreaGeneralMotevation.setText(String.valueOf(generalInfo.get(2)));
            textAreaGeneralRessources.setText(String.valueOf(generalInfo.get(3)));
            textAreaGeneralRoles.setText(String.valueOf(generalInfo.get(4)));
            textAreaGeneralHabits.setText(String.valueOf(generalInfo.get(5)));
            textAreaGeneralEdu.setText(String.valueOf(generalInfo.get(6)));
            textAreaGeneralLifeStory.setText(String.valueOf(generalInfo.get(7)));
            textAreaGeneralHealthInfo.setText(String.valueOf(generalInfo.get(8)));
            textAreaGeneralAid.setText(String.valueOf(generalInfo.get(9)));
            textAreaGeneralFurnice.setText(String.valueOf(generalInfo.get(10)));
            textAreaGeneralNetwork.setText(String.valueOf(generalInfo.get(11)));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
}

    public void addInfoToCitizen(ActionEvent actionEvent) {
        if (tableViewCitizens.getSelectionModel().getSelectedIndex() != -1) {
            try {
                citizenmodel.addInfoToCitizen((Citizen) tableViewCitizens.getSelectionModel().getSelectedItem(), tableViewCitizens.getSelectionModel().getSelectedIndex());
            } catch (Exception ex) {
            }
        }
    }*/

}

