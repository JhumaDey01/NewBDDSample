package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources//feature//GoogleSearchPage.feature",
		glue = "stepDefs"
		  )
public class MyTestRunner extends AbstractTestNGCucumberTests {
 
  public void f() {
  }
}
