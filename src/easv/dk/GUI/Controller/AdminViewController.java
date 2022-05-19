package easv.dk.GUI.Controller;

import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
import easv.dk.GUI.Model.StudentModel;
import easv.dk.GUI.Model.TeacherModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;


public class AdminViewController {

    @FXML
    private Button btnAdminLogOut;

    @FXML
    private Button btnOpenCitizenOverview;

    @FXML
    private Button btnOpenAdminEditView;


    public void openTeacherEditView (ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/EditTeacherView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void adminLogOut(ActionEvent actionEvent) throws Exception {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to log out?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnAdminLogOut.getScene().getWindow();
            stage.close();
        }
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/LogInView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Log In");
        stage.centerOnScreen();
        stage.show();
    }

    public void openCitizenOverview(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/CitizenOverview.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Log In");
        stage.centerOnScreen();
        stage.show();
    }
    @FXML
    public void initialize() throws Exception{
      /*  setUpTeacherTable();
        setUpSchoolTable();
        filter();
        */
    }

}
