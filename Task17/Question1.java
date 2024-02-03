package task17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoblaze.com/index.html#");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Laptops")).click();
		
		Thread.sleep(3000);
	
		
		driver.findElement(By.className("hrefch")).click();
		
		driver.findElement(By.linkText("Add to cart")).click();
		
		
		
		

	}

}
