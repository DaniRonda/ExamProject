package easv.dk.GUI.Controller;
import easv.dk.BE.Student;
import easv.dk.BLL.StudentManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewStudentViewController {
    @FXML
    private TextField studentFirstName_txt;
    @FXML
    private TextField studentLastName_txt;
    @FXML
    private TextField studentEmail_txt;
    @FXML
    private TextField studentPassword_txt;
    @FXML
    private Button confirmNewStudentBTN;
    @FXML
    private Button cancelNewStudentBTN;

    StudentManager studentManager = new StudentManager();
    private AdminViewController parentController;

    private TeacherViewController teacherController;

    public void setParentController(AdminViewController adminViewController){
        this.parentController = adminViewController;
    }

    public void setTeacherController(TeacherViewController teacherController){
        this.teacherController = teacherController;
    }


    public NewStudentViewController() throws Exception {
    }

    public void confirmNewStudent(ActionEvent actionEvent) throws Exception {
        String studentFirstName= studentFirstName_txt.getText();
        String studentLastName=studentLastName_txt.getText();
        String studentEmail = studentEmail_txt.getText();
        String studentPassword = studentPassword_txt.getText();
        studentManager.createStudent(studentFirstName, studentLastName, studentEmail, studentPassword);
        Stage stage = (Stage)confirmNewStudentBTN.getScene().getWindow();
        stage.close();
        if(parentController != null){
            parentController.initialize();
        }
        if(teacherController != null){
            teacherController.initialize();
        }
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
