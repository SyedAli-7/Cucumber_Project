package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Select_Hotel;

public class POManager_Select_Hotel {
	
	public WebDriver driver;
	
	private Select_Hotel sh;
	
	public POManager_Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
	}

	public Select_Hotel getInstanceSelectHotel() {
		
		if (sh == null) {
		
			sh = new Select_Hotel(driver);
			
		}
		
		return sh;

	}
	
	

}
