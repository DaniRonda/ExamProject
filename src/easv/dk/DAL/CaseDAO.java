package easv.dk.DAL;

import easv.dk.BE.Case;
import easv.dk.BE.GeneralInfo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CaseDAO {

    ConnectionManager cm;

    public CaseDAO(){
        try {
            cm = new ConnectionManager();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Case createCase(String caseText, int citizen) throws Exception {
        Case case1 = null;
        int ID = 0;
        String query = "INSERT INTO [Case] VALUES(?, ?)";

        try(Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, caseText);
            preparedStatement.setInt(2, citizen);

            int created = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()){
                ID = resultSet.getInt(1);
            }
            if (created != 0){
                case1 = new Case(ID, caseText, citizen);
            }
        }
        return case1;
    }

    public void updateCase(Case case1) throws Exception {
        String query =  "UPDATE [Case] SET caseText = ?, citizen = ? WHERE ID = ?";
        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, case1.getCasetext());
            preparedStatement.setInt( 2, case1.getCitizen());
            preparedStatement.setInt(3, case1.getID());

            preparedStatement.executeUpdate();
        }
    }

    public List<Case> getAllCases() throws Exception {
        List<Case> caseArrayList = new ArrayList<>();
        String query = "SELECT * FROM [Case]";
        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String casetext = resultSet.getString("casetext");
                int citizen = resultSet.getInt("citizen");



                Case case1 = new Case(ID, casetext, citizen);
                caseArrayList.add(case1);
            }
        }
        return caseArrayList;
    }


    public Case getCase(int idCase) throws Exception {
        Case case2 = null;
        String query =  "SELECT * FROM [Case] WHERE ID = ?";

        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idCase);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            if (resultSet.next()){
                int ID = resultSet.getInt("ID");
                String casetext = resultSet.getString("casetext");
                int citizen = resultSet.getInt("citizen");


                case2 = new Case(ID, casetext, citizen);
                System.out.println(case2);
            }
        }
        return case2;
    }
}

