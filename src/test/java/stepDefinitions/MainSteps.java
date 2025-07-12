package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PracticePage;
import utils.ConfigReader;
import utils.DriverFactory;

public class MainSteps {

	PracticePage practicePage = new PracticePage(DriverFactory.getDriver());
	
	@When("I click on Open Tab")
	public void i_click_on_open_tab() throws InterruptedException {
		practicePage.clickOpenTab();
	}

	@Then("I switch to the new tab")
	public void i_switch_to_the_new_tab() throws InterruptedException {
		practicePage.switchToNewTab();
		
		
	}

	@Then("the tab URL should contain email")
	public void the_tab_url_should_contain() {
	    practicePage .validateEmail();
	}

	@Then("I close the tab and return to parent")
	public void i_close_the_tab_and_return_to_parent() {
		practicePage.closeTab();
	}
	
	@When("I click on {string}")
	public void i_click_on(String string) {

		practicePage.selectButton(string);
	}
	
	@Then("I switch to the new window")
	public void i_switch_to_the_new_window() {
	   
		practicePage.switchToNewWindow();
		  
	}
	
	@Then("the window title should contain {string}")
	public void the_window_title_should_contain(String string) {
		
	     practicePage.getWindowTitle();
	    
	}
	
	@Then("I close the new window and return to parent")
	public void i_close_the_new_window_and_return_to_parent() {
	  
		practicePage.switchToParentWindow();
	}
	
	
	
	@Given("I navigate to the automation practice page")
	public void i_navigate_to_the_automation_practice_page() {
	    // Write code here that turns the phrase above into concrete actions
  
	    System.out.println("I navigate to the automation practice page");
	}
	
	@When("I select {string} option")
	public void i_select_option(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		practicePage.selectRadioOption(string);
	
	}
	
	@Then("{string} should be selected")
	public void should_be_selected(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		practicePage.isRadioOptionSelected(string);
	}
	
	

	
}
