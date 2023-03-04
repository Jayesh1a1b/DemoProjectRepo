package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//run same package all feature file
@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"html:target/CucumberReport.html"})
public class Runner 
{
	

}
