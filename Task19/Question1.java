package task19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.guvi.in/register");
		
		driver.manage().window().maximize();
		
		
	    // Full Name field
		
		// ID
		driver.findElement(By.id("name")).sendKeys("Test");
		
		//  Xpath
//		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Test");
		
		//  CSSSelector
//		driver.findElement(By.cssSelector("input#name")).sendKeys("Test");
		
		//  tag name
		List<WebElement> ele = driver.findElements(By.tagName("input"));  
//		
//		for(WebElement str : ele) {
//			
//			String attribute = str.getAttribute("id");
//			
//			if(attribute.equals("name")) {
//				str.sendKeys("Test");
//			}
//		}
		
		
		
		
		//  Email Address field
		
		//  ID
//		driver.findElement(By.id("email")).sendKeys("Test@test.com");
		
		//  Xpath
		driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Test@test.com");
		
		//  CSSSelector
//		driver.findElement(By.cssSelector("input#email")).sendKeys("Test@test.com");
		
		//  Tag name
//		for(WebElement str : ele) {
//			
//			String attribute = str.getAttribute("id");
//			
//			if(attribute.equals("email")) {
//				str.sendKeys("Test@test.com");
//			}
//		}
		
		
			
		
		// 4.  Password field
		
		//  ID
//		driver.findElement(By.id("password")).sendKeys("Test@123");
		
		//  xpath
//		driver.findElement(By.xpath("//input[@class='form-control password-err']")).sendKeys("Test@123");
		
		// CSS Selector
		driver.findElement(By.cssSelector("input#password")).sendKeys("Test@123");
		
		//  Tag name
//		for(WebElement str : ele) {
//			
//			String attribute = str.getAttribute("id");
//			
//			if(attribute.equals("password")) {
//				str.sendKeys("Test@123");
//			}
//		}
		
		
		
		
		
		// 5. Mobile number field
		
		//  ID
//		driver.findElement(By.id("mobileNumber")).sendKeys("1234567890");
		
		// xpath 
//		driver.findElement(By.xpath("//input[@class='form-control countrycode-left']")).sendKeys("1234567890");
		
		// CSS Selector
//		driver.findElement(By.cssSelector("input#mobileNumber")).sendKeys("1234567890");
		
		//  tag name   
		for(WebElement str : ele) {  
			
			String attribute = str.getAttribute("id");  
			
			if(attribute.equals("mobileNumber")) {  
				str.sendKeys("1234567890");
			}
		}
		
		
	}

}
