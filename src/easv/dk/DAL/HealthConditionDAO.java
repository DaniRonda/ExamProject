package easv.dk.DAL;
import easv.dk.BE.HealthDiagnose;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HealthConditionDAO {

    ConnectionManager cm;

    public HealthConditionDAO() {
        try {
            cm = new ConnectionManager();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public HealthDiagnose createHealthCondition(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int citizen, int healthtype) throws Exception {
        HealthDiagnose healthDiagnose = null;
        int ID = 0;
        String query = "INSERT INTO HealthDiagnose1 VALUES(?, ?, ?, ?, ?, ?, ?)";

        try(Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, profnote);
            preparedStatement.setString(2, currentass);
            preparedStatement.setString(3, anticipatedlvl);
            preparedStatement.setString(4, followupdate);
            preparedStatement.setString(5, observenote);
            preparedStatement.setInt(6, citizen);
            preparedStatement.setInt(7, healthtype);

            int created = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();

            if (resultSet.next()){
                ID = resultSet.getInt(1);
            }
            if (created != 0){
                healthDiagnose = new HealthDiagnose(ID, profnote, currentass, anticipatedlvl, followupdate, observenote, citizen, healthtype);
            }
        }
        return healthDiagnose;
    }

    public void updateHealthDiagnose(HealthDiagnose healthDiagnose) throws Exception {
        String query =  "UPDATE HealthDiagnose1 SET profnote = ?, currentass = ?, anticipatedlvl = ?, followupdate = ?, observenote = ?, citizen = ?, healthtype = ? WHERE ID = ?";
        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, healthDiagnose.getProfnote());
            preparedStatement.setString(2, healthDiagnose.getCurrentass());
            preparedStatement.setString(3, healthDiagnose.getAnticipatedlvl());
            preparedStatement.setString(4, healthDiagnose.getFollowupdate());
            preparedStatement.setString(5, healthDiagnose.getObservenote());
            preparedStatement.setInt( 6, healthDiagnose.getCitizen());
            preparedStatement.setInt(7, healthDiagnose.getHealthtype());
            preparedStatement.setInt(8, healthDiagnose.getID());

            preparedStatement.executeUpdate();
        }
    }

    public List<HealthDiagnose> getAllHealthDiagnose() throws Exception {
        List<HealthDiagnose> healthDiagnosesArrayList = new ArrayList<>();
        String query = "SELECT * FROM HealthDiagnose1";
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
                int citizen = resultSet.getInt("citizen");
                int healthtype = resultSet.getInt("healthtype");


                HealthDiagnose healthDiagnose = new HealthDiagnose(ID, profnote, currentass, anticipatedlvl, followupdate, observenote,  citizen, healthtype);
                healthDiagnosesArrayList.add(healthDiagnose);
            }
        }
        return healthDiagnosesArrayList;
    }

    public HealthDiagnose getHealthDiagnose(int idHealthDiagnose) throws Exception {
        HealthDiagnose healthDiagnose = null;
        String query =  "SELECT * FROM HealthDiagnose1 WHERE ID = ?";

        try (Connection connection = cm.getConnection()){
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, idHealthDiagnose);
            preparedStatement.execute();

            ResultSet resultSet = preparedStatement.getResultSet();
            if (resultSet.next()){
                int ID = resultSet.getInt("ID");
                String profnote = resultSet.getString("profnote");
                String currentass = resultSet.getString("currentass");
                String anticipatedlvl = resultSet.getString("anticipatedlvl");
                String folowupdate = resultSet.getString("followupdate");
                String observenote = resultSet.getString("observenote");
                int citizen = resultSet.getInt("citizen");
                int healthtype = resultSet.getInt("healthtype");


                healthDiagnose = new HealthDiagnose(ID, profnote, currentass, anticipatedlvl, folowupdate, observenote, citizen, healthtype );
                System.out.println(healthDiagnose);
            }
        }
        return healthDiagnose;
    }

}
