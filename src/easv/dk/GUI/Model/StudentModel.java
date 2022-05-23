package easv.dk.GUI.Model;

import easv.dk.BE.Admin;
import easv.dk.BE.Student;
import easv.dk.BE.Teacher;
import easv.dk.BLL.Manager;
import easv.dk.BLL.StudentManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;

public class StudentModel {

    StudentManager studentManager = new StudentManager();
    ObservableList<Student> getAllStudents;

    public StudentModel() throws Exception {
        getAllStudents= FXCollections.observableArrayList();
    }

    public Student studentFound(String emails, String password) throws Exception {
        return studentManager.studentFound(emails, password);
    }

    public void deleteStudent(Student selectedItem) throws Exception {
        studentManager.deleteStudent(selectedItem);
    }

    public List<Student> getAllStudents1 () throws Exception{
        this.getAllStudents=FXCollections.observableArrayList();
        this.getAllStudents.addAll(this.studentManager.getAllStudents());
        return this.getAllStudents;
    }
    static public int diagnose = 0;


    static public int diagnoseSelected(){
        return diagnose;
    }
}
