package task22;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Question1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://phptravels.com/demo/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@class='first_name form-control']")).sendKeys("Alagupandi");
		
		driver.findElement(By.xpath("//input[@class='last_name form-control']")).sendKeys("B");
		
		driver.findElement(By.xpath("//input[@class='business_name form-control']")).sendKeys("Cofee shop");
		
		driver.findElement(By.xpath("//input[@class='email form-control']")).sendKeys("alagupandi2001@gmail.com");
		
		//Sum the result
		
		String str1 = driver.findElement(By.id("numb1")).getText();
		
		String str2 = driver.findElement(By.id("numb2")).getText();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int add = num1+num2;
		
		String result = Integer.toString(add);
		
		driver.findElement(By.id("number")).sendKeys(result);
		
		driver.findElement(By.id("demo")).click();
		
		WebElement msg = driver.findElement(By.xpath("//strong[text()=' Thank you!']"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(msg));
		
		//Verification
		
		if(msg.getText().equals("Thank you!")) {
			System.out.println("Form submitted sucessfully");
			}
		
		//Screenshot
		
		TakesScreenshot ss = ((TakesScreenshot) driver);
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\alagu\\eclipse-workspace\\Task16\\Snap\\Task22.png");
		FileUtils.copyFile(source, destination);
		
	}

}
