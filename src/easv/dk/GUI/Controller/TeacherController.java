package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;
import easv.dk.BE.Student;
import easv.dk.GUI.Model.CitizenModel;
import easv.dk.GUI.Model.StudentModel;
import easv.dk.GUI.Model.TeacherModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class TeacherController {

    public TableView studentTable;
    public Button btnDeleteStudent;
    @FXML
    private TableView citizenTable;
    @FXML
    private Button btnDeleteCitizen;
    @FXML
    private Button btnNewCitizen;
    @FXML
    private Button btnTeacherLogOut;
    StudentModel studentModel = new StudentModel();
    CitizenModel citizenModel = new CitizenModel();

    public TeacherController() throws Exception {
    }

    @FXML
    public void initialize() throws Exception {
        setUpCitizenTable();
        setUpStudentTable();
    }

    public void teacherLogOut(ActionEvent actionEvent) throws Exception {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to log out?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnTeacherLogOut.getScene().getWindow();
            stage.close();
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/LogInView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openNewCitizenView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/NewCitizenView .fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openNewStudentView(ActionEvent actionEvent) {
    }

    public void deleteCitizen(ActionEvent actionEvent) throws Exception {
        CitizenModel.deleteCitizen((Citizen)citizenTable.getSelectionModel().getSelectedItem());
        citizenTable.getItems().remove(citizenTable.getSelectionModel().getSelectedIndex());
    }

    public void deleteStudent(ActionEvent actionEvent) throws Exception {
        studentModel.deleteStudent((Student)studentTable.getSelectionModel().getSelectedItem());
        studentTable.getItems().remove(studentTable.getSelectionModel().getSelectedIndex());
    }

    public void setUpStudentTable() throws Exception {
        TableColumn<Student, String> column1 = new TableColumn<>("First Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Student, String> column2 = new TableColumn<>("Last Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        TableColumn<Student, String> column3 = new TableColumn<>("Email");
        column3.setCellValueFactory(new PropertyValueFactory<>("email"));
        studentTable.getColumns().clear();
        studentTable.getColumns().add(column1);
        studentTable.getColumns().add(column2);
        studentTable.getColumns().add(column3);
        studentTable.getItems().clear();
        studentTable.getItems().addAll(studentModel.getAllStudents1());
    }

    public void setUpCitizenTable() throws Exception {
        TableColumn<Citizen, String> column1 = new TableColumn<>("First Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Citizen, String> column2 = new TableColumn<>("Last Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        citizenTable.getColumns().clear();
        citizenTable.getColumns().add(column1);
        citizenTable.getColumns().add(column2);
        citizenTable.getItems().clear();
        citizenTable.getItems().addAll(citizenModel.getAllCitizens1());
    }


}
