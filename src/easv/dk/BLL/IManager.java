package easv.dk.BLL;

import easv.dk.BE.Citizen;
import easv.dk.BE.Student;
import easv.dk.GUI.Controller.LogInViewController;

import java.util.List;

public interface IManager {
    void addCitizenToStudent(Citizen selectedItem, Student selectedStudent) throws Exception;

    public String getLogInPassword() throws Exception;

    String getLogInEmail() throws Exception;

    public void removeStudentFromCitizen (int studentId, int citizenId) throws Exception;

    public List<Citizen> getCitizensFromStudent(Student student) throws Exception;

    public List<Student> getStudentFromCitizen(Citizen citizen) throws Exception;
}
