package org.karthi.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/org/karthi/test/Features",
		glue={"stepdefinition"})

public class Runnerclass {

}
