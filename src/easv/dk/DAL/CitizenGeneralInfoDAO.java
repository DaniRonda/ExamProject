package easv.dk.DAL;

import easv.dk.BE.Citizen;
import easv.dk.BE.GeneralInfo;
import easv.dk.BE.GeneralInfoCitizen;
import easv.dk.BE.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CitizenGeneralInfoDAO {

    ConnectionManager cm;

    public CitizenGeneralInfoDAO() {
        try {
            cm = new ConnectionManager();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public GeneralInfoCitizen createCatMovie(GeneralInfoCitizen generalInfoCitizen) throws Exception {
        GeneralInfoCitizen generalInfoCitizen1 = new GeneralInfoCitizen(generalInfoCitizen.getCitizen_id(),generalInfoCitizen.getGeneralinfo_id());
        Connection con = cm.getConnection();
        String query = "insert into catmovie (movie_id,category_id) values(?,?);";
        PreparedStatement preparedStatement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);  //to return generated catMovie_id in result
        preparedStatement.setInt(1, generalInfoCitizen.getGeneralinfo_id());
        preparedStatement.setInt(2, generalInfoCitizen.getCitizen_id());
        preparedStatement.execute();        //execute insert query
        ResultSet resultSet = preparedStatement.getGeneratedKeys();     //get generated catMovie_id
        while (resultSet.next()) {
            generalInfoCitizen1.setGeneralinfo_id(generalInfoCitizen.getGeneralinfo_id());        //use input catmovi
            generalInfoCitizen1.setCitizen_id(generalInfoCitizen.getCitizen_id());  //use input cat movie
            generalInfoCitizen1.setInfocitizen_id(resultSet.getInt(1));       //get generated catMovie_id
        }
        resultSet.close();
        preparedStatement.close();
        con.close();

        return generalInfoCitizen1;
    }

    public List<GeneralInfo> getAllCategoriesForGivenCitizen(Citizen citizen) throws Exception {
        List<GeneralInfo> generalInfo = new ArrayList<>();
        Connection con = cm.getConnection();
        String query = "select distinct generalinfo.* from GeneralInfoCitizen \n" +
                "JOIN generalinfo on GeneralInfoCitizen.generalinfo_id=generalinfo.id\n" +
                "where citizen_id=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, citizen.getID());
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            int ID = resultSet.getInt("id");
            String coping = resultSet.getString("coping");
            String motevation = resultSet.getString("motevation");
            String resources = resultSet.getString("resources");
            String roles = resultSet.getString("roles");
            String habits = resultSet.getString("habits");
            String education = resultSet.getString("education");
            String lifestory = resultSet.getString("lifestory");
            String healthinfo = resultSet.getString("healthinfo");
            String aid = resultSet.getString("aid");
            String furnishing = resultSet.getString("furnishing");
            String network = resultSet.getString("network");


            generalInfo.add(new GeneralInfo(ID, coping, motevation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network));
        }
        resultSet.close();
        ps.close();
        con.close();
        return generalInfo;
    }
}
