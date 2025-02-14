package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Features",
glue={"org.stepdefinition","org.hooks"},
monochrome=true,
dryRun=false,
publish=true,
tags="@myntra",
snippets = SnippetType.CAMELCASE,
plugin= {"pretty",
		"html:Reports/report.html",
        "json:Reports/cucumber.json",
        "junit:Reports/junit.xml"
})




public class runnerClass {
	

}

