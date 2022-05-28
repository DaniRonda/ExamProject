package easv.dk.GUI.Controller;

import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
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

import java.io.IOException;


public class AdminViewController {

    @FXML
    private Button btnOpenEditTeacherView;
    @FXML
    private Button btnDeleteTeacher;
    @FXML
    private Button btnOpenEditStudentView;
    @FXML
    private Button btnDeleteStudent;
    @FXML
    private TableView studentTable;
    @FXML
    private TableView teacherTable;
    @FXML
    private Button btnOpenTeacherView;
    @FXML
    private Button btnOpenTemplateView;
    @FXML
    private Button btnOpenNewTeacherView;
    @FXML
    private Button btnOpenNewStudentView;
    @FXML
    private Button btnAdminLogOut;
    TeacherModel teacherModel = new TeacherModel();
    StudentModel studentModel = new StudentModel();


    public AdminViewController() throws Exception {
    }


    @FXML
    public void initialize() throws Exception {
        setUpTeacherTable();
        setUpStudentTable();
        //teacherFilter();
        //studentFilter();

    }


    public void openEditTeacherView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/EditTeacherView.fxml"));
        Parent root = loader.load();
        EditTeacherViewController control = loader.getController();
        control.setInfo((Teacher) teacherTable.getSelectionModel().getSelectedItem());
        control.setParentController(this);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void adminLogOut(ActionEvent actionEvent) throws Exception {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to log out?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnAdminLogOut.getScene().getWindow();
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

    public void deleteTeacher(ActionEvent actionEvent) throws Exception {
        teacherModel.deleteTeacher((Teacher) teacherTable.getSelectionModel().getSelectedItem());
        teacherTable.getItems().remove(teacherTable.getSelectionModel().getSelectedItem());
    }

    public void openEditStudentView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/EditStudentView.fxml"));
        Parent root = loader.load();
        EditStudentViewController control = loader.getController();
        control.setInfo((Student) studentTable.getSelectionModel().getSelectedItem());
        control.setParentController(this);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void deleteStudent(ActionEvent actionEvent) throws Exception {
        studentModel.deleteStudent((Student) studentTable.getSelectionModel().getSelectedItem());
        studentTable.getItems().remove(studentTable.getSelectionModel().getSelectedItem());
    }

    public void setUpTeacherTable() throws Exception {
        TableColumn<Teacher, String> column1 = new TableColumn<>("First Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Teacher, String> column2 = new TableColumn<>("Last Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        TableColumn<Teacher, String> column3 = new TableColumn<>("Email");
        column3.setCellValueFactory(new PropertyValueFactory<>("email"));
        teacherTable.getColumns().clear();
        teacherTable.getColumns().add(column1);
        teacherTable.getColumns().add(column2);
        teacherTable.getColumns().add(column3);
        teacherTable.getItems().clear();
        teacherTable.getItems().addAll(teacherModel.getAllTeachers1());
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

    public void openTeacherView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/TeacherView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }


    public void openTemplateView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/TemplateView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openNewTeacherView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/NewTeacherView.fxml"));
        Parent root = loader.load();
        NewTeacherViewController control = loader.getController();
        control.setInfo((Teacher) teacherTable.getSelectionModel().getSelectedItem());
        control.setParentController(this);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openNewStudentView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/NewStudentView.fxml"));
        Parent root = loader.load();
        NewStudentViewController control = loader.getController();
        control.setInfo((Student) studentTable.getSelectionModel().getSelectedItem());
        control.setParentController(this);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }
}
