package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project_Cucumber.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SyedAli\\eclipse-workspace\\Maven_Project_Cucumber\\src\\test\\java\\com\\feature\\Adactin.feature", glue = "com.stepdefinition")
public class Test_Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		
		driver = Baseclass.launchbrowser("chrome");

	}
	
	@AfterClass
	public static void tearDown() {
		
		Baseclass.closeBrowser();

	}
	
}
