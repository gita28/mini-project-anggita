package Base;

import Drivers.AndroidDriverPool;
import test.mobile.drive.DriverPool;

import java.time.Duration;

public class BasepageObject {
    public AndroidDriverPool driverpool = new DriverPool();
    public AndroidDriverPool androidDriverPool = new AndroidDriverPool();

    public AndroidDrive getDriver() {
        if (this.driver.getAndroidDriver() == null) {
            this.driver.setAndroidDriver(this.androidDriverPool.create());
        }
        return this.driver.getAndroidDriver();
    }

    public WebDriverWait onWait() {
        return new WebDriverWait(getDriver(), 15);

    }

    public AndroidElement waitUntilClickable(By by) {
        return (AndroidElement) onWait().until(ExpectedConditions.elementToBeClickable(by));
    }

    public AndroidElement waitUntilPresence(By by) {
        return (AndroidElement) onWait().until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public AndroidElement waitUntilVisibel(By by) {
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(by));

    }

    public void onClick(By by) {
        waitUntilClickable(by).click();
    }
    public void onType(By by,CharSequence... keysToSend) {
        waitUntilPresence(by).sendKeys(keysToSend);
    }

    public void clear(By by){
        waitUntilPresence(by).clear();

    }
}













