package A_002_jdbc;

import java.sql.SQLException;

public class AirportDao extends BaseDao {

    public void addAirport(Airport airport) {

        try {
            getConnection();
            connection.setAutoCommit(false);
            String sql = "insert into Airport values (?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.executeQuery(sql);
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(connection, ps, result);
        }

    }
}
