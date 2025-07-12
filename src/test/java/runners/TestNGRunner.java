package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
  glue="stepDefinitions", tags="@SwitchTab or @RadioButtons", plugin={"pretty", "html:target/cucumber.html", "json:target/cucumber.json"} , monochrome=true)
public class TestNGRunner extends AbstractTestNGCucumberTests {

	 @Override
	    @DataProvider(parallel = true) 
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	
}
