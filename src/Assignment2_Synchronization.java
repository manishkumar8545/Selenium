import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2_Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/Manish/M_Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait (driver, Duration.ofSeconds(5));
		String[] itemsNeeded = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[7]/p/b[1]/i")).getText());
		String Username = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[7]/p/b[1]/i")).getText();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(Username);	
		String Password = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[7]/p/b[2]/i")).getText();
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);
		//Click on admin radio button
		driver.findElement(By.xpath("//div/div/label[1]")).click();
		//Click on ok in alert button
		//driver.findElement(By.cssSelector("button[id='okayBtn']")).click();
		//driver.switchTo(). (By.xpath("//*[@id=\"okayBtn\"]")).click();
		WebElement dd = driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		Select dropdown = new Select(dd);
		dropdown.selectByValue("consult");
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		driver.findElement(By.id("signInBtn")).click();
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-shop/div/div/div/table/tbody/tr[3]/td[5]/button")).click();
		
	}
		
		public static void addItems(WebDriver driver, String[] itemsNeeded) 
		{
			int j = 0;
			List<WebElement> products = driver.findElements(By.cssSelector("h4.card-title"));
			for (int i = 0; i < products.size(); i++) 
			{
				String name = products.get(i).getText();
				//String formattedName = name[0].trim();
		
				List itemsNeededList = Arrays.asList(itemsNeeded);
				if (itemsNeededList.contains(name))
				{
					j++;
					// click on Add to cart
					driver.findElements(By.xpath("/html/body/app-root/app-shop/div/div/div[2]/app-card-list/app-card[1]/div/div[2]/button")).get(i).click();
					if (j == itemsNeeded.length)
					{
						break;
					}
				}
			}
		
	}

}
