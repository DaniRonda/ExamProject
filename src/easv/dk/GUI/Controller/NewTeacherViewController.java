package easv.dk.GUI.Controller;

import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
import easv.dk.BLL.TeacherManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewTeacherViewController {
    @FXML
    private Button cancelNewTeacherBTN;
    @FXML
    private Button confirmNewTeacherBTN;
    @FXML
    private TextField teacherLastName_txt;
    @FXML
    private TextField teacherEmail_txt;
    @FXML
    private TextField teacherPassword_txt;
    @FXML
    private TextField teacherFirstName_txt;

    TeacherManager teacherManager = new TeacherManager();
    private AdminViewController parentController;

    public void setParentController(AdminViewController adminViewController){
        this.parentController = adminViewController;
    }


    public NewTeacherViewController() throws Exception {
    }

    public void confirmNewTeacher(ActionEvent actionEvent) throws Exception {
        String teacherFirstName= teacherFirstName_txt.getText();
        String teacherLastName=teacherLastName_txt.getText();
        String teacherEmail = teacherEmail_txt.getText();
        String teacherPassword = teacherPassword_txt.getText();
        Teacher teacherCreated= new Teacher (teacherFirstName, teacherLastName, teacherEmail, teacherPassword, 0);
        teacherManager.createTeacher(teacherCreated);
        Stage stage = (Stage)confirmNewTeacherBTN.getScene().getWindow();
        stage.close();
        parentController.initialize();
    }

    public void cancelNewTeacher(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) cancelNewTeacherBTN.getScene().getWindow();
            stage.close();
    }
    }

    public void setInfo(Teacher selectedItem) {
    }
}

