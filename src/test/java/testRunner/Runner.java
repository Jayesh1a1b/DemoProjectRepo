package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//run same package all feature file
@RunWith(Cucumber.class)
@CucumberOptions(
		features="G:\\workspace\\BDDDemoProject\\src\\test\\resources\\features\\search.feature",
		glue="stepDefination",
		plugin= {"html:target/CucumberReport.html"}
		
		)
public class Runner 
{
	

}
