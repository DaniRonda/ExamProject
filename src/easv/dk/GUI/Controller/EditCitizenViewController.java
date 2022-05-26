package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;
import easv.dk.BE.Student;
import easv.dk.BLL.CitizenManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;


public class EditCitizenViewController {
    @FXML
    private TextField citizenFirstName_txt;
    @FXML
    private TextField citizenLastName_txt;
    @FXML
    private TextField citizenAddress_txt;
    @FXML
    private TextField citizenPhoneNumber_txt;
    @FXML
    private Button btnConfirmUpdateCitizen;
    @FXML
    private Button btnCancelUpdateCitizen;
    @FXML
    private Citizen selectedCitizen;

    CitizenManager citizenManager = new CitizenManager();
    private TeacherController parentController;

    public void setParentController(TeacherController teacherController){
        this.parentController = teacherController;
    }

    public EditCitizenViewController() throws Exception {
    }

    public void confirmUpdateCitizen(ActionEvent actionEvent) throws Exception {
        String citizenFirstName= citizenFirstName_txt.getText();
        String citizenLastName= citizenLastName_txt.getText();
        String citizenAddress = citizenAddress_txt.getText();
        int citizenPhoneNumber = citizenPhoneNumber_txt.getProperties().size();
        Citizen citizenUpdated = new Citizen(citizenFirstName,citizenLastName,citizenAddress, selectedCitizen.getBirthDate(), citizenPhoneNumber, selectedCitizen.isTemplate(), selectedCitizen.getID());
        citizenManager.updateCitizen(citizenUpdated);
        Stage stage = (Stage)btnConfirmUpdateCitizen.getScene().getWindow();
        stage.close();
        parentController.initialize();
    }

    public void cancelUpdateCitizen(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) btnCancelUpdateCitizen.getScene().getWindow();
            stage.close();
        }
    }

    public void setInfo(Citizen selectedItem) {
        selectedCitizen = selectedItem;
        citizenFirstName_txt.setText(selectedItem.getFirstName());
        citizenLastName_txt.setText(String.valueOf(selectedItem.getLastName()));
        citizenAddress_txt.setText(String.valueOf(selectedItem.getAddress()));
        citizenPhoneNumber_txt.setText(String.valueOf(selectedItem.getPhoneNumber()));
    }
}
