package easv.dk.GUI.Controller;
import easv.dk.BE.Teacher;
import easv.dk.BLL.TeacherManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditTeacherViewController {
    @FXML
    private TextField teacherFirstName_txt;
    @FXML
    private TextField teacherPassword_txt;
    @FXML
    private TextField teacherEmail_txt;
    @FXML
    private TextField teacherSchool_txt;
    @FXML
    private TextField teacherLastName_txt;
    @FXML
    private Button confirmUpdateTeacherBTN;
    @FXML
    private Button cancelUpdateTeacherBTN;

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
        String teacherEmail = teacherEmail_txt.getText();
        String teacherPassword = teacherPassword_txt.getText();
        Teacher teacherUpdated = new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherPassword, selectedTeacher.getId());
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
