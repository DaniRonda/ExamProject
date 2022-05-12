package easv.dk.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditSchoolViewController {
    public TextField schoolName_txt;
    public Button confirmUpdateSchoolBTN;
    public Button cancelUpdateSchoolBTN;

    public void confirmUpdateSchool(ActionEvent actionEvent) {
    }

    public void cancelUpdateSchool(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) cancelUpdateSchoolBTN.getScene().getWindow();
            stage.close();
        }
    }
}
