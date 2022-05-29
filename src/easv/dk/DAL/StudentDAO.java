package easv.dk.DAL;

import easv.dk.BE.Case;
import easv.dk.BE.GeneralInfo;
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


    public Student getStudentLogin(String email, String password) throws Exception {

        Student studentfound = null;
        try(Connection connection = cm.getConnection()) {
            String sqlAdmin = ("SELECT * FROM Student WHERE email = ? AND password = ?");
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
                studentfound = new Student(ID ,firstName, lastName, emails,login );
            }
        }
        catch (Exception e){
            studentfound = null;
            e.printStackTrace();
        }
        return studentfound;
    }

    public Student CreateStudent(String firstName,String lastName, String email, String password) throws Exception {
        Student student = null;
        int ID = 0;
        try (Connection con = cm.getConnection()) {
            String sqlCreateStudent = "INSERT INTO [dbo].[Student]" +
                    "           (" +
                    "           [firstName]" +
                    "           ,[lastName]" +
                    "           ,[email]" +
                    "           ,[password])" +
                    "     VALUES (?,?,?,?)";

            try (PreparedStatement psCreateStudent = con.prepareStatement(sqlCreateStudent, Statement.RETURN_GENERATED_KEYS)) {
                psCreateStudent.setString(1, firstName);
                psCreateStudent.setString(2, lastName);
                psCreateStudent.setString(3, email);
                psCreateStudent.setString(4, password);
                int created = psCreateStudent.executeUpdate();
                ResultSet resultSet = psCreateStudent.getGeneratedKeys();
                if (resultSet.next()){
                    ID = resultSet.getInt(1);
                }
                if (created != 0){
                    student = new Student(ID, firstName, lastName, email, password);
                }
            }
            return student;
        }
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
            Student student = new Student (id, firstName, lastName, email, password);
            studentList.add(student);
        }
        rs.close();
        psSelectStudent.close();
        con.close();
        return studentList;
    }

    public void saveUpdateStudent(Student student) throws Exception {
        Connection con = cm.getConnection();
        String sqlUpdateStudent = "UPDATE  Student SET firstName=?, lastName=?, email=?, password=? WHERE ID=?;";
        PreparedStatement psUpdateStudent = con.prepareStatement(sqlUpdateStudent, Statement.RETURN_GENERATED_KEYS);
        psUpdateStudent.setString(1,student.getFirstName());
        psUpdateStudent.setString(2,student.getLastName());
        psUpdateStudent.setString(3,student.getEmail());
        psUpdateStudent.setString(4,student.getPassword());
        psUpdateStudent.setInt(5,student.getId());
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
