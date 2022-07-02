package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {

	public WebDriver driver;

	@FindBy(name = "first_name")
	private WebElement frstname;

	@FindBy(name = "last_name")
	private WebElement lstname;

	@FindBy(name = "address")
	private WebElement billaddrs;

	@FindBy(name = "cc_num")
	private WebElement creditcard;

	@FindBy(name = "cc_type")
	private WebElement cardtype;

	@FindBy(name = "cc_exp_month")
	private WebElement expmonth;

	@FindBy(name = "cc_exp_year")
	private WebElement expyear;

	@FindBy(name = "cc_cvv")
	private WebElement cvvnum;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement booknow;
	
	public Book_A_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFrstname() {
		return frstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getBilladdrs() {
		return billaddrs;
	}

	public WebElement getCreditcard() {
		return creditcard;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvvnum() {
		return cvvnum;
	}

	public WebElement getBooknow() {
		return booknow;
	}

}
