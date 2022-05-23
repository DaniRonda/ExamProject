package easv.dk.DAL;

import easv.dk.BE.Admin;
import easv.dk.BE.Citizen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CitizenDAO {
    private static ConnectionManager cm;

    public CitizenDAO() throws Exception {
        cm = new ConnectionManager();
    }



    public List<Citizen> getAllCitizens() throws Exception {
        List<Citizen> citizenList = new ArrayList<>();
        Connection con = cm.getConnection();
        String sqlSelectCitizen = "\n" +
                "select citizen.id,firstName,lastName,address,birthDate,isTemplate,phoneNumber,school_id from Citizen\n" +
                "GROUP by citizen.id,firstname,lastName,address,birthDate,isTemplate,phoneNumber,school_id\n;";    //almost definitly wrong
        PreparedStatement psSelectCitizen = con.prepareStatement(sqlSelectCitizen);
        ResultSet rs = psSelectCitizen.executeQuery();
        while (rs.next()) {
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String address = rs.getString("address");
            Date birthDate = rs.getDate("birthDate");
            boolean isTemplate = rs.getBoolean("isTemplate");
            int phoneNumber = rs.getInt("phoneNumber");
            int schoolID = rs.getInt("school_id");
            int Id = rs.getInt("id");
            Citizen citizen = new Citizen(firstName, lastName, address, birthDate, phoneNumber, isTemplate, schoolID, Id);
            citizenList.add(citizen);
        }
        rs.close();
        psSelectCitizen.close();
        con.close();
        return citizenList;
    }

    public void updateCitizen(Citizen citizen) throws Exception {
        Connection con = cm.getConnection();
        String sqlUpdateCitizen = "UPDATE  Citizen SET firstName=?, lastName=? address=?, phoneNumber=?, schoolID=? WHERE ID=?;";
        PreparedStatement psUpdateCitizen = con.prepareStatement(sqlUpdateCitizen, Statement.RETURN_GENERATED_KEYS);
        psUpdateCitizen.setString(1,citizen.getFirstName());
        psUpdateCitizen.setString(2,citizen.getLastName());
        psUpdateCitizen.setString(3,citizen.getAddress());
        psUpdateCitizen.setInt(4,citizen.getPhoneNumber());
        psUpdateCitizen.setInt(5,citizen.getSchoolID());
        psUpdateCitizen.executeUpdate();
        psUpdateCitizen.close();
        con.close();
    }

    public Citizen createCitizen(Citizen citizen) throws Exception {
        Citizen citizenCreated = null;
        Connection con = cm.getConnection();
        String sqlSelectCitizen = "INSERT INTO Citizen VALUES(?,?,?,?,?,?,?)";
        PreparedStatement psInsertCitizen = con.prepareStatement(sqlSelectCitizen, Statement.RETURN_GENERATED_KEYS);
        psInsertCitizen.setString(1, citizen.getFirstName());
        psInsertCitizen.setString(2, citizen.getLastName());
        psInsertCitizen.setString(3, citizen.getAddress());
        psInsertCitizen.setDate(4, (Date) citizen.getBirthDate());
        psInsertCitizen.setInt(5, citizen.getPhoneNumber());
        psInsertCitizen.setBoolean(6, citizen.isTemplate());
        psInsertCitizen.setInt (7,citizen.getSchoolID());
        psInsertCitizen.addBatch();
        psInsertCitizen.executeBatch();
        ResultSet rs = psInsertCitizen.getGeneratedKeys();
        while (rs.next()) {
            citizenCreated = new Citizen (citizen.getFirstName(),
                    citizen.getLastName(),
                    citizen.getAddress(),
                    citizen.getBirthDate(),
                    citizen.getPhoneNumber(),
                    citizen.isTemplate(),
                    citizen.getSchoolID(),
                    rs.getInt(1)
            );
        }
        return citizenCreated;
    }


    public static void deleteCitizen(Citizen citizen) throws Exception {
        Connection con = cm.getConnection();
        String sqlDeleteCitizen = "DELETE FROM Citizen WHERE ID=?;";
        PreparedStatement psDeleteCitizen = con.prepareStatement(sqlDeleteCitizen, Statement.RETURN_GENERATED_KEYS);
        psDeleteCitizen.setInt(1, citizen.getID());
        psDeleteCitizen.execute();
        psDeleteCitizen.close();
        con.close();
    }
}
