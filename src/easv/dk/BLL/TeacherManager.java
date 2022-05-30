package easv.dk.BLL;
import easv.dk.DAL.DALFacade;
import easv.dk.DAL.IDataAccess;
import easv.dk.DAL.TeacherDAO;
import easv.dk.BE.Teacher;
import java.util.List;


public class TeacherManager {


    TeacherDAO teacherDAO = new TeacherDAO();
    private IDataAccess dataAccess;


    public TeacherManager() throws Exception { dataAccess= DALFacade.getInstance(); }

    public Teacher teacherFound(String emails, String password) throws Exception{
        Teacher teacher = dataAccess.getTeacherLogin(emails, password);
        if (teacher != null) return loginHelper.getInstanceTeacher(teacher);
        else return null;
    }

    public void saveUpdateTeacher(Teacher teacher) throws Exception{
        dataAccess.saveUpdateTeacher(teacher);
    }

    public void deleteTeacher(Teacher selectedItem) throws Exception{
        dataAccess.deleteTeacher(selectedItem);
    }

    public List<Teacher> getAllTeachers() throws Exception{
        return this.dataAccess.getAllTeachers();
    }

    public Teacher createTeacher(Teacher teacher) throws Exception {
        return this.dataAccess.createTeacher(teacher);
    }
}
