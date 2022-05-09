package easv.dk.DAL;

import easv.dk.BE.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    private static ConnectionManager cm;

    public StudentDAO() throws Exception {
        cm = new ConnectionManager();
    }


    public Student CreateStudent(Student student) throws Exception {
        Student studentCreated = null;
        Connection con = cm.getConnection();
        String sqlSelectStudent = "INSERT INTO Student VALUES(?,?,?,?)";
        PreparedStatement psInstertStudent = con.prepareStatement(sqlSelectStudent, Statement.RETURN_GENERATED_KEYS);
        psInstertStudent.setString(1, student.getFirstName());
        psInstertStudent.setString(2, student.getLastName());
        psInstertStudent.setString(3, student.getEmail());
        psInstertStudent.setString(4, student.getPassword());
        psInstertStudent.addBatch();
        psInstertStudent.executeBatch();
        ResultSet rs = psInstertStudent.getGeneratedKeys();
        while (rs.next()) {
            studentCreated = new Student(student.getFirstName(),
                    student.getLastName(),
                    student.getEmail(),
                    student.getPassword(),
                    rs.getInt(1)
            );
        }
        return studentCreated;
    }

    public List<Student> getAllStudent() throws Exception {
        List<Student> studentList = new ArrayList<>();
        Connection con = cm.getConnection();
        String sqlSelectStudent = "select student.id,firstName, lastName, email,password from Student;";
        PreparedStatement psSelectStudent = con.prepareStatement(sqlSelectStudent);
        ResultSet rs = psSelectStudent.executeQuery();
        while (rs.next()) {
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String email = rs.getString("email");
            String password = rs.getString("password");
            int id = rs.getInt("id");
            Student student = new Student (firstName, lastName, email, password, id);
            studentList.add(student);
        }
        rs.close();
        psSelectStudent.close();
        con.close();
        return studentList;
    }

    public void updateStudent(Student student) throws Exception {
        Connection con = cm.getConnection();
        String sqlUpdateStudent = "UPDATE  Student SET firstName=?, lastName=? email=?, password=? WHERE ID=?;";
        PreparedStatement psUpdateStudent = con.prepareStatement(sqlUpdateStudent, Statement.RETURN_GENERATED_KEYS);
        psUpdateStudent.setString(1,student.getFirstName());
        psUpdateStudent.setString(2,student.getLastName());
        psUpdateStudent.setString(3,student.getEmail());
        psUpdateStudent.setString(4,student.getPassword());
        psUpdateStudent.executeUpdate();
        psUpdateStudent.close();
        con.close();
    }

    public void deleteStudent (Student student) throws Exception {
        Connection con = cm.getConnection();
        String sqlDeleteStudent = "DELETE FROM Student WHERE ID=?;";
        PreparedStatement psDeleteStudent = con.prepareStatement(sqlDeleteStudent, Statement.RETURN_GENERATED_KEYS);
        psDeleteStudent.setInt(1, student.getId());
        psDeleteStudent.execute();
        psDeleteStudent.close();
        con.close();
    }

}
