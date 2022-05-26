package easv.dk.BLL;

import easv.dk.DAL.TeacherDAO;

import easv.dk.BE.Teacher;
import java.util.List;

public class TeacherManager {


    TeacherDAO teacherDAO = new TeacherDAO();


    public TeacherManager() throws Exception {
    }

    public Teacher teacherFound(String emails, String password) throws Exception{
        Teacher teacher = teacherDAO.getTeacherLogin(emails, password);
        if (teacher != null) return loginHelper.getInstanceTeacher(teacher);
        else return null;
    }

    public void saveUpdateTeacher(Teacher teacher) throws Exception{
        teacherDAO.saveUpdateTeacher(teacher);
    }

    public void deleteTeacher(Teacher selectedItem) throws Exception{
        teacherDAO.deleteTeacher(selectedItem);
    }

    public List<Teacher> getAllTeachers() throws Exception{
        return this.teacherDAO.getAllTeacher();
    }

    public Teacher createTeacher(Teacher teacher) throws Exception {
        return this.teacherDAO.createTeacher(teacher);
    }
}
