package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Booking_Confirmation;

public class POManager_Confirmation {
	
    public WebDriver driver;
    
    private Booking_Confirmation bc;
    
    public POManager_Confirmation(WebDriver driver2) {
		this.driver = driver2;
	}

	public Booking_Confirmation getInstanceBooking() {
		
    	if (bc == null) {
    		
    	 bc = new Booking_Confirmation(driver);
    	 
		}
    	
    	return bc;

	}
    
    
    
    
    
}
