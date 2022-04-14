package seleniumproject2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);	
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@gmail.com");
			driver.findElement(By.xpath("//input[@id='545passwd3242353534']")).sendKeys("passwd@123");
	}

}
