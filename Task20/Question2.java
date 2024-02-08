package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.guvi.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.id("name")).sendKeys("Alagupandi B");
		
		driver.findElement(By.id("email")).sendKeys("pandi018@outlook.com");
		
		driver.findElement(By.id("password")).sendKeys("Alagu@2001");
		
		driver.findElement(By.id("mobileNumber")).sendKeys("6383076233");
		
		driver.findElement(By.id("signup-btn")).click();
		



		
		

	}

}
