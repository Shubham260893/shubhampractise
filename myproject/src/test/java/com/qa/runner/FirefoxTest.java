package com.qa.runner;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"/D:/workspace/myproject/src/test/java/com/qa/feature/freecrm.feature"}
		,glue={"com.qa.feature"}
		,dryRun=false
		,tags={"@Firefox"}		
		
		
		
		)




public class FirefoxTest {

}
