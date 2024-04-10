package Selenium_Testing;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Selenium {
	public static void main( String args[]) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.calculator.net/");
//		driver.findElement(By.id("calcSearchTerm")).sendKeys("Finance");
		driver.findElement(By.xpath("//span[@id='bluebtn']")).click();
		
		System.out.println();
	}
}
