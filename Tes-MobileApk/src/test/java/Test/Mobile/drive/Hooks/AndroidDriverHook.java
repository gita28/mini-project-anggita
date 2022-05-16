package Test.Mobile.drive.Hooks;

public class AndroidDriverHook {
    @Before
    public void before(){
        AndroidDriverInit.initialize();
    }

    @After
    public void afterDriver(Scenario scenario) {
        if (scenario.isFailed()){
            TakesScreenshot screenshot = AndroidDriverInit.driver;
            byte[] imageByte = screenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(imageByte, "image/png", scenario.getId());
        }
        AndroidDriverInit.quit();
    }
}
