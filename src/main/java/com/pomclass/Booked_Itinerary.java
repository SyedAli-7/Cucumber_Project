package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {

	public WebDriver driver;

	@FindBy(partialLinkText = "Booked Itinerary")
	private WebElement bookeditinerary;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkbox;

	@FindBy(name = "cancelall")
	private WebElement cancel;

	@FindBy(id = "logout")
	private WebElement logout;
	
	public Booked_Itinerary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBookeditinerary() {
		return bookeditinerary;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getLogout() {
		return logout;
	}

}
