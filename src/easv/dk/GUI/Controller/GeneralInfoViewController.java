package easv.dk.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;



public class GeneralInfoViewController {

    @FXML
    private Text textName;
    @FXML
    private Button btnCancelUpdateGeneralInfo;
    @FXML
    private Button btnSaveUpdateGeneralInfo;




    public void returnTo(ActionEvent actionEvent) throws Exception {
        Stage thisStage = (Stage) textName.getScene().getWindow();
        thisStage.close();
    }


    public void saveUpdateGeneralInfo(ActionEvent actionEvent) {
    }


    public void cancelUpdateGeneralInfo(ActionEvent actionEvent) throws Exception{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) btnCancelUpdateGeneralInfo.getScene().getWindow();
            stage.close();
        }
    }


}
