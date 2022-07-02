package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(name = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement roomnum;
	
	@FindBy(name = "datepick_in")
	private WebElement checkin;

    @FindBy(name = "datepick_out")
    private WebElement checkout;

    @FindBy(name = "adult_room")
    private WebElement adultsroom;
    
    @FindBy(id = "child_room")
    private WebElement childsroom;

    @FindBy(id = "Submit")
    private WebElement search;
    
	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

    public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnum() {
		return roomnum;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultsroom() {
		return adultsroom;
	}

	public WebElement getChildsroom() {
		return childsroom;
	}

	public WebElement getSearch() {
		return search;
	}

}
