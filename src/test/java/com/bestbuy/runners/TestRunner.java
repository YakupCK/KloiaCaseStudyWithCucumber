package com.bestbuy.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"json:target/cucumber.json",
				  "html:target/default-html-reports",
				  "junit:target/cucumber-reports/Cucumber.xml",
				  "rerun:target/rerun.txt"},
		features = "src/test/resources/features",
		glue = "com/bestbuy/stepdefs",
		dryRun = false,
		tags = "@wip"
)

public class TestRunner {
}
