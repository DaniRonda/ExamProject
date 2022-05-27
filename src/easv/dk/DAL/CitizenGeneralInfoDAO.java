package easv.dk.DAL;

import easv.dk.BE.Citizen;
import easv.dk.BE.GeneralInfo;
import easv.dk.BE.GeneralInfoCitizen;
import easv.dk.BE.Student;
import jdk.jshell.spi.ExecutionControl;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CitizenGeneralInfoDAO {

    //Citizen citizen1 = new Citizen();
    ConnectionManager cm;

    public CitizenGeneralInfoDAO() {
        try {
            cm = new ConnectionManager();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public GeneralInfo createGeneralInfo(String coping, String motivation, String resources, String roles, String habits, String education, String lifestory, String healthinfo, String aid, String furnishing, String network, int citizen) throws Exception {
        GeneralInfo generalInfo = null;
        int ID = 0;
        String query = "INSERT INTO GeneralInfo VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, coping);
            preparedStatement.setString(2, motivation);
            preparedStatement.setString(3, resources);
            preparedStatement.setString(4, roles);
            preparedStatement.setString(5, habits);
            preparedStatement.setString(6, education);
            preparedStatement.setString(7, lifestory);
            preparedStatement.setString(8, healthinfo);
            preparedStatement.setString(9, aid);
            preparedStatement.setString(10, furnishing);
            preparedStatement.setString(11, network);
            preparedStatement.setInt(12, citizen);

            int created = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()){
                ID = resultSet.getInt(1);
            }
            if (created != 0){
                generalInfo = new GeneralInfo(ID, coping, motivation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network, citizen);
            }
        }
        return generalInfo;
    }

    public void updateGeneralInfo(GeneralInfo generalInfo) throws Exception {
        String query =  "UPDATE Generalinfo1 SET coping = ?, motivation = ?, resources = ?, roles = ?, habits = ?, education = ?, lifestory = ?, healthinfo = ?, aid = ?, furnishing = ?, network = ?, citizen = ? WHERE ID = ?";
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
            preparedStatement.setInt( 12, generalInfo.getCitizen());
            preparedStatement.setInt(13, generalInfo.getID());

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

    public List<GeneralInfo> getAllGeneralInfo() throws Exception {
        List<GeneralInfo> generalInfoArrayList = new ArrayList<>();
        String query = "SELECT * FROM Generalinfo1";
        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String coping = resultSet.getString("coping");
                String motivation = resultSet.getString("motivation");
                String resources = resultSet.getString("resources");
                String roles = resultSet.getString("roles");
                String habits = resultSet.getString("habits");
                String education = resultSet.getString("education");
                String lifestory = resultSet.getString("lifestory");
                String healthinfo = resultSet.getString("healthinfo");
                String aid = resultSet.getString("aid");
                String furnishing = resultSet.getString("furnishing");
                String network = resultSet.getString("network");
                int citizen = resultSet.getInt("citizen");


                GeneralInfo generalInfo = new GeneralInfo(ID, coping, motivation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network, citizen);
                generalInfoArrayList.add(generalInfo);
            }
        }
        return generalInfoArrayList;
    }


    public GeneralInfo getGeneralInfo(int idGeneralInfo) throws Exception {
        GeneralInfo generalInfo = null;
        String query =  "SELECT * FROM Generalinfo1 WHERE ID = ?";

        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idGeneralInfo);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            if (resultSet.next()){
                int ID = resultSet.getInt("ID");
                String coping = resultSet.getString("coping");
                String motivation = resultSet.getString("motivation");
                String resources = resultSet.getString("resources");
                String roles = resultSet.getString("roles");
                String habits = resultSet.getString("habits");
                String education = resultSet.getString("education");
                String lifestory = resultSet.getString("lifestory");
                String healthinfo = resultSet.getString("healthinfo");
                String aid = resultSet.getString("aid");
                String furnishing = resultSet.getString("furnishing");
                String network = resultSet.getString("network");
                int citizen = resultSet.getInt("citizen");


                generalInfo = new GeneralInfo(ID, coping, motivation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network, citizen);
                System.out.println(generalInfo);
            }
        }
        return generalInfo;
    }
}
