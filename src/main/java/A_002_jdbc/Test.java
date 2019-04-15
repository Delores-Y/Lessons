package A_002_jdbc;

public class Test {

    public static void main(String[] args) {

        AirportDao dao = new AirportDao();
        Airport airport = new Airport();
        airport.setId(0L);
        airport.setCountry("China");
        airport.setComment("Test");
        dao.addAirport(airport);
    }
}
