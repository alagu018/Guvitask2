package task21;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		List<String> tabs = new ArrayList<String>(windowhandles);
		
		driver.switchTo().window(tabs.get(1));
		
		String title = driver.getTitle();
		
		if(title.equals("New Window")) {
			
			System.out.println("New window is present");
			
			
		}
		
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		
		String title1 = driver.getTitle();
		
		if(title1.equals("The Internet")) {
			
			
			System.out.println("Original window is active");
			
			
		}
		driver.close();
		
	}

}
