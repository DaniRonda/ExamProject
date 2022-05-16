package easv.dk.GUI.Model;

import easv.dk.BE.Admin;
import easv.dk.BE.Student;
import easv.dk.BLL.Manager;

public class StudentModel {
    Manager manager = new Manager();

    public StudentModel() throws Exception {
    }

    public Student studentFound(String emails, String password) throws Exception {
        return manager.studentFound(emails, password);
    }
}
