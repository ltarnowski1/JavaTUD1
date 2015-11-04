import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by £ukasz on 2015-11-04.
 */
public class CityManagerTest {

    CityManager cityManager = new CityManager();

    private final static String NAME_1 = "Gdansk";

    @Test
    public void checkConnection(){
        assertNotNull(cityManager.getConnection());
    }

    @Test
    public void checkAdding(){

        City city = new City(NAME_1);

        cityManager.clearCity();
        assertEquals(1,cityManager.addCity(city));

        List<City> cities = cityManager.getAllCity();
        City cityRetrieved = cities.get(0);

        assertEquals(NAME_1, cityRetrieved.getName());

    }
}
