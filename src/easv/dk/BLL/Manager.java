package easv.dk.BLL;

import easv.dk.BE.Admin;
import easv.dk.BE.Citizen;
import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
import easv.dk.DAL.AdminDAO;
import easv.dk.DAL.CitizenDAO;
import easv.dk.DAL.StudentDAO;
import easv.dk.DAL.TeacherDAO;
import easv.dk.GUI.Controller.LogInController;

import java.sql.SQLException;
import java.util.List;

public class Manager {

    AdminDAO adminDAO = new AdminDAO();
    CitizenDAO citizenDAO = new CitizenDAO();
    StudentDAO studentDAO = new StudentDAO();
    TeacherDAO teacherDAO = new TeacherDAO();


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
}
