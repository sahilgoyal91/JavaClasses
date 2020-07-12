package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch 
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/sahil/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
