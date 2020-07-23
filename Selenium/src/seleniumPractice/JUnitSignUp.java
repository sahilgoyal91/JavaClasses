package seleniumPractice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JUnitSignUp 
{
	ChromeDriver driver;
	@Before
	public void BrowserLaunch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void SignUp()
	{
		WebElement fname = driver.findElement(By.cssSelector("input#u_0_m"));
		fname.sendKeys("Sahil");
		
		WebElement lname = driver.findElement(By.cssSelector("input[name='lastname']"));
		lname.sendKeys("Goyal");
		
		WebElement mob = driver.findElement(By.cssSelector("input[name='reg_email__']"));
		mob.sendKeys("0123456789");
		
		WebElement pass = driver.findElement(By.cssSelector("input#password_step_input"));
		pass.sendKeys("MrIndia@");
		
		WebElement day_dd = driver.findElement(By.cssSelector("select#day"));
		Select s = new Select(day_dd);
		s.selectByIndex(5);
		
		WebElement month_dd = driver.findElement(By.cssSelector("select#month"));
		Select s1 = new Select(month_dd);
		s1.selectByValue("8");
		
		WebElement year_dd = driver.findElement(By.cssSelector("select#year"));
		Select s2 = new Select(year_dd);
		s2.selectByVisibleText("1990");
		
		WebElement gender = driver.findElement(By.cssSelector("input#u_0_7"));
		gender.click();
		
		WebElement submit_button = driver.findElement(By.cssSelector("button[type='submit']"));
		submit_button.click();
		
	}
	@After
	public void CloseBrowser()
	{
		driver.close();
	}


}
