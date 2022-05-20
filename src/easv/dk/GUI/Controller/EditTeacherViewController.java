package easv.dk.GUI.Controller;
import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
import easv.dk.BLL.TeacherManager;
import easv.dk.BLL.Manager;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditTeacherViewController {
    public TextField teacherFirstName_txt;
    public TextField teacherPassword_txt;
    public TextField teacherEmail_txt;
    public TextField teacherSchool_txt;
    public TextField teacherLastName_txt;
    public Button confirmUpdateTeacherBTN;
    public Button cancelUpdateTeacherBTN;
    private Teacher selectedTeacher;
    TeacherManager teacherManager = new TeacherManager();
    private AdminViewController parentController;
    public void setParentController(AdminViewController adminViewController){
        this.parentController = adminViewController;
    }

    public EditTeacherViewController() throws Exception {
    }

    public void confirmUpdateTeacher(ActionEvent actionEvent) throws Exception {
        String teacherFirstName= teacherFirstName_txt.getText();
        String teacherLastName=teacherLastName_txt.getText();
        String teacherSchool=teacherSchool_txt.getText();
        String teacherEmail = teacherEmail_txt.getText();
        String teacherPassword = teacherPassword_txt.getText();
        Teacher teacherUpdated = new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherPassword, teacherSchool,selectedTeacher.getId());
        teacherManager.updateTeacher(teacherUpdated);
        Stage stage = (Stage)confirmUpdateTeacherBTN.getScene().getWindow();
        stage.close();
        parentController.initialize();
    }

    public void setInfo(Teacher selectedItem) {
        selectedTeacher = selectedItem;
        teacherFirstName_txt.setText(selectedItem.getFirstName());
        teacherLastName_txt.setText(String.valueOf(selectedItem.getLastName()));
        teacherEmail_txt.setText(String.valueOf(selectedItem.getEmail()));
    }




    public void cancelUpdateTeacher(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) cancelUpdateTeacherBTN.getScene().getWindow();
            stage.close();
    }
    }
}
