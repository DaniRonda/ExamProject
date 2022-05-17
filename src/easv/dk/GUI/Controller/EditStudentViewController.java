package easv.dk.GUI.Controller;

import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
import easv.dk.BLL.Manager;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditStudentViewController {
   public TextField studentFirstName_txt;
    public TextField studentLastName_txt;
    public TextField studentEmail_txt;
    public TextField studentPassword_txt;
    public Button confirmUpdateStudentBTN;
    public Button cancelUpdateStudentBTN;
    private Student selectedStudent;
 Manager manager = new Manager();
 private AdminViewController parentController;

 public EditStudentViewController() throws Exception {
 }

 public void setParentController(AdminViewController adminViewController){
  this.parentController = adminViewController;}

    public void confirmUpdateStudent(ActionEvent actionEvent) throws Exception {
     String studentFirstName= studentFirstName_txt.getText();
     String studentLastName=studentLastName_txt.getText();
     String studentEmail = studentEmail_txt.getText();
     String studentPassword = studentPassword_txt.getText();
     Student studentUpdated= new Student(studentFirstName,studentLastName,studentEmail,studentPassword,selectedStudent.getId());
     manager.updateStudent(studentUpdated);
     Stage stage = (Stage)confirmUpdateStudentBTN.getScene().getWindow();
     stage.close();
     parentController.initialize();
    }

    public void cancelUpdateStudent(ActionEvent actionEvent) {
     Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
     alert.showAndWait();
     if (alert.getResult() == ButtonType.YES) {
      Stage stage = (Stage) cancelUpdateStudentBTN.getScene().getWindow();
      stage.close();
     }
    }
}
