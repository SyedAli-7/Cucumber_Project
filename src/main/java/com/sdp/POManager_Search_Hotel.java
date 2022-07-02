package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Search_Hotel;

public class POManager_Search_Hotel {
	
	public WebDriver driver;
	
	private Search_Hotel sc;
	
	public POManager_Search_Hotel(WebDriver driver2) {
		
		this.driver = driver2;
		
	}

	public Search_Hotel getInstanceSearchHotel() {
		
		if (sc == null) {
			
			sc = new Search_Hotel(driver);
			
		}
	    
		return sc;

	}

}
