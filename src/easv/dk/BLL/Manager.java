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

    AdminDAO adminDAO = new AdminDAO();
    CitizenDAO citizenDAO = new CitizenDAO();
    StudentDAO studentDAO = new StudentDAO();
    TeacherDAO teacherDAO = new TeacherDAO();
    CitizenStudentDAO citizenStudentDAO = new CitizenStudentDAO();


    public Manager() throws Exception {
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

    public void addCitizenToStudent(Citizen citizen, Student student) throws Exception {
        citizenStudentDAO.AddCitizenToStudent(citizen, student);
    }
    public void removeStudentFromCitizen (int studentId, int citizenId) throws Exception {
        citizenStudentDAO.removeCitizenFromStudent(new Citizen("", "","",null,0,false,0, citizenId), new Student("", "", "", "", studentId));
    }
    public List<Citizen> getCitizensFromStudent(Student student) throws Exception {
        return citizenStudentDAO.getCitizensFromStudent(student);
    }

    public List<Student> getStudentFromCitizen(Citizen citizen) throws Exception {
        return citizenStudentDAO.getStudentFromCitizen(citizen);
    }

}
