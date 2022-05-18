package easv.dk.GUI.Controller;

import easv.dk.BE.Admin;
import easv.dk.BLL.Manager;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class EditAdminViewController {
    private AdminViewController parentController;
    public void setParentController(AdminViewController adminViewController){
        this.parentController = adminViewController;
    }
    public TextField adminPassword_txt;
    public TextField adminEmail_txt;
    public Button confirmUpdateAdminBTN;
    public Button cancelUpdateAdminBTN;
    private Admin selectedAdmin;
    Manager manager = new Manager();


    public EditAdminViewController() throws Exception {
    }


    public void cancelUpdateAdmin(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) cancelUpdateAdminBTN.getScene().getWindow();
            stage.close();
        }
    }

    public void confirmUpdateAdmin(ActionEvent actionEvent) throws Exception {
        String adminEmail= adminEmail_txt.getText();
        String adminPassword=adminPassword_txt.getText();
        Admin adminUpdated = new Admin ( selectedAdmin.getId(), adminEmail, adminPassword);
        manager.updateAdmin(adminUpdated);
        Stage stage = (Stage)confirmUpdateAdminBTN.getScene().getWindow();
        stage.close();
        parentController.initialize();
    }
}
