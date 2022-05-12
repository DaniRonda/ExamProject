package easv.dk.GUI.Controller;

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

    public void confirmUpdateTeacher(ActionEvent actionEvent) {
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
