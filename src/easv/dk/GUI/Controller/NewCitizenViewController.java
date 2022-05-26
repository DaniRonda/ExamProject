package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;
import easv.dk.BLL.CitizenManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.util.Date;

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
    private DatePicker createCitizenBirthDatePicker;
    @FXML
    private ChoiceBox createCitizenTemplate_CB;

    public String[] cbValues = {"True", "False"};
    CitizenManager citizenManager = new CitizenManager();

    private TeacherController parentController;

    public void setParentController(TeacherController teacherController){
        this.parentController = teacherController;
    }

    public NewCitizenViewController() throws Exception {
    }

    public void populateChoiceBox(ChoiceBox createCitizenTemplate_CB) {
        createCitizenTemplate_CB.getItems().addAll(cbValues);
    }

    /*public void confirmCreateCitizen(ActionEvent actionEvent) throws Exception {
        String createCitizenFirstName = createCitizenFirstName_txt.getText();
        String createCitizenLastName = createCitizenLastName_txt.getText();
        String createCitizenAddress = createCitizenAddress_txt.getText();
        int createCitizenPhoneNumber = createCitizenPhoneNumber_txt.getProperties().size();
        boolean createCitizenTemplate = (boolean) createCitizenTemplate_CB.getValue();
        //Date createCitizenBirthDate = createCitizenBirthDatePicker.
        Citizen citizenCreated = new Citizen(createCitizenFirstName, createCitizenLastName, createCitizenAddress, createCitizenPhoneNumber )
    }*/
}
