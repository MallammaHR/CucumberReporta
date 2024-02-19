package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/AppFeature"},
glue ={"com.StepDefination","com.MyHooks"},
tags = "@All",
plugin={"pretty",
			"json:target/MyReports/reports.json",
			"junit:target/MyReports/report.xml"},
			publish =true
			)

public class UberTest 
{

}
