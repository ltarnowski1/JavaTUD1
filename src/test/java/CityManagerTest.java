import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CityManagerTest {

    CityManager cityManager = new CityManager();

    private final static String NAME_1 = "Gdansk";
    private final static String NAME_2 = "Nowa wies";


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
    @Test
    public void checkUpdateCity(){
        City city = new City(NAME_1);

        cityManager.clearCity();
        assertEquals(1, cityManager.addCity(city));

        List<City> c = cityManager.getAllCity();
        City firstC = c.get(0);

        firstC.setName(NAME_2);

        assertEquals(1, cityManager.updateCity(firstC));

        List<City> c1 = cityManager.getAllCity();
        City firstC1 = c1.get(0);

        assertEquals(NAME_2, firstC1.getName());
        assertEquals(firstC1.getIdCity(), firstC1.getIdCity());
        cityManager.clearCity();
    }

    @Test
    public void checkDeleteCity() {
        City city = new City(NAME_1);

        cityManager.clearCity();
        assertEquals(1, cityManager.addCity(city));

        List<City> c = cityManager.getAllCity();
        City firstC = c.get(0);

        assertEquals(1, cityManager.deleteCity(firstC));

    }
}
