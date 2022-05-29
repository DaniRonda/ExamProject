package easv.dk.GUI.Model;
import easv.dk.BE.Teacher;
import easv.dk.BLL.TeacherManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.List;

public class TeacherModel {
    TeacherManager teacherManager = new TeacherManager();
    ObservableList<Teacher> getAllTeachers;

    public TeacherModel() throws Exception {

        getAllTeachers= FXCollections.observableArrayList();
    }

    public Teacher teacherFound(String emails, String password) throws Exception {
        return teacherManager.teacherFound(emails, password);
    }

    public void deleteTeacher(Teacher selectedItem) throws Exception {
        teacherManager.deleteTeacher(selectedItem);
    }

    public List<Teacher> getAllTeachers1 () throws Exception{
        this.getAllTeachers=FXCollections.observableArrayList();
        this.getAllTeachers.addAll(this.teacherManager.getAllTeachers());
        return this.getAllTeachers;
    }

    public void saveUpdateTeacher(Teacher teacherUpdated) throws Exception {
        teacherManager.saveUpdateTeacher(teacherUpdated);
    }
}
