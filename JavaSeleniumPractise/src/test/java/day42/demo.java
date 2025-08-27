package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize(); // Maximize the browser window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Set implicit wait
		

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String expectedTitle = "OrangeHRM";

		String actualTitle = driver.getTitle();

		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Login successful: " + actualTitle);
		} else {
			System.out.println("Wromg title" + actualTitle);
		}
		
		driver.quit();

	}
}
