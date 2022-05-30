package easv.dk.GUI.Controller;
import easv.dk.BE.Citizen;
import easv.dk.BE.Template;
import easv.dk.GUI.Model.CitizenModel;
import easv.dk.GUI.Model.TemplateModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TemplateViewController {
    @FXML
    private Button btnDeleteCitizen;
    @FXML
    private TableView citizenTableTemplateView;
    @FXML
    private Button btnDeleteTemplate;
    @FXML
    private TableView templateTable;
    @FXML
    private Button btnTemplateLogOut;

    TemplateModel templateModel = new TemplateModel();

    CitizenModel citizenModel = new CitizenModel();
    public TemplateViewController() throws Exception {
    }

    @FXML
    public void initialize() throws Exception {
        setupTemplateTable();

    }

    public void deleteCitizenTemplateView(ActionEvent actionEvent) throws Exception {
        citizenModel.deleteCitizen((Citizen)citizenTableTemplateView.getSelectionModel().getSelectedItem());
        citizenTableTemplateView.getItems().remove(citizenTableTemplateView.getSelectionModel().getSelectedIndex());
    }
    public void setupTemplateTable() throws Exception {
        TableColumn<Template, String> column1 = new TableColumn<>("First Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Template, String> column2 = new TableColumn<>("Last Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        TableColumn<Template, String> column3 = new TableColumn<>("Address");
        column3.setCellValueFactory(new PropertyValueFactory<>("address"));
        TableColumn<Template, String> column4 = new TableColumn<>("Birthdate");
        column4.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        TableColumn<Template, String> column5 = new TableColumn<>("Phone Number");
        column5.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        templateTable.getColumns().add(column1);
        templateTable.getColumns().add(column2);
        templateTable.getColumns().add(column3);
        templateTable.getColumns().add(column4);
        templateTable.getColumns().add(column5);

        templateTable.getItems().clear();
        templateTable.getItems().addAll(templateModel.getAllTemplates());
    }
    public void logOutFromTemplateView(ActionEvent actionEvent) throws Exception{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to log out?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnTemplateLogOut.getScene().getWindow();
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

    public void openTeacherView(ActionEvent actionEvent) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/TeacherView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }



    public void openNewTemplateView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/NewTemplateView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("New Template");
        stage.centerOnScreen();
        stage.show();

    }

    public void openEditTemplateView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/EditTemplateView.fxml"));
        Parent root = loader.load();
        EditTemplateViewController control = loader.getController();
        control.setInfo((Template) templateTable.getSelectionModel().getSelectedItem());
        control.setParentController(this);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void deleteTemplate(ActionEvent actionEvent) {
    }


}
