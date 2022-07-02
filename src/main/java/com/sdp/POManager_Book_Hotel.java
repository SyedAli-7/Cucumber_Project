package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Book_A_Hotel;

public class POManager_Book_Hotel {
	
	public WebDriver driver;
	
	private Book_A_Hotel bh;
	
	public POManager_Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
	}

	public Book_A_Hotel getInstanceBookHotel() {
		
		if (bh == null) {
			
	    bh = new Book_A_Hotel(driver);
			
		}
		
		return bh;

	}
	
	
	
	
	

}
