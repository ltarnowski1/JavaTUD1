import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by �ukasz on 2015-11-04.
 */
public class CityManager
{

    private Connection connection;

    private String url = "jdbc:hsqldb:hsql://localhost/workdb";

    private String createTableCity = "CREATE TABLE City(idCity int PRIMARY KEY GENERATED BY DEFAULT AS IDENTITY, Name varchar(20))";

    private PreparedStatement addCityStmt;
    private PreparedStatement deleteAllCityStmt;
    private PreparedStatement getAllCityStmt;

    private Statement statement;

    public CityManager()
    {
        try {
            connection = DriverManager.getConnection(url);
            statement = connection.createStatement();

            ResultSet rs = connection.getMetaData().getTables(null, null, null,
                    null);
            boolean tableExists = false;
            while (rs.next()) {
                if ("City".equalsIgnoreCase(rs.getString("TABLE_NAME"))) {
                    tableExists = true;
                    break;
                }
            }

            if (!tableExists)
                statement.executeUpdate(createTableCity);

            addCityStmt = connection
                    .prepareStatement("INSERT INTO City (Name) VALUES (?)");
            deleteAllCityStmt = connection
                    .prepareStatement("DELETE FROM City");
            getAllCityStmt = connection
                    .prepareStatement("SELECT idCity, Name FROM City");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    Connection getConnection() {
        return connection;
    }

    void clearCity() {
        try {
            deleteAllCityStmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int addCity(City city) {
        int count = 0;
        try {
            addCityStmt.setString(1, city.getName());

            count = addCityStmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public List<City> getAllCity() {
        List<City> cities = new ArrayList<City>();

        try {
            ResultSet rs = getAllCityStmt.executeQuery();

            while (rs.next()) {
                City c = new City();
                c.setIdCity(rs.getInt("id"));
                c.setName(rs.getString("name"));
                cities.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;


    }

}