package seleniumPractice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YoutubeVideo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		
		List<WebElement> videos = driver.findElements(By.id("video-title"));
		System.out.println("Total videos are: " + videos.size());
		
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.COMMAND).click(videos.get(0)).keyUp(Keys.COMMAND).build().perform();
		
		//String current_window = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String s : allwindows)
		{
			driver.switchTo().window(s);
		}
	}
	
}
