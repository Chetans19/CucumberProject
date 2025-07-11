package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
  glue="stepDefinitions", tags="@SwitchWindow", plugin={"pretty", "html:target/cucumber.html", "json:target/cucumber.json"} , monochrome=true)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
