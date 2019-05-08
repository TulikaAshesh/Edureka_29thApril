package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		// PageLoad
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// SetScript Timeout
		driver.manage().timeouts().setScriptTimeout(90, TimeUnit.SECONDS);

		driver.findElement(By.name("userName")).sendKeys("tutorial");// 10
		driver.findElement(By.name("password")).sendKeys("tutorial");// 10
		driver.findElement(By.name("login")).click();// 10

		driver.findElement(By.linkText("PROFILE")).click();// 10

		driver.close();

	}

}
