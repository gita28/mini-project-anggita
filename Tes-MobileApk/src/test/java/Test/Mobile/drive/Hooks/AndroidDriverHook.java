package Test.Mobile.drive.Hooks;

import test.mobile.drive.DriverPool;

import javax.swing.text.html.Option;
import java.util.Optional;

public class AndroidDriverHook {

    public DriverPool driverPool = new DriverPool();


    @After
    public void afterTest(Scenario scenario) {
        quitAndroidDrivers();
    }

    public void quitAndroidDrivers(DriverPool drivers) {
        Optional.ofNullable(drivers.getAndroidDriver()).ifPresent(
                driver -> {
                    driver.quit();
                    drivers.setAndroidDriver(null);

                }


        );
    }

}


