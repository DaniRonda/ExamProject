package easv.dk.GUI.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;


public class CaseViewController {

    @FXML
    private Button btnSaveCase;
    @FXML
    private Button btnCancelCreatingCase;



    public void returnToPreviousView (ActionEvent actionEvent) throws Exception {
        Stage thisStage = (Stage) btnSaveCase.getScene().getWindow();
        thisStage.close();

    }


    public void saveCase(ActionEvent actionEvent) throws Exception{

    }

    public void cancelCreatingCase(ActionEvent actionEvent) throws Exception {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) btnCancelCreatingCase.getScene().getWindow();
            stage.close();
        }
    }
    }

