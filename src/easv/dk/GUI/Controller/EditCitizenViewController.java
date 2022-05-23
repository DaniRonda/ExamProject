package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;
import easv.dk.BLL.CitizenManager;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.Date;

import java.time.LocalDate;

public class EditCitizenViewController {
    public TextField citizenFirstName_txt;
    public TextField citizenLastName_txt;
    public TextField citizenAddress_txt;
    public DatePicker citizenBirthDatePicker;
    public TextField citizenPhoneNumber_txt;
    public Button confirmUpdateStudentBTN;
    public Button cancelUpdateStudentBTN;
    private Citizen selectedCitizen;
    CitizenManager citizenManager = new CitizenManager();

    public EditCitizenViewController() throws Exception {
    }

    //Problems with getting the value for the BirthDate.
    /*public void confirmUpdateCitizen(ActionEvent actionEvent) throws Exception {
        String citizenFirstName= citizenFirstName_txt.getText();
        String citizenLastName= citizenLastName_txt.getText();
        String citizenAddress = citizenAddress_txt.getText();
        Date citizenBirthDate = citizenBirthDatePicker.get();
        int citizenPhoneNumber = citizenPhoneNumber_txt.getProperties().size();
        Citizen citizenUpdated = new Citizen(citizenFirstName,citizenLastName,citizenAddress,citizenBirthDate, citizenPhoneNumber, selectedCitizen.isTemplate(), selectedCitizen.getSchoolID(), selectedCitizen.getID());
        citizenManager.updateCitizen(citizenUpdated);
        Stage stage = (Stage)confirmUpdateStudentBTN.getScene().getWindow();
        stage.close();

    }*/
}
