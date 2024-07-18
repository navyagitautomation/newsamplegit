package run;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

//import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\bhask\\eclipse-workspace\\Cucumber\\src\\test\\java\\fea\\data.feature"
		,glue={"step/stepclass"}
		)

public class runclass {

}
