package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.guvi.in/sign-in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String email = "pandi018@outlook.com" ;
		
		driver.findElement(By.id("email")).sendKeys("pandi018@outlook.com");
		
		driver.findElement(By.id("password")).sendKeys("Alagu@2001");
		
		driver.findElement(By.id("login-btn")).click();
		
		driver.findElement(By.className("gravatar")).click();
		
		String actualemail = driver.findElement(By.xpath("//small[@class='email-wrap text-secondary']")).getText();
		
		if (actualemail .equals(email)) {
			System.out.println("Logged in successfully");
		}
		
		driver.close();
		
		
		
		
		
		
		
		
	

	}

}
