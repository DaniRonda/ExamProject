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


    public GeneralInfo createGeneralInfo(String coping, String motevation, String resources, String roles, String habits, String education, String lifestory, String healthinfo, String aid, String furnishing, String network) throws Exception {
        GeneralInfo generalInfo = null;
        int ID = 0;
        String query = "INSERT INTO GeneralInfo VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, coping);
            preparedStatement.setString(2, motevation);
            preparedStatement.setString(3, resources);
            preparedStatement.setString(4, roles);
            preparedStatement.setString(5, habits);
            preparedStatement.setString(6, education);
            preparedStatement.setString(7, lifestory);
            preparedStatement.setString(8, healthinfo);
            preparedStatement.setString(9, aid);
            preparedStatement.setString(10, furnishing);
            preparedStatement.setString(11, network);

            int created = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()){
                ID = resultSet.getInt(1);
            }
            if (created != 0){
                generalInfo = new GeneralInfo(ID, coping, motevation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network);
            }
        }
        return generalInfo;
    }

    public void updateGeneralInfo(GeneralInfo generalInfo) throws Exception {
        String query =  "UPDATE General_Information SET coping = ?, motevation = ?, resources = ?, roles = ?, habits = ?, education = ?, lifestory = ?, healthinfo = ?, aid = ?, furnishing = ?, network = ? WHERE ID = ?";
        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, generalInfo.getCoping());
            preparedStatement.setString(2, generalInfo.getMotevation());
            preparedStatement.setString(3, generalInfo.getResources());
            preparedStatement.setString(4, generalInfo.getRoles());
            preparedStatement.setString(5, generalInfo.getHabits());
            preparedStatement.setString(6, generalInfo.getEducation());
            preparedStatement.setString(7, generalInfo.getLifestory());
            preparedStatement.setString(8, generalInfo.getHealthinfo());
            preparedStatement.setString(9, generalInfo.getAid());
            preparedStatement.setString(10, generalInfo.getFurnishing());
            preparedStatement.setString(11, generalInfo.getNetwork());
            preparedStatement.setInt(12, generalInfo.getID());

            preparedStatement.executeUpdate();
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
        List<GeneralInfo> generalInfolist = new ArrayList<>();
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


            generalInfolist.add(new GeneralInfo(ID, coping, motevation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network));
        }
        resultSet.close();
        ps.close();
        con.close();
        return generalInfolist;
    }
}
