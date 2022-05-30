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

public class EditStudentViewController {
 @FXML
 private TextField studentFirstName_txt;
 @FXML
 private TextField studentLastName_txt;
 @FXML
 private TextField studentEmail_txt;
 @FXML
 private TextField studentPassword_txt;
 @FXML
 private Button btnSaveUpdateStudent;
 @FXML
 private Button btnCancelUpdateStudent;

    private Student selectedStudent;
 StudentManager studentManager = new StudentManager();
 private AdminViewController parentController;
 private TeacherViewController teacherController;
 public EditStudentViewController() throws Exception {
 }

 public void setParentController(AdminViewController adminViewController){
  this.parentController = adminViewController;
 }
 public void setTeacherController(TeacherViewController teacherController){
  this.teacherController = teacherController;
 }

 public void setInfo(Student selectedItem) {
  selectedStudent = selectedItem;
  studentFirstName_txt.setText(selectedItem.getFirstName());
  studentLastName_txt.setText(String.valueOf(selectedItem.getLastName()));
  studentEmail_txt.setText(String.valueOf(selectedItem.getEmail()));
 }

    public void saveUpdateStudent(ActionEvent actionEvent) throws Exception {
     String studentFirstName= studentFirstName_txt.getText();
     String studentLastName=studentLastName_txt.getText();
     String studentEmail = studentEmail_txt.getText();
     String studentPassword = studentPassword_txt.getText();
     Student studentUpdated= new Student(selectedStudent.getId(),studentFirstName,studentLastName,studentEmail,studentPassword);
     studentManager.saveUpdateStudent(studentUpdated);
     Stage stage = (Stage)btnSaveUpdateStudent.getScene().getWindow();
     stage.close();
     if(parentController != null){
      parentController.initialize();
     }
     if(teacherController != null){
      teacherController.initialize();
     }
    }

    public void cancelUpdateStudent(ActionEvent actionEvent) {
     Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
     alert.showAndWait();
     if (alert.getResult() == ButtonType.YES) {
      Stage stage = (Stage) btnCancelUpdateStudent.getScene().getWindow();
      stage.close();
     }
    }



}
