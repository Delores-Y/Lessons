package A_002_jdbc;

import java.sql.SQLException;

public class AirportDao extends BaseDao {

    public void addAirport(Airport airport) {

        try {
            getConnection();
            String sql = "insert into Airport values (?,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setLong(1, airport.getId());
            ps.setString(2, airport.getCountry());
            ps.setString(3, airport.getComment());
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(connection, ps, result);
        }

    }
}
