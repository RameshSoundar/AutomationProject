package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Task4 {
	@Test
	public void SignUp_verification() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@data-qa=\"signup-name\"]")).sendKeys("Ramesh");
		driver.findElement(By.xpath("//*[@data-qa=\"signup-email\"]")).sendKeys("slramesh20@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa=\"signup-button\"]")).click();
		driver.quit();
	}
}
