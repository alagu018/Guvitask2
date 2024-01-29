package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate the url
		driver.navigate().to("https://www.demoblaze.com/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		if(driver.getTitle().equals("STORE")){
			System.out.println("Page landed on correct website");
			
		}
		else {
			System.out.println("Page not landed on correct website");
		}
			
		

	}

}
