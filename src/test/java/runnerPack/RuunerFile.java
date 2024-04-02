package runnerPack;

//import org.junit.runner.RunWith;


//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="StepDefinitions",
		plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		//plugin="html:target/cucumber.html"
		//plugin={"pretty","json:target/cucumberReports.json"},
		//plugin={"pretty","junit:target/cucumberReports.xml"})
		//dryRun=false,
		monochrome=true)

public class RuunerFile extends AbstractTestNGCucumberTests {
	

}
