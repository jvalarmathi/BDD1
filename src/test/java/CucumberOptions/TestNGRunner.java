package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\Lenovo\\eclipse-workspace\\BDDTesting\\src\\test\\java",glue="StepDefinitions",dryRun=true,monochrome=true,tags="@Login or @Signup",plugin={"pretty","html:target/cucumber.html","json:target/cucumber2.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
