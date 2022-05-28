package easv.dk.BLL;

import easv.dk.BE.Admin;
import easv.dk.BE.Citizen;
import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
import easv.dk.DAL.*;
import easv.dk.GUI.Controller.LogInController;

import java.sql.SQLException;
import java.util.List;

public class Manager {

    private IDataAccess dataAccess;


    public Manager() throws Exception {dataAccess= DALFacade.getInstance();
    }

    public String getLogInPassword() throws Exception {
        LogInController logInController = new LogInController();
        String password = logInController.getTextFieldPassword();
        return password;
    }

    public String getLogInEmail() throws Exception {
        LogInController logInController = new LogInController();
        String mail = logInController.getTextFieldMail();
        return mail;
    }

    public void addCitizenToStudent(Citizen selectedItem, Student selectedStudent) throws Exception {
        dataAccess.AddCitizenToStudent(selectedItem, selectedStudent);
    }
    public void removeStudentFromCitizen (int studentId, int citizenId) throws Exception {
        dataAccess.removeCitizenFromStudent(new Citizen("", "","",null,0,false, citizenId), new Student("", "", "", "", studentId));
    }
    public List<Citizen> getCitizensFromStudent(Student student) throws Exception {
        return dataAccess.getCitizenFromStudent(student);
    }

    public List<Student> getStudentFromCitizen(Citizen citizen) throws Exception {
        return dataAccess.getStudentFromCitizen(citizen);
    }

}
