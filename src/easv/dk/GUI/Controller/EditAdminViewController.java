package easv.dk.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EditAdminViewController {
    public TextField adminPassword_txt;
    public TextField adminEmail_txt;
    public Button confirmUpdateAdminBTN;
    public Button cancelUpdateAdminBTN;

    public void confirmUpdateAdmin(ActionEvent actionEvent) {

    }

    public void cancelUpdateAdmin(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) cancelUpdateAdminBTN.getScene().getWindow();
            stage.close();
        }
    }
}
