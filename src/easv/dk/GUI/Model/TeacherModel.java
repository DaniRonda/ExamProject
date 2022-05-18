package easv.dk.GUI.Model;

import easv.dk.BE.Admin;
import easv.dk.BE.Teacher;
import easv.dk.BLL.Manager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.SQLException;
import java.util.List;

public class TeacherModel {
    Manager manager = new Manager();
    ObservableList<Teacher> getAllTeachers;

    public TeacherModel() throws Exception {

        getAllTeachers= FXCollections.observableArrayList();
    }

    public Teacher teacherFound(String emails, String password) throws Exception {
        return manager.teacherFound(emails, password);
    }

    public void deleteTeacher(Teacher selectedItem) throws Exception {
        manager.deleteTeacher(selectedItem);
    }

    public List<Teacher> getAllTeachers1 () throws Exception{
        this.getAllTeachers=FXCollections.observableArrayList();
        this.getAllTeachers.addAll(this.manager.getAllTeachers());
        return this.getAllTeachers;
    }

}
