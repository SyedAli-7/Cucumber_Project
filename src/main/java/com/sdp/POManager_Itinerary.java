package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Booked_Itinerary;

public class POManager_Itinerary {
	
	public WebDriver driver;
	
	private Booked_Itinerary bi;
	
	public POManager_Itinerary(WebDriver driver2) {
		this.driver = driver2;
	}

	public Booked_Itinerary getInstanceItinerary() {
		
		if (bi == null) {
			
	    bi = new Booked_Itinerary(driver);
	    
		}
		
		return bi;

	}
	
	
	
	
	

}
