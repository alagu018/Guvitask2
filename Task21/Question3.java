package task21;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

public class Question3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();  
		
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement topframe = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(topframe);
		
		int frameCount = driver.findElements(By.tagName("frame")).size();
        System.out.println("Number of frames in top frame: " + frameCount);
		
		WebElement leftframe = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(leftframe);
		
		WebElement lefttag = driver.findElement(By.tagName("body"));
		String lefframetext = lefttag.getText();
		System.out.println("Text present in left frame is : " + lefframetext);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(topframe);
		
		WebElement middleframe = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(middleframe);
		
		WebElement middletag = driver.findElement(By.tagName("body"));
		String middleframetext = middletag.getText();
		System.out.println("Text present in middle frame is : " + middleframetext);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(topframe);
		
		WebElement rightframe = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(rightframe);
		
		WebElement righttag = driver.findElement(By.tagName("body"));
		String rightframetext = righttag.getText();
		System.out.println("Text present in right frame is : " + rightframetext);
		
		driver.switchTo().defaultContent();
		
		WebElement bottomframe = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(bottomframe);
		
		WebElement bottomtag = driver.findElement(By.tagName("body"));
		String bottomframetext = bottomtag.getText();
		System.out.println("Text present in bottom frame is : " + bottomframetext);
	
	}

}

