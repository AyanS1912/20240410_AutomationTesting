package Selenium_Testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementTesting {
    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new FirefoxDriver();

        try {
            // Navigate to the provided webpage
//            driver.get("https://www.calculator.net/calorie-calculator.html");

            // ID Locator
//            WebElement searchBarById = driver.findElement(By.id("calcSearchTerm"));

            // Class Name Locator
//            WebElement HomeDivByClassName = driver.findElement(By.className("homelisttile"));

            // Tag Name Locator
//            WebElement bodyTag = driver.findElement(By.tagName("body"));

            // Link Text Locator
//            WebElement sitemapLink = driver.findElement(By.linkText("sitemap"));

            // XPath Locator
//            WebElement MathCalculatorByXPath = driver.findElement(By.xpath("(//SPAN[@class='rbmark'])[2]"));
            
//            WebElement el = driver.findElement(By.id(""))
            driver.get("https://www.calculator.net/");

            
            driver.findElement(By.linkText("Calorie Calculator")).click();

            WebElement el=driver.findElement(By.id("cactivity"));

            Select sl= new Select(el);
            sl.selectByIndex(2);
            
            List<WebElement> l = sl.getOptions();            		
            
            for(int i =0 ; i <l.size() ; i++) {
            	String k =l.get(i).getText();
            	System.out.println(k);
            }
            
            // CSS Selector Locator
//            WebElement searchBarByCss = driver.findElement(By.cssSelector("input[id='calcSearchTerm']"));

            // Partial Link Text Locator
//            WebElement sitemapLinkPartial = driver.findElement(By.partialLinkText("site"));
            
            // Print some information about the elements found
//            System.out.println("Name attribute of the search bar (found by ID): " + searchBarById.getAttribute("name"));
//            System.out.println("Text of the homelisttile class (found by Class Name): " + HomeDivByClassName.getText());
//            System.out.println("Tag name of the body element (found by Tag Name): " + bodyTag.getTagName());
//            System.out.println("URL of the Site Map link (found by Link Text): " + sitemapLink.getAttribute("href"));
//            System.out.println("URL of the All Calculator (found by XPath): " + MathCalculatorByXPath.getAttribute("href"));
            
//            System.out.println("Name attribute of the search bar (found by CSS Selector): " + searchBarByCss.getAttribute("name"));
//            System.out.println("URL of the Site Map link (found by Partial Link Text): " + sitemapLinkPartial.getAttribute("href"));

        } catch (Exception e) {
            e.printStackTrace();
////       
    }
}}
