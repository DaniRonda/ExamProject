package easv.dk.DAL;

import easv.dk.BE.Citizen;
import easv.dk.BE.CitizenStudent;
import easv.dk.BE.Student;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CitizenStudentDAO {
    ConnectionManager cm;

    public CitizenStudentDAO() {
        try {
            cm = new ConnectionManager();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createCitizenStudent(List<CitizenStudent> list) throws Exception {
        Connection con = cm.getConnection();

        String sql = "INSERT INTO citizenStudent (citizen_id, student_id) VALUES (?,?)";
        PreparedStatement statement = con.prepareStatement(sql);

        for (CitizenStudent cS : list) {
            statement.setInt(1, cS.getCitizenID());
            statement.setInt(2, cS.getStudentID());
            statement.executeUpdate();
        }
        statement.close();
        con.close();

    }

    public List<CitizenStudent> getAllCitizenStudent() throws Exception {

        ArrayList<CitizenStudent> citizenStudents = new ArrayList<>();
        Connection con = cm.getConnection();

        String sql = "SELECT * FROM citizenStudent;";
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(sql);

        while (rs.next()) {
            int idCit = rs.getInt("citizen_id");
            int idStu = rs.getInt("student_id");
            CitizenStudent citizenStudent = new CitizenStudent(idCit, idStu);
            citizenStudents.add(citizenStudent);
        }
        rs.close();
        statement.close();
        con.close();
        return citizenStudents;
    }


    public CitizenStudent createCitizenStudent(CitizenStudent citizenStudent) throws Exception {
        CitizenStudent citizenStudent1 = new CitizenStudent(citizenStudent.getCitizenID(),citizenStudent.getStudentID());
        Connection con = cm.getConnection();
        String query = "insert into citizenStudent (student_id,citizen_id) values(?,?);";
        PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, citizenStudent.getStudentID());
        ps.setInt(2, citizenStudent.getCitizenID());
        ps.execute();
        ResultSet resultSet = ps.getGeneratedKeys();
        while (resultSet.next()) {
            citizenStudent1.setStudentID(citizenStudent.getStudentID());
            citizenStudent1.setCitizenID(citizenStudent.getCitizenID());
            citizenStudent1.setId(resultSet.getInt(1));
        }
        resultSet.close();
        ps.close();
        con.close();

        return citizenStudent1;
    }

    public List<Student> getStudentFromCitizen(Citizen citizen) throws Exception {
        List<Student> students = new ArrayList<>();
        Connection con = cm.getConnection();
        String query = "select distinct Student.* from citizenStudent \n" +
                "JOIN Student on citizenStudent.student_id=Student.id\n" +
                "where citizen_id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, citizen.getID());
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            String firstName = resultSet.getString("firstName");
            int id = resultSet.getInt("id");
            String lastName = resultSet.getString("lastName");
            String email = resultSet.getString("email");
            String password = resultSet.getString("password");
           Student student = new Student(firstName, lastName, email, password, id);
            students.add(student);
        }
        resultSet.close();
        ps.close();
        con.close();
        return students;
    }


    public void updateCitizenStudent(CitizenStudent citizenStudent) throws Exception {
        Connection con = cm.getConnection();
        String sqlUpdateCitizenStudent = "UPDATE citizenStudent SET citizen_Id=?, student_Id=?, WHERE citizenStudent_id=?;";
        PreparedStatement psUpdateCitizenStudent = con.prepareStatement(sqlUpdateCitizenStudent, Statement.RETURN_GENERATED_KEYS);
        psUpdateCitizenStudent.setInt(1, citizenStudent.getCitizenID());
        psUpdateCitizenStudent.setDouble(2, citizenStudent.getStudentID());
        psUpdateCitizenStudent.setInt(3, citizenStudent.getId());
        psUpdateCitizenStudent.executeUpdate();
        psUpdateCitizenStudent.close();
        con.close();
    }

    public List<Student> getAllStudentsForGivenCitizen(Citizen citizen) throws Exception {
        return getStudentFromCitizen(citizen);
    }

    public List<Citizen> getAllCitizensForGivenStudent(Student student) throws Exception {
        List<Citizen> citizens = new ArrayList<>();
        Connection con = cm.getConnection();
        String query = "select distinct Citizen.* from citizenStudent \n" +
                "JOIN Citizen on citizenStudent.citizen_Id=citizen.id\n" +
                "where student_id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, student.getId());
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            String firstName = resultSet.getString("firstName");
            int ID = resultSet.getInt("id");
            String lastName = resultSet.getString("lastName");
            String address = resultSet.getString("address");
            int phoneNumber = resultSet.getInt("phoneNumber");
            int schoolID = resultSet.getInt("School_id");
            boolean isTemplate = resultSet.getBoolean("isTemplate");
            Date birthdate = resultSet.getDate("birthDate");

            citizens.add(new Citizen(firstName,lastName, address, birthdate ,phoneNumber, isTemplate,schoolID, ID));
        }
        resultSet.close();
        ps.close();
        con.close();
        return citizens;
    }

    public void AddCitizenToStudent(Citizen citizen,Student student) throws Exception {
        List<Citizen> allCitizenForGivenStudent = getAllCitizensForGivenStudent(student);
        if (allCitizenForGivenStudent.contains(citizen))return;
        createCitizenStudent(new CitizenStudent(citizen.getID(),student.getId()));
    }
    public void removeCitizenFromStudent(Citizen citizen, Student student) throws Exception {
        Connection con = cm.getConnection();
        PreparedStatement ps = con.prepareStatement("delete from citizenStudent where citizen_id=? and student_id=?");
        ps.setInt(1,citizen.getID());
        ps.setInt(2,student.getId());
        ps.executeUpdate();
        ps.close();
        con.close();


    }

    public List<Citizen> getCitizensFromStudent(Student student) throws Exception {
        List<Citizen> citizens = new ArrayList<>();
        Connection con = cm.getConnection();
        String query = "select distinct Citizen.* from citizenStudent \n" +
                "JOIN Citizen on citizenStudent.citizen_Id=citizen.id\n" +
                "where student_id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, student.getId());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String address = rs.getString("address");
            java.sql.Date birthDate = rs.getDate("birthDate");
            boolean isTemplate = rs.getBoolean("isTemplate");
            int phoneNumber = rs.getInt("phoneNumber");
            int schoolID = rs.getInt("school_id");
            int ID = rs.getInt("id");
            citizens.add(new Citizen(firstName,lastName,address,birthDate,phoneNumber, isTemplate,schoolID, ID));
        }
        rs.close();
        ps.close();
        con.close();
        return citizens;
    }


}
