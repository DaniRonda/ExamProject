package easv.dk.GUI.Controller;

import easv.dk.GUI.Model.CitizenModel;
import easv.dk.GUI.Model.TeacherModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class TeacherController {

    @FXML
    private TableView citizenTable;
    @FXML
    private Button btnDeleteCitizen;
    @FXML
    private Button btnNewCitizen;
    @FXML
    private Button btnTeacherLogOut;

    public void teacherLogOut(ActionEvent actionEvent) throws Exception {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to log out?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnTeacherLogOut.getScene().getWindow();
            stage.close();
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/LogInView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openNewCitizenView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/NewCitizenView .fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openNewStudentView(ActionEvent actionEvent) {
    }

    public void deleteCitizen(ActionEvent actionEvent) throws Exception {
        CitizenModel.deleteCitizen(citizenTable.getSelectionModel().getSelectedItem());
        citizenTable.getItems().remove(citizenTable.getSelectionModel().getSelectedIndex());
    }
}
