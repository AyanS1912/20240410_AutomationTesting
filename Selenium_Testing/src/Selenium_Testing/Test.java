package Selenium_Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test {
    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new FirefoxDriver();

        try {


//            driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//            
//            WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//            WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
//            
//           
//            Actions actions = new Actions(driver);
//
//            // Perform drag and drop
//            actions.dragAndDrop(draggable, droppable).build().perform();
//
//            System.out.println("Drag and drop completed successfully.");
        	
        	
//          driver.get("https://schooledn.py.gov.in/admission/hsc.html");
////          
//          WebElement School = driver.findElement(By.xpath("//A[@href='#'][text()='Schools']"));
//          WebElement Private = driver.findElement(By.xpath("//A[@href='#'][text()='Private']"));
//          WebElement Aided = driver.findElement(By.xpath("//A[@href='../schools/govtAided.html'][text()='Govt Aided']"));
//        		  
//          Actions actions = new Actions(driver);
//
//
//
//          actions.click(School).perform();//Clcik on School
//          Thread.sleep(2000);
//          
//          actions.moveToElement(Private).click().perform(); // Move to Private button then click it
//          Thread.sleep(2000);
//          
//          actions.moveToElement(Aided).click().perform(); // Move to Aided button then click it
        	
        	
        driver.get("https://www.redbus.in/");
        
        WebElement Account = driver.findElement(By.xpath("(//DIV[@class='rb_main_secondary_item  link'])[2]"));
        WebElement Details = driver.findElement(By.id("ticket_details"));
        
      		  
        Actions actions = new Actions(driver);



        actions.moveToElement(Account).click().perform();//Clcik on Account
        Thread.sleep(2000);
        actions.moveToElement(Details).perform();
        Thread.sleep(2000);
        actions.click(Details).perform();
        
        

        } catch (Exception e) {
            e.printStackTrace();
      
    }
}}
