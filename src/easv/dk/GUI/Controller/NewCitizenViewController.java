package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;
import easv.dk.BLL.CitizenManager;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.util.Date;

public class NewCitizenViewController {

    public TextField createCitizenFirstName_txt;
    public TextField createCitizenLastName_txt;
    public TextField createCitizenAddress_txt;
    public TextField createCitizenPhoneNumber_txt;
    public TextField createCitizenSchoolID_txt;
    public DatePicker createCitizenBirthDatePicker;
    public ChoiceBox createCitizenTemplate_CB;

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
        int createCitizenSchoolID = createCitizenSchoolID_txt.getProperties().size();
        boolean createCitizenTemplate = (boolean) createCitizenTemplate_CB.getValue();
        //Date createCitizenBirthDate = createCitizenBirthDatePicker.
        Citizen citizenCreated = new Citizen(createCitizenFirstName, createCitizenLastName, createCitizenAddress, createCitizenPhoneNumber, createCitizenSchoolID, )
    }*/
}
