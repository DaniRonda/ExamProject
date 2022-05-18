package easv.dk.GUI.Controller;

import easv.dk.BE.Admin;
import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
import easv.dk.BLL.IManager;
import easv.dk.BLL.Manager;
import easv.dk.GUI.Model.AdminModel;
import easv.dk.GUI.Model.StudentModel;
import easv.dk.GUI.Model.TeacherModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LogInController implements Initializable {

    Manager manager = new Manager();
    AdminModel adminModel = new AdminModel();
    TeacherModel teacherModel = new TeacherModel();
    StudentModel studentModel = new StudentModel();
    @FXML
    private Button BtnCancel;
    @FXML
    private Button ButtonBypass;
    @FXML
    private TextField TextFieldEmail;
    @FXML
    private PasswordField TextFieldPassword = new PasswordField();
    @FXML
    private Button ButtonSignIn;

    public LogInController() throws Exception {
    }


    public void bypassScreen(ActionEvent event) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/StudentView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void cancelLogIn(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Cancel login?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) BtnCancel.getScene().getWindow();
            stage.close();
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }


    public void adminCheck() throws Exception {
        Admin admin = adminModel.adminFound(TextFieldEmail.getText(), TextFieldPassword.getText());
        if(admin != null) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/AdminView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();
        }
        else
            System.out.println("no users");
    }

    public void teacherCheck() throws Exception {
        Teacher teacher = teacherModel.teacherFound(TextFieldEmail.getText(), TextFieldPassword.getText());
        if (teacher != null) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/TeacherView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();
        } else
            System.out.println("no users");
    }

    public void studentCheck() throws Exception {
        Student student = studentModel.studentFound(TextFieldEmail.getText(), TextFieldPassword.getText());
        if (student != null) {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/StudentView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.centerOnScreen();
            stage.show();
        } else
            System.out.println("no users");
    }




        public void signIn (ActionEvent actionEvent) throws Exception {
            adminCheck();
            teacherCheck();
            studentCheck();
            Stage thisStage = (Stage) ButtonSignIn.getScene().getWindow();
            thisStage.close();
        }
        public String getTextFieldPassword () {
            return this.TextFieldPassword.getText();
        }
        public String getTextFieldMail () {
            return this.TextFieldEmail.getText();
        }

    public void bypassScreen1(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/TeacherView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void bypassScreen2(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/AdminView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }
}


