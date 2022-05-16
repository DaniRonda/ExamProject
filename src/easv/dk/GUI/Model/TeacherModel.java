package easv.dk.GUI.Model;

import easv.dk.BE.Admin;
import easv.dk.BE.Teacher;
import easv.dk.BLL.Manager;

public class TeacherModel {
    Manager manager = new Manager();

    public TeacherModel() throws Exception {
    }

    public Teacher teacherFound(String emails, String password) throws Exception {
        return manager.teacherFound(emails, password);
    }
}
