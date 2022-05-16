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

    public List<Citizen> getAllCitizens() throws Exception {
        return this.citizenDAO.getAllCitzens();
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



    public Admin adminFound(String emails, String password) throws Exception {
        Admin admin = adminDAO.getAdminLogin(emails, password);
        if (admin != null) return loginHelper.getInstance(admin);
        else return null;
    }

    public Student studentFound(String emails, String password) throws Exception {
        Student student = studentDAO.getStudentLogin(emails, password);
        if (student != null) return loginHelper.getInstanceStudent(student);
        else return null;
    }

    public Teacher teacherFound(String emails, String password) throws Exception {
        Teacher teacher = teacherDAO.getTeacherLogin(emails, password);
        if (teacher != null) return loginHelper.getInstanceTeacher(teacher);
        else return null;
    }

    public void updateTeacher(Teacher teacher) throws Exception {
        teacherDAO.updateTeacher(teacher);
    }
}
