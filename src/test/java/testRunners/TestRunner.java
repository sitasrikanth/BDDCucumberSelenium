package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"stepDefinitions"}, 
monochrome = true,
plugin= {"pretty","html:target/HTMLReports"},
tags="@SmokeTests")
public class TestRunner {

}
