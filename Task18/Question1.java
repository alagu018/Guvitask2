package task18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String title = "Facebook – log in or sign up";
		
		String title1 = driver.getTitle();
		
		if (title.equals(title1)) {
			System.out.println("Page redirected successfully");
		}
		
	
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Vicky");
		
		driver.findElement(By.name("lastname")).sendKeys("Vijay");
		
		driver.findElement(By.name("reg_email__")).sendKeys("vickyvijay@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vickyvijay@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("vicky018");
	
		WebElement day = driver.findElement(By.name("birthday_day"));
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select sday = new Select(day);
		Select smonth = new Select(month);
		Select syear = new Select(year);
		
		sday.selectByValue("21");
		smonth.selectByValue("3");
		syear.selectByValue("2001");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
	

		

	}

}
