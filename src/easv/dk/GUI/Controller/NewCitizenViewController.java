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

    CitizenManager citizenManager = new CitizenManager();
    private TeacherController parentController;

    public void setParentController(TeacherController teacherController){
        this.parentController = teacherController;
    }

    public NewCitizenViewController() throws Exception {
    }

    public void confirmCreateCitizen(ActionEvent actionEvent) throws Exception {
        String createCitizenFirstName = createCitizenFirstName_txt.getText();
        String createCitizenLastName = createCitizenLastName_txt.getText();
        String createCitizenAddress = createCitizenAddress_txt.getText();
        int createCitizenPhoneNumber = createCitizenPhoneNumber_txt.getProperties().size();
        int createCitizenSchoolID = createCitizenSchoolID_txt.getProperties().size();
        //Date createCitizenBirthDate = createCitizenBirthDatePicker.getValue().
    }
}
