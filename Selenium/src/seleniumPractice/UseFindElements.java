package seleniumPractice;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UseFindElements 
{
	public static void dropdown_menu(WebElement element, int index)
	{
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
		gender.click();
		
		WebElement signup_btn = driver.findElement(By.xpath("//button[@name='websubmit']"));
		signup_btn.click();
		
		List<WebElement> text_boxes = driver.findElements(By.xpath("//div[@id = 'reg_form_box']//*[contains(@class,'inputtext')]"));
		for(WebElement i : text_boxes)
		{
			if(i.isDisplayed())
			{
				System.out.println(i.getAttribute("name"));
				i.sendKeys("Sahil");
			}
		}
		
		List<WebElement> dropdownList = driver.findElements(By.xpath("//select[contains(@name,'birthday_')]"));
		for(WebElement j : dropdownList)
		{
			if(j.isDisplayed())
			{
				String dtitle = j.getAttribute("title");
				System.out.println(dtitle);
				if(dtitle.equals("Day"))
				{
					dropdown_menu(j, 29);
				}
				if(dtitle.equals("Month"))
				{
					dropdown_menu(j, 7);
				}
				if(dtitle.equals("Year"))
				{
					dropdown_menu(j, 29);
				}
			}
		}
	}

}
