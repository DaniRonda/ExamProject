package easv.dk.BLL;

import easv.dk.DAL.StudentDAO;
import easv.dk.BE.Student;

import java.util.List;

public class StudentManager {

    StudentDAO studentDAO = new StudentDAO();

    public StudentManager() throws Exception {
    }

    public Student studentFound(String emails, String password) throws Exception{
        Student student = studentDAO.getStudentLogin(emails, password);
        if (student != null) return loginHelper.getInstanceStudent(student);
        else return null;
    }

    public void updateStudent(Student student) throws Exception{
        studentDAO.updateStudent(student);
    }

    public void deleteStudent(Student selectedItem) throws Exception{
        studentDAO.deleteStudent(selectedItem);
    }

    public List<Student> getAllStudents() throws Exception{
        return this.studentDAO.getAllStudent();
    }

    public Student createStudent(Student student) throws Exception {
        return studentDAO.CreateStudent(student);
    }
}
