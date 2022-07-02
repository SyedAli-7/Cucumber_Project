package com.stepdefinition;

import com.Maven_Project_Cucumber.Baseclass;
import com.properties.File_Reader_Manager;
import com.sdp.POManager_Login_Page;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Baseclass{
	
	public static POManager_Login_Page pom = new POManager_Login_Page(driver);
	
	@Given("^User must launch the url$")
	public void user_must_launch_the_url() throws Throwable {
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		urlLaunch(url);
	  
	}

	@When("^User enter the username in the username field$")
	public void user_enter_the_username_in_the_username_field() throws Throwable {
	    
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		passInput(pom.getInstanceLogin().getUsername(), username);
		
	}

	@When("^User enter the password in the password field$")
	public void user_enter_the_password_in_the_password_field() throws Throwable {
	   
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passInput(pom.getInstanceLogin().getPassword(), password);
		
	}

	@Then("^User click the login button and it navigates to the search hotel page$")
	public void user_click_the_login_button_and_it_navigates_to_the_search_hotel_page() throws Throwable {
	  
		clickElement(pom.getInstanceLogin().getLogin());
		
	}
	
}
