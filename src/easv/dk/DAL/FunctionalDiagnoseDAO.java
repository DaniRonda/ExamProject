package easv.dk.DAL;

import easv.dk.BE.FunctionalDiagnose;
import easv.dk.BE.HealthDiagnose;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FunctionalDiagnoseDAO {
    ConnectionManager cm;

    public FunctionalDiagnoseDAO() {
        try {
            cm = new ConnectionManager();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public FunctionalDiagnose createFunctionalDiagnose(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int currlvl, int expectedlvl, String wishes, int citizen, int functionaltype) throws Exception {
        FunctionalDiagnose functionalDiagnose = null;
        int ID = 0;
        String query = "INSERT INTO FunctionalDiagnose VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, profnote);
            preparedStatement.setString(2, currentass);
            preparedStatement.setString(3, anticipatedlvl);
            preparedStatement.setString(4, followupdate);
            preparedStatement.setString(5, observenote);
            preparedStatement.setInt(6, currlvl);
            preparedStatement.setInt(7, expectedlvl);
            preparedStatement.setString(8, wishes);
            preparedStatement.setInt(9, citizen);
            preparedStatement.setInt(10, functionaltype);

            int created = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()){
                ID = resultSet.getInt(1);
            }
            if (created != 0){
                functionalDiagnose = new FunctionalDiagnose(ID, profnote, currentass, anticipatedlvl, followupdate, observenote, currlvl, expectedlvl, wishes, citizen, functionaltype);
            }
        }
        return functionalDiagnose;
    }

    public void updateFunctionalDiagnose(FunctionalDiagnose functionalDiagnose) throws Exception {
        String query =  "UPDATE FunctionalDiagnose SET  profnote = ?, currentass = ?, anticipatedlvl = ?, followupdate = ?, observenote = ?, currlvl = ?, expectedlvl = ?, wishes = ?, citizen = ?, functionaltype = ?, WHERE ID = ?";
        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, functionalDiagnose.getProfnote());
            preparedStatement.setString(2, functionalDiagnose.getCurrentass());
            preparedStatement.setString(3, functionalDiagnose.getAnticipatedlvl());
            preparedStatement.setString(4, functionalDiagnose.getFollowupdate());
            preparedStatement.setString(5, functionalDiagnose.getObservenote());
            preparedStatement.setInt( 6, functionalDiagnose.getCurrlvl());
            preparedStatement.setInt( 7, functionalDiagnose.getExpectedlvl());
            preparedStatement.setString(8, functionalDiagnose.getWishes());
            preparedStatement.setInt( 9, functionalDiagnose.getCitizen());
            preparedStatement.setInt(10, functionalDiagnose.getID());
            preparedStatement.setInt(11, functionalDiagnose.getFuctionaltype());

            preparedStatement.executeUpdate();
        }
    }

    public List<FunctionalDiagnose> getAllFunctionalDiagnose() throws Exception {
        List<FunctionalDiagnose> functionalDiagnosesArrayList = new ArrayList<>();
        String query = "SELECT * FROM FunctionalDiagnose";
        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()) {
                int ID = resultSet.getInt("ID");
                String profnote = resultSet.getString("profnote");
                String currentass = resultSet.getString("currentass");
                String anticipatedlvl = resultSet.getString("anticipatedlvl");
                String followupdate = resultSet.getString("followupdate");
                String observenote = resultSet.getString("observenote");
                int currlvl = resultSet.getInt("currlvl");
                int expectedlvl = resultSet.getInt("expectedlvl");
                String wishes = resultSet.getString("wishes");
                int citizen = resultSet.getInt("citizen");
                int functionaltype = resultSet.getInt("functionaltype");


                FunctionalDiagnose functionalDiagnose = new FunctionalDiagnose(ID, profnote, currentass, anticipatedlvl, followupdate, observenote, currlvl, expectedlvl, wishes, citizen, functionaltype);
                functionalDiagnosesArrayList.add(functionalDiagnose);
            }
        }
        return functionalDiagnosesArrayList;
    }

    public FunctionalDiagnose getFunctionalDiagnose(int idFunctionalDiagnose) throws Exception {
        FunctionalDiagnose functionalDiagnose = null;
        String query =  "SELECT * FROM FunctionalDiagnose WHERE ID = ?";

        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idFunctionalDiagnose);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            if (resultSet.next()){
                int ID = resultSet.getInt("ID");
                String profnote = resultSet.getString("profnote");
                String currentass = resultSet.getString("currentass");
                String anticipatedlvl = resultSet.getString("anticipatedlvl");
                String folowupdate = resultSet.getString("folowupdate");
                String observenote = resultSet.getString("observenote");
                int currlvl = resultSet.getInt("currlvl");
                int expectedlvl = resultSet.getInt("expectedlvl");
                String wishes = resultSet.getString("wishes");
                int citizen = resultSet.getInt("citizen");
                int functionaltype = resultSet.getInt("functionaltype");


                functionalDiagnose = new FunctionalDiagnose(ID, profnote, currentass, anticipatedlvl, folowupdate, observenote, currlvl, expectedlvl, wishes, citizen, functionaltype);
                System.out.println(functionalDiagnose);
            }
        }
        return functionalDiagnose;
    }
}
