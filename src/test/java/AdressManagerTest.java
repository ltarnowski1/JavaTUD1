import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
/**
 * Created by £ukasz on 2015-11-05.
 */
public class AdressManagerTest {

    CityManager cm = new CityManager();
    AdressManager am = new AdressManager();
    City c = new City("Gdynia");
    Adress a = new Adress(0, "Buraczana", 120);


    @Test
    public void checkConnection() {
        assertNotNull(am.getConnection());
    }

    @Test
    public void checkAddAdress() {
        cm.clearCity();
        cm.resetIdCity();
        cm.addCity(c);
        am.deleteAllAdress();
        assertEquals(1, am.addAdress(a));
        cm.clearCity();
    }

    @Test
    public void checkGetAllCityByAdress()
    {
        cm.resetIdCity();
        am.resetIdAdress();
        cm.addCity(c);
        am.addAdress(a);

        List<City> cl = am.getAllCityByAdress(a);
        City c1 = cl.get(0);

        assertEquals(0, c1.getIdCity());
        assertEquals("Gdynia", c1.getName());
        cm.clearCity();
        am.deleteAllAdress();
    }

    @Test
    public void checkDeleteAllAdressByCity()
    {
        cm.resetIdCity();
        am.resetIdAdress();
        cm.addCity(c);
        am.addAdress(a);

        int count = am.deleteAllAdresByCity(c);

        assertEquals(1, count);

        cm.clearCity();
    }
}
