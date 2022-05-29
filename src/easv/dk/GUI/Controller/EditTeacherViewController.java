package easv.dk.GUI.Controller;
import easv.dk.BE.Teacher;
import easv.dk.GUI.Model.TeacherModel;
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
    private TextField teacherLastName_txt;
    @FXML
    private Button btnSaveUpdateTeacher;
    @FXML
    private Button btnCancelUpdateTeacher;

    private Teacher selectedTeacher;
    TeacherModel teacherModel = new TeacherModel();
    private AdminViewController parentController;

    public void setParentController(AdminViewController adminViewController){
        this.parentController = adminViewController;
    }

    public EditTeacherViewController() throws Exception {
    }

    public void saveUpdateTeacher(ActionEvent actionEvent) throws Exception {
        String teacherFirstName= teacherFirstName_txt.getText();
        String teacherLastName=teacherLastName_txt.getText();
        String teacherEmail = teacherEmail_txt.getText();
        String teacherPassword = teacherPassword_txt.getText();
        Teacher teacherUpdated = new Teacher(teacherFirstName, teacherLastName,teacherEmail,teacherPassword, selectedTeacher.getId());
        teacherModel.saveUpdateTeacher(teacherUpdated);
        Stage stage = (Stage)btnSaveUpdateTeacher.getScene().getWindow();
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
            Stage stage = (Stage) btnCancelUpdateTeacher.getScene().getWindow();
            stage.close();
    }
    }
}
