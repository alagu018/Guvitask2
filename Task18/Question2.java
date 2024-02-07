package task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement destination = driver.findElement(By.id("droppable"));
		
		String color1 = destination.getCssValue("background-color");
		
		String text1 = destination.getText();
		
		System.out.println("before drop");
		
		System.out.println("Background is " + color1);
		
		System.out.println("Text is " + text1);
		
		Actions mouse = new Actions(driver);
		
		mouse.dragAndDrop(source, destination).perform();
		
		String color2 = destination.getCssValue("background-color");
		
		String text2 = destination.getText();
		
		System.out.println("After drop");
		
		System.out.println("Background is " + color2);
		
		System.out.println("Text is " + text2);
		
		if (color2 != color1 && text2 != text1) {
			System.out.println("Drag and drop is successfull");
			

			
	
		}

		
		
		
		
		
		

	}

}
