package com.demo.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\NewJavaSeleniumWS\\DemoCucumberJunit\\src\\main\\java\\com\\demo\\Features\\UseMapDataTableLogin.feature",
				 glue="com/demo/stepDefinition4",
				 format= {"pretty", "html:test-output"},
				 monochrome =true,
				 strict = true,
				 dryRun = false,
				// Usage of tags
				 tags= {"~@EndToEndTesting","@DemoTest"}
		)
public class MapDataTableLoginTestRunner4 {
	
	//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
		//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	// Symbol '~' is used to ignore any tag...implement as prefix to any tags
}
