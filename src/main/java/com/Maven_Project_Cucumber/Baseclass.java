package com.Maven_Project_Cucumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static WebDriver driver;

	// browser launch

	public static WebDriver launchbrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\cdeem\\chromedriver.exe"); 

			driver = new ChromeDriver();

			driver.manage().window().maximize();

		}

		else if (browsername.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\cdeem\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();

		}

		return driver;

	}

	// get

	public static void urlLaunch(String url) {

		driver.get(url);

	}

	// getTitle

	public static void getTitleMethod() {

		String title = driver.getTitle();
		System.out.println(title);

	}

	// close

	public static void closeBrowser() {

		driver.close();

	}

	// sendkeys

	public static void passInput(WebElement element, String input) {

		element.sendKeys(input);

	}

	// click

	public static void clickElement(WebElement element) {

		element.click();

	}

	public static void quitBrowser() {

		driver.quit();

	}

	public static void navigateTo(String url) {

		driver.navigate().to(url);

	}

	public static void navigateBack() {

		driver.navigate().back();

	}

	public static void navigateForward() {

		driver.navigate().forward();

	}

	public static void navigateRefresh() {

		driver.navigate().refresh();

	}

	public static void alertAccept() {

		Alert acceptbutton = driver.switchTo().alert();
		acceptbutton.accept();

	}

	public static void alertDismiss() {

		Alert dismissbutton = driver.switchTo().alert();
		dismissbutton.dismiss();

	}

	public static void alertPrompt(String input) {

		Alert promptbutton = driver.switchTo().alert();
		promptbutton.sendKeys(input);
		promptbutton.accept();

	}

	public static void holdAndRelease(WebElement element1, WebElement element2) {

		Actions act = new Actions(driver);
		act.clickAndHold(element1).release(element2).build().perform();

	}

	public static void dragAndDrop(WebElement element1, WebElement element2) {

		Actions act = new Actions(driver);
		act.dragAndDrop(element1, element2).build().perform();

	}

	public static void moveToElement(WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
		act.click(element).build().perform();

	}

	public static void rightClick(WebElement element) {

		Actions act = new Actions(driver);
		act.contextClick(element).build().perform();

	}

	public static void doubleClick(WebElement element) {

		Actions act = new Actions(driver);
		act.doubleClick(element).build().perform();

	}

	public static void singleFrame(String id) {

		driver.switchTo().frame(id);
		driver.switchTo().defaultContent();

	}

	public static void multiFrame() {

		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();

	}

	public static void robot() throws AWTException {

		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);

	}

	public static void dropdownbyValue(WebElement element, String input) {
		Select sel1 = new Select(element);
		sel1.selectByValue(input);
	}

	public static void dropdownbyIndex(WebElement element, int input) {
		Select sel2 = new Select(element);
		sel2.selectByIndex(input);
	}

	public static void dropdownbyVisibleText(WebElement element, String input) {
		Select sel1 = new Select(element);
		sel1.selectByVisibleText(input);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void sleep(long millisecond) throws InterruptedException {
		Thread.sleep(millisecond);
	}

	public static void radioButton(WebElement element) {
		element.click();
	}

	public static void waits() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void checkbox(WebElement element) {
		element.click();
	}

	public static void takeScreeenshot(String location) throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(location);
		FileHandler.copy(source, destination);
	}

}
