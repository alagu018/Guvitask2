package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
		//launch the browser
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); //maximize the window
		
		driver.navigate().to("http://google.com");
		
		System.out.println("current url is ");
		
		System.out.println(driver.getCurrentUrl());
		
		//reload the page
		
		driver.navigate().refresh();
		
		//close the browser
		
		//driver.close();
		
	
	

	}

}
