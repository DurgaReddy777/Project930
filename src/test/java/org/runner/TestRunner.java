package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="StepDefinition",plugin= {"pretty","html:Foldername/report/cucumber"})
public class TestRunner {

}
