package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class stepclass {

@Given("I want to write a step with precondition")
public void i_want_to_write_a_step_with_precondition() {
    
System.out.println("Hi");}

@And("some other precondition")
public void some_other_precondition() {
	System.out.println("Hi");
}

@When("I complete action")
public void i_complete_action() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Hi");}

@And("some other action")
public void some_other_action() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Hi");}
}
