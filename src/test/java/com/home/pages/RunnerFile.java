package com.home.pages;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"./src/test/resources/Home.feature"},
        glue = {"com.home.pack"},
       // tags = "@smoke",
        dryRun =  false,
       	plugin = { "pretty","html:target/cucumber-reports.html"}
       	)
public class RunnerFile {
	
	
	

}
