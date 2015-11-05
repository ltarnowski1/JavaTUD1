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
    public void checkConnection(){
        assertNotNull(am.getConnection());
    }

    @Test
    public void checkAddAdress(){
        cm.clearCity();
        cm.resetIdCity();
        cm.addCity(c);
        am.deleteAllAdress();
        assertEquals(1, am.addAdress(a));
    }
}
