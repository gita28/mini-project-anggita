package starter;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/Feature"
)
public class CucumberTestSuite {
}
