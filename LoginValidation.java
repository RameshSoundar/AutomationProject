package Project;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task3 {	
	String[][] data= {
			{"slramesh20@gmail.com","Ramesh@1207"},
			{"ramesh@gmail.com","ramesh123"}		
	};
	@DataProvider(name = "Logindata")
	public String[][] dataProvider() {
		return data;
	}
	@Test(dataProvider = "Logindata")
	public void Data(String username,String password) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@data-qa='login-email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@data-qa='login-password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		driver.quit();
	}
}
