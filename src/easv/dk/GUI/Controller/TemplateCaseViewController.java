package easv.dk.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class TemplateCaseViewController {
    @FXML
    private Text textName;
    @FXML
    private Button buttonReturn;
    @FXML
    private Button buttonLogOut;
    @FXML
    private Button buttonSave;
    @FXML
    private TextArea textAreaCase;

    public void returnTo(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/TemplateView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Log In");
        stage.centerOnScreen();
        stage.show();
        Stage thisStage = (Stage) buttonSave.getScene().getWindow();
        thisStage.close();

    }

    public void logOut(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/LogInView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Log In");
        stage.centerOnScreen();
        stage.show();
        Stage thisStage = (Stage) buttonSave.getScene().getWindow();
        thisStage.close();
    }

    public void saveCase(ActionEvent actionEvent) {

    }
}
