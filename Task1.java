package Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Task1 {
	WebDriver driver;
	@Test
	public void TestCase1(){
//		Launch Browser With the url
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationexercise.com");
		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a")).click();
//		signUp with email
		driver.findElement(By.name("name")).sendKeys("Ramesh");
		driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("slramesh20@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa=\"signup-button\"]")).click();
//		Enter details of the user and create the account
		driver.findElement(By.xpath("//*[@id=\"uniform-id_gender1\"]")).click();
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Ramesh@1207");
		
		driver.findElement(By.xpath("//*[@value='20']")).click();
		driver.findElement(By.xpath("//*[@id='months']/option[4]")).click();
		driver.findElement(By.xpath("//*[@value='2002']")).click();
		
		driver.findElement(By.xpath("//*[@id='newsletter']")).click();
		driver.findElement(By.xpath("//*[@id='optin']"));
		
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Ramesh");
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("S");
		driver.findElement(By.xpath("//*[@name='company']")).sendKeys("Qspiders");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("189/A,1st Street");
		driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("Perumalanchi");
		
		WebElement option = driver.findElement(By.xpath("//*[@name='country']"));
		Select select = new Select(option);
		select.selectByVisibleText("India");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("TamilNadu");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Tirunelveli");
		driver.findElement(By.xpath("//*[@name='zipcode']")).sendKeys("627101");
		driver.findElement(By.xpath("//*[@name='mobile_number']")).sendKeys("7825962115");
		
		driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();
		
		driver.findElement(By.xpath("//*[@data-qa=\"continue-button\"]")).click();
//		delete the Account we created
		driver.findElement(By.xpath("//*[@href=\"/delete_account\"]")).click();
		driver.findElement(By.xpath("//*[@data-qa=\"continue-button\"]")).click();
		driver.quit();		
	}
	
}
