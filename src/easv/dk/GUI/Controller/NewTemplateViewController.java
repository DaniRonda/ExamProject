package easv.dk.GUI.Controller;
import easv.dk.BE.Case;
import easv.dk.BE.Citizen;
import easv.dk.BE.GeneralInfo;
import easv.dk.BE.Template;
import easv.dk.BLL.CitizenManager;
import easv.dk.BLL.TemplateManager;
import easv.dk.GUI.Model.CitizenModel;
import easv.dk.GUI.Model.StudentModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NewTemplateViewController {


    @FXML
    private TextField createTemplateFirstName_txt;
    @FXML
    private TextField createTemplateLastName_txt;
    @FXML
    private TextField createTemplateAddress_txt;
    @FXML
    private DatePicker createTemplateDatePicker;
    @FXML
    private TextField createTemplatePhoneNumber_txt;
    @FXML
    private Button confirmCreateTemplateBTN;

    CitizenModel citizenModel;
    GeneralInfo generalInfo;
    Case case1;
    Citizen citizen;

    TemplateManager templateManager = new TemplateManager();

    public NewTemplateViewController() throws Exception {
    }

    public void getDate(ActionEvent actionEvent) {
        LocalDate birthDate = createTemplateDatePicker.getValue();
        String formattedDate = birthDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    public void openCaseView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/caseView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openGeneralInfoView1(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/GeneralInfoView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openFunctionalAbilitiesView(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/TemplateHealthConditionView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
        StudentModel.diagnose = 2;
    }

    public void openHealthConditionsView(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/TemplateHealthConditionView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
        StudentModel.diagnose = 1;
    }

    public void confirmCreateTemplate(ActionEvent actionEvent) throws Exception {
        String templateFirstName = createTemplateFirstName_txt.getText();
        String templateLastName = createTemplateLastName_txt.getText();
        String templateAddress = createTemplateAddress_txt.getText();
        Date templateBirthDate = Date.valueOf(createTemplateDatePicker.getValue());
        int templatePhoneNumber = createTemplatePhoneNumber_txt.getProperties().size();
        boolean isTemplate = true;
        Template templateCreated = new Template(templateFirstName, templateLastName, templateAddress, templateBirthDate, templatePhoneNumber, isTemplate, 1);
        templateManager.createTemplate(templateCreated);

        /*String placeholder = "empty";
        int intHolder = 1;
        generalInfo = citizenModel.createGeneralInfo(placeholder, placeholder, placeholder, placeholder, placeholder,
                placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, templateCreated.getID());
        citizenModel.createCase(placeholder, templateCreated.getID());

        for (int i = 1; i<=43; i++){
            int healthtype = i;
            citizenModel.createHealthDiagnose(placeholder, placeholder, placeholder, placeholder, placeholder, templateCreated.getID(), healthtype);
        }
        for (int i = 1; i<=29; i++){
            int functionaltype = i;
            citizenModel.createFunctionalDiagnose(placeholder, placeholder, placeholder, placeholder, placeholder, intHolder, intHolder, placeholder, templateCreated.getID(), functionaltype);
        }
        Stage stage = (Stage)confirmCreateTemplateBTN.getScene().getWindow();
        stage.close();
    }*/
    }
}
