package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="G:\\workspace\\BDDDemoProject\\src\\test\\resources\\features\\",
		glue="stepDefination",
	plugin= {"pretty","html:target/CucumberReports.html"},
                   tags="@login"
                   
		)
public class RunnerTest 
{
	

}
