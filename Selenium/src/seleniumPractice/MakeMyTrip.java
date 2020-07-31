package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		
		//driver.findElement(By.xpath("//div[@data-cy='outsideModal']")).click();
		
		Actions act = new Actions(driver);
		
		WebElement from_city = driver.findElement(By.xpath("//input[@id='fromCity']"));
		act.click(from_city).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		String fcity =from_city.getAttribute("id");
		System.out.println(fcity);

		WebElement to_city = driver.findElement(By.xpath("//input[@id='toCity']"));
		act.click(to_city).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		String tcity =to_city.getAttribute("id");
		System.out.println(tcity);

	}

	
}
