import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//TestNG is one of the testing framework

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Manish/M_Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.manage().window().maximize();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_SeniorCitizenDiscount']")).isSelected());
		Assert.assertFalse(false);	
		
	//	System.out.println(driver.findElement(By.cssSelector("input[id*='chk_SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*=chk_SeniorCitizenDiscount]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=chk_SeniorCitizenDiscount")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=chk_SeniorCitizenDiscount")).isSelected());
		
		//count the no. of check box
		
		System.out.println(driver.findElements(By.cssSelector("input[type=checkbox]")).size());
		
		
		//drop down with select tab
		
		/*WebElement staticDropdown = driver.findElement(By.id("divpaxinfo"));
		Select dropdown = new Select(staticDropdown);*/
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		// 2 adults
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); 
			i++;
		}*/
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1; i<5; i++ )
		{
			driver.findElement(By.id("hrefIncAdt")).click(); 
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Field enable disable
		//driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its Enabled");
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		
	}

}
