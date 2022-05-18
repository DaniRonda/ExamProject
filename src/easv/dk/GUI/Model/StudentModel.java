package easv.dk.GUI.Model;

import easv.dk.BE.Admin;
import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
import easv.dk.BLL.Manager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class StudentModel {

    Manager manager = new Manager();
    ObservableList<Student> getAllStudents;

    public StudentModel() throws Exception {
        getAllStudents= FXCollections.observableArrayList();
    }

    public Student studentFound(String emails, String password) throws Exception {
        return manager.studentFound(emails, password);
    }

    public void deleteStudent(Student selectedItem) throws Exception {
        manager.deleteStudent(selectedItem);
    }

    public List<Student> getAllStudents1 () throws Exception{
        this.getAllStudents=FXCollections.observableArrayList();
        this.getAllStudents.addAll(this.manager.getAllStudents());
        return this.getAllStudents;
    }

}
