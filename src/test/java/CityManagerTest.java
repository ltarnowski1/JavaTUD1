import org.junit.Test;

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

}
