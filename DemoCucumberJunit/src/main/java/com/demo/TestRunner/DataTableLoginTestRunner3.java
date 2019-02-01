package com.demo.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\NewJavaSeleniumWS\\DemoCucumberJunit\\src\\main\\java\\com\\demo\\Features\\UseDataTableLogin.feature",
				 glue="com/demo/stepDefinition3",
				 format= {"pretty", "html:test-output"},
				 monochrome =true,
				 strict = true,
				 dryRun = false
		)
public class DataTableLoginTestRunner3 {

}
