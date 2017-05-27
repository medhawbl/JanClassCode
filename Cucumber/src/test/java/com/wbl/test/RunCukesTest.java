package com.wbl.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"src/main/resources/features"},
glue={"com.wbl.stepDefinitions"},
dryRun=false,
tags={"@login"})
public class RunCukesTest {

}
