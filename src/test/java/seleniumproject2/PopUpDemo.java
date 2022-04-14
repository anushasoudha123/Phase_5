package seleniumproject2;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
	        // Scroll down until the desired element is visible
	        
	        
	        WebElement e1 = driver.findElement(By.id("win2"));
	        
	        // Write a java script and use class JavascriptExecutor , executeScript(args)
	        // perform scrolling
	        
	        JavascriptExecutor js = ((JavascriptExecutor)driver);
	        
	        js.executeScript("arguments[0].scrollIntoView(true)", e1);
	        
	        e1.click();
	        
	        
	}

}
