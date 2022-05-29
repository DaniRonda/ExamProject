package easv.dk.BLL;

import easv.dk.DAL.DALFacade;
import easv.dk.DAL.IDataAccess;
import easv.dk.DAL.StudentDAO;
import easv.dk.BE.Student;

import java.util.List;

public class StudentManager {

    private IDataAccess dataAccess;

    public StudentManager() throws Exception { dataAccess= DALFacade.getInstance(); }

    public Student studentFound(String emails, String password) throws Exception{
        Student student = dataAccess.getStudentLogin(emails, password);
        if (student != null) return loginHelper.getInstanceStudent(student);
        else return null;
    }

    public void saveUpdateStudent(Student student) throws Exception{
        dataAccess.saveUpdateStudent(student);
    }

    public void deleteStudent(Student selectedItem) throws Exception{
        dataAccess.deleteStudent(selectedItem);
    }

    public List<Student> getAllStudents() throws Exception{
        return this.dataAccess.getAllStudents();
    }

    public Student createStudent(String firstName,String lastName, String email, String password) throws Exception {
        dataAccess.createStudent(firstName, lastName, email, password);
        return null;

    }

}
