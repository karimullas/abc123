package CucumberBasics;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Workspace\\CucumberSampleProjct\\Test.feature",
monochrome = true,
format = {"html:C:\\Users\\Rohan Catconsult\\Desktop\\Report"})
public class CucumberRunner {

}
