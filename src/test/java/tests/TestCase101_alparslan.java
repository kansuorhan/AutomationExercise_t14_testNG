package tests;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase101_alparslan {

    @Test
    public void testDeneme() {
        Driver.getDriver().get(ConfigReader.getProperty("automExerUrl"));
    }

}
