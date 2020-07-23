package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpWithXPath 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("Sahil");
		
		WebElement lname = driver.findElement(By.xpath("//*[@name='lastname']"));
		lname.sendKeys("Goyal");
		
		WebElement mobNo = driver.findElement(By.xpath("//input[@id='u_0_r']"));
		mobNo.sendKeys("1234567890");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		pwd.sendKeys("MrIndia!123");
		
		WebElement day_dd = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s = new Select(day_dd);
		s.selectByIndex(29);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s1 = new Select(month);
		s1.selectByValue("7");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1991");
		
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
		gender.click();
		
		WebElement signup_btn = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup_btn.click();
	}

}
