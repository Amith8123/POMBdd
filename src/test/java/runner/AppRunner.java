package runner;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\resources\\features",
		glue= {"stepDef"},
		monochrome=true,
		dryRun=false,
		plugin={"pretty"}
		
		)

public class AppRunner extends AbstractTestNGCucumberTests{

}
