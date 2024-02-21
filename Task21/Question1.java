package task21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/iframe");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.cssSelector("iframe#mce_0_ifr"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.tagName("p")).sendKeys("Hello world");
		
		
		driver.close();
		
		
		
	
		

	}

}
