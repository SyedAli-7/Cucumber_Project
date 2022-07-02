package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Login_Page;

public class POManager_Login_Page {
	
	public WebDriver driver;
	
	private Login_Page lp;
	
	public POManager_Login_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
	}

	public Login_Page getInstanceLogin() {
		
		if (lp == null) {
			
			lp = new Login_Page(driver);	
			
		}
		
		return lp;
		
	}

}
