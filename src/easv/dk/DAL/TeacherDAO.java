package easv.dk.DAL;

import easv.dk.BE.Admin;
import easv.dk.BE.Student;
import easv.dk.BE.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAO {


    private static ConnectionManager cm;

    public TeacherDAO() throws Exception {
        cm = new ConnectionManager();
    }

    public Teacher getTeacherLogin(String email, String password) throws Exception {

        Teacher teacherfound = null;
        try(Connection connection = cm.getConnection()) {
            String sqlAdmin = ("SELECT * FROM Teacher WHERE email = ? AND password = ?");
            PreparedStatement preparedStatement = connection.prepareStatement(sqlAdmin);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                int ID = resultSet.getInt("ID");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");
                String emails = resultSet.getString("email");
                String login = resultSet.getString("password");
                System.out.println("admin found");
                teacherfound = new Teacher(firstName, lastName, emails, password, ID);
            }
        }
        catch (Exception e){
            teacherfound = null;
            e.printStackTrace();
        }
        return teacherfound;
    }


    public Teacher createTeacher(Teacher teacher) throws Exception {
        Connection con = cm.getConnection();
        String sqlSelectTeacher = "INSERT INTO Teacher VALUES(?,?,?,?,?)";
        PreparedStatement psInsertTeacher = con.prepareStatement(sqlSelectTeacher, Statement.RETURN_GENERATED_KEYS);
        psInsertTeacher.setString(2, teacher.getFirstName());
        psInsertTeacher.setString(3, teacher.getLastName());
        psInsertTeacher.setString(4, teacher.getEmail());
        psInsertTeacher.setString(5, teacher.getPassword());
        psInsertTeacher.setInt(1,teacher.getId());
        psInsertTeacher.addBatch();
        psInsertTeacher.executeBatch();
        return teacher;
    }

    public List<Teacher> getAllTeacher() throws Exception {
        List<Teacher> teacherList = new ArrayList<>();
        Connection con = cm.getConnection();
        String sqlSelectTeacher = "select teacher.id,firstName, lastName, email,password from Teacher;";
        PreparedStatement psSelectTeacher = con.prepareStatement(sqlSelectTeacher);
        ResultSet rs = psSelectTeacher.executeQuery();
        while (rs.next()) {
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String email = rs.getString("email");
            String password = rs.getString("password");
            int id = rs.getInt("id");
            Teacher teacher = new Teacher (firstName, lastName, email, password, id);
            teacherList.add(teacher);
        }
        rs.close();
        psSelectTeacher.close();
        con.close();
        return teacherList;
    }

    public void updateTeacher(Teacher teacher) throws Exception {
        Connection con = cm.getConnection();
        String sqlUpdateTeacher = "UPDATE  Teacher SET firstName=?, lastName=? , email=?, password=? WHERE ID=?;";
        PreparedStatement psUpdateTeacher = con.prepareStatement(sqlUpdateTeacher, Statement.RETURN_GENERATED_KEYS);
        psUpdateTeacher.setString(1,teacher.getFirstName());
        psUpdateTeacher.setString(2,teacher.getLastName());
        psUpdateTeacher.setString(3,teacher.getEmail());
        psUpdateTeacher.setString(4,teacher.getPassword());
        psUpdateTeacher.setInt(5,teacher.getId());
        psUpdateTeacher.executeUpdate();
        psUpdateTeacher.close();
        con.close();
    }

    public void deleteTeacher(Teacher teacher) throws Exception {
        Connection con = cm.getConnection();
        String sqlDeleteTeacher = "DELETE FROM Teacher WHERE ID=?;";
        PreparedStatement psDeleteTeacher = con.prepareStatement(sqlDeleteTeacher, Statement.RETURN_GENERATED_KEYS);
        psDeleteTeacher.setInt(1, teacher.getId());
        psDeleteTeacher.execute();
        psDeleteTeacher.close();
        con.close();
    }
    
    public Student teacherCreateStudent(Student student) throws Exception {
        Student studentCreated = null;
        Connection con = cm.getConnection();
        String sqlSelectStudent = "INSERT INTO Student VALUES(?,?,?,?,?)";
        PreparedStatement psInsertStudent = con.prepareStatement(sqlSelectStudent, Statement.RETURN_GENERATED_KEYS);
        psInsertStudent.setString(1, student.getFirstName());
        psInsertStudent.setString(2, student.getLastName());
        psInsertStudent.setString(3, student.getEmail());
        psInsertStudent.setString(4, student.getPassword());
        psInsertStudent.setInt(5, student.getId());
        psInsertStudent.addBatch();
        psInsertStudent.executeBatch();
        ResultSet rs = psInsertStudent.getGeneratedKeys();
        while (rs.next()) {
            studentCreated = new Student (student.getFirstName(),
                    student.getFirstName(),
                    student.getEmail(),
                    student.getPassword(),
                    rs.getInt(1)
            );
        }
        return studentCreated;
    }

}
