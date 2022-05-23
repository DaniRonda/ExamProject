package easv.dk.GUI.Controller;

import easv.dk.BE.Student;
import easv.dk.BLL.StudentManager;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewStudentViewController {
    public TextField studentFirstName_txt;
    public TextField studentLastName_txt;
    public TextField studentEmail_txt;
    public TextField studentPassword_txt;
    public Button confirmNewStudentBTN;
    public Button cancelNewStudentBTN;
    StudentManager studentManager = new StudentManager();
    private AdminViewController parentController;
    public void setParentController(AdminViewController adminViewController){
        this.parentController = adminViewController;
    }

    public NewStudentViewController() throws Exception {
    }

    public void confirmNewStudent(ActionEvent actionEvent) throws Exception {
        String studentFirstName= studentFirstName_txt.getText();
        String studentLastName=studentLastName_txt.getText();
        String studentEmail = studentEmail_txt.getText();
        String studentPassword = studentPassword_txt.getText();
        Student studentCreated= new Student(studentFirstName,studentLastName,studentEmail,studentPassword,0);
        studentManager.createStudent(studentCreated);
        Stage stage = (Stage)confirmNewStudentBTN.getScene().getWindow();
        stage.close();
        parentController.initialize();
    }

    public void cancelNewStudent(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) cancelNewStudentBTN.getScene().getWindow();
            stage.close();
        }
    }

    public void setInfo(Student selectedItem) {
    }
}
