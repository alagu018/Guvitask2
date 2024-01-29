package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args) {
		
		//Launch the browser
		
		WebDriver driver = new ChromeDriver();
		
		//Navigate the url
		
		driver.navigate().to("https://www.wikipedia.org/");
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.id("toc-History")).click();
		
		String text = driver.findElement(By.xpath("//a[@title=\"History of artificial intelligence\"]")).getText();
		System.out.println("The section title is " + text);
		
		

	}

}
