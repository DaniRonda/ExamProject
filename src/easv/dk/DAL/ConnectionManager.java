package easv.dk.DAL;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;


public class ConnectionManager {
    private final SQLServerDataSource ds;
    private static ConnectionManager instance;

    public ConnectionManager()
    {
        ds = new SQLServerDataSource();
        ds.setServerName("10.176.111.31");
        ds.setDatabaseName("ExamTest_1");
        ds.setPortNumber(1433);
        ds.setUser("CSe21B_9");
        ds.setPassword("CSe21B_9");
    }

    public static ConnectionManager getInstance() throws Exception {
        return instance == null ? instance = new ConnectionManager() : instance;
    }

    public static Connection getConnection() throws Exception {
        return getInstance().ds.getConnection();
    }
    public static void main (String[] args) throws Exception {
        ConnectionManager ds = new ConnectionManager();
        try (Connection connection= getConnection()){
            System.out.println("Is it open"+!connection.isClosed());}
    }
}