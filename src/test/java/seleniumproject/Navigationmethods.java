package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wikipedia.org/");
		String title1 = driver.getTitle();
		
		System.out.println("the title of the page  is : " + title1);
		driver.navigate().to("https://www.selenium.dev/downloads/");
		String title = driver.getTitle();
		System.out.println("the title of the page 2 is :" + title);
		driver.close();
	String URL = driver.getCurrentUrl();
	System.out.println("The url of page navigated back is :" + URL);
	driver.navigate().forward();
	String URL2 = driver.getCurrentUrl();
	System.out.println("The url of page navigated back is :" + URL2);

	}

}
