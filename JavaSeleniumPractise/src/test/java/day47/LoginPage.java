package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	// Constructor
	LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// Locators
	By txt_username_loc = By.xpath("//div[@class='orangehrm-login-slot']");
	By txt_password_loc = By.xpath("//input[@placeholder='Username']");
	By btn_login_loc = By.xpath("//input[@placeholder='Password']");

	// Action Method
	public void setUserName(String user) {

		driver.findElement(txt_username_loc).sendKeys(user);
	}

	public void setPassword(String pwd) {

		driver.findElement(txt_password_loc).sendKeys(pwd);
	}

	public void clickLogin() {

		driver.findElement(btn_login_loc).click();
		;
	}

}
