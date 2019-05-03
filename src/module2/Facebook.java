package module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.facebook.com/");
		
		/*
		 //Using ID 
		  driver.findElement(By.id("u_0_j")).sendKeys("Abhresh");
		  driver.findElement(By.id("u_0_l")).sendKeys("Sugandhi");
		
		//Using name
		driver.findElement(By.name("firstname")).sendKeys("Abhresh");
		driver.findElement(By.name("lastname")).sendKeys("Sugandhi");
		driver.findElement(By.name("reg_email__")).sendKeys("0987654321");
		
		//Using Classname
		driver.findElement(By.className("inputtext")).sendKeys("Abhresh");
		driver.findElement(By.className("inputtext")).sendKeys("Sugandhi");
		 */
		
		
		//Using LinkText
		driver.findElement(By.linkText("Forgotten account?")).click();
		
		//driver.navigate().back();
		
		//Using PartialLinkText
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		/*
		 * driver.navigate().back();
		 * 
		 * driver.navigate().forward();
		 */		
		//Using CSS
		//Using TagName
		//Using Xpath


	}

}
