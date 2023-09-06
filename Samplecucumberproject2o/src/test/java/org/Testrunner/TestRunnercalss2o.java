package org.Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sakithyah\\eclipse-workspace\\Samplecucumberproject2o\\Features\\AdactinLogin.feature",
glue="org.Stepdefiniation", dryRun=false,
plugin= {"pretty","html:Report/cucumber"})
public class TestRunnercalss2o {
	

}


