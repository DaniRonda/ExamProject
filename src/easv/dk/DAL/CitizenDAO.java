package easv.dk.DAL;

import easv.dk.BE.Admin;
import easv.dk.BE.Citizen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CitizenDAO {
    private static ConnectionManager cm;

    public CitizenDAO() throws Exception {
        cm = new ConnectionManager();
    }

    public List<Citizen> getAllCitzens() throws Exception {
        List<Citizen> citizenList = new ArrayList<>();
        Connection con = cm.getConnection();
        String sqlSelectMovie = "\n" +
                "select citezen.id,name from Citzen\n" +
                "GROUP by citezen.id,name\n;";    //almost definitly wrong
        PreparedStatement psSelectCitizen = con.prepareStatement(sqlSelectMovie);
        ResultSet rs = psSelectCitizen.executeQuery();
        while (rs.next()) {
            String name = rs.getString("name"); //change later
            Citizen citizen = new Citizen(name);
            citizenList.add(citizen);
        }
        rs.close();
        psSelectCitizen.close();
        con.close();
        return citizenList;
    }
}
