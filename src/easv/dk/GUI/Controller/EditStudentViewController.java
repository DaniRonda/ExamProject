package easv.dk.GUI.Controller;

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

    public void confirmUpdateStudent(ActionEvent actionEvent) {
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
