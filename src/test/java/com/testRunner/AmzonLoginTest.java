package com.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/AppFeature/Amazonlogin.feature"},
glue ={"com.StepDefination"},
plugin={"pretty"},
publish =true )
public class AmzonLoginTest
{

}
