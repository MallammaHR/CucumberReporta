package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/AppFeature/Saerch.feature"},
glue ={"com.StepDefination","com.MyHooks"},tags="@All",
plugin={"pretty"})

public class AmazonTest 
{

}
