package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task2 {
	
	WebDriver driver;
		@Test
		public void VpQc() {
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://automationexercise.com");
			
			driver.findElement(By.xpath("//a[@href='/products']")).click();
			driver.findElement(By.xpath("//*[@href='/product_details/1']")).click();
			driver.findElement(By.xpath("//input[@id='quantity']")).sendKeys("4");
			driver.findElement(By.xpath("//button[@type='button']")).click();
			driver.quit();
			
	}
}
