package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;
import easv.dk.BLL.CitizenManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class NewCitizenViewController {

    @FXML
    private TextField createCitizenFirstName_txt;
    @FXML
    private TextField createCitizenLastName_txt;
    @FXML
    private TextField createCitizenAddress_txt;
    @FXML
    private TextField createCitizenPhoneNumber_txt;
    @FXML
    private TextField createCitizenSchoolID_txt;
    @FXML
    private DatePicker createCitizenDatePicker;
    @FXML
    private Button confirmCreateCitizenBTN;


    public String[] cbValues = {"True", "False"};
    CitizenManager citizenManager = new CitizenManager();

    private TeacherController parentController;

    public void setParentController(TeacherController teacherController){
        this.parentController = teacherController;
    }

    public NewCitizenViewController() throws Exception {
    }

    public void getDate(ActionEvent actionEvent){
        LocalDate birthDate = createCitizenDatePicker.getValue();
        String formattedDate = birthDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


    }

    public void confirmCreateCitizen(ActionEvent actionEvent) throws Exception {
        String createCitizenFirstName = createCitizenFirstName_txt.getText();
        String createCitizenLastName = createCitizenLastName_txt.getText();
        String createCitizenAddress = createCitizenAddress_txt.getText();
        Date citizenBirthDate = Date.valueOf(createCitizenDatePicker.getValue());
        int createCitizenPhoneNumber = createCitizenPhoneNumber_txt.getProperties().size();
        boolean isTemplate = false;

        Citizen citizenCreated = new Citizen(createCitizenFirstName, createCitizenLastName, createCitizenAddress, citizenBirthDate, createCitizenPhoneNumber, isTemplate, 1 );
        citizenManager.createCitizen(citizenCreated);
        Stage stage = (Stage)confirmCreateCitizenBTN.getScene().getWindow();
        stage.close();
    }
}
