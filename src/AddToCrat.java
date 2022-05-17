import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCrat
{
	public static void main(String[] args) throws InterruptedException 
	{			
		System.setProperty("webdriver.chrome.driver","D:/Manish/M_Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait (driver, Duration.ofSeconds(5));

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot", "Potato" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		////input[@id='confirmbtn']
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		//explicit wait

 		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		/*String promo = driver.findElement(By.cssSelector("span[class='promoInfo']")).getText();
		System.out.println(promo);
		if (promo.equals("Code applied ..!"))
		{
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		}
		else
		{
			System.out.println("Oops this promo code is not valid");
		}
		
		Simply use thru thread and xpath 
		//click on apply
		driver.findElement(By.xpath("	//*[@id=\"root\"]/div/div/div/div/div/button")).click();
		Thread.sleep(6000);
		//click on place order
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		Thread.sleep(2000);
		//click on country
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")).click();
		Thread.sleep(2000);
		//select country
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select/option[89]")).click();
		Thread.sleep(1000);
		//click on terms & condition
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).click();
		Thread.sleep(1000);
		//click on proceed
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();*/
		
	}
	public static void addItems(WebDriver driver, String[] itemsNeeded) 
	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) 
		{
			// Brocolli, 1 kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format it to get actual vegetable name
			// convert array into array list for easy search
			// check whether name you extracted is present in arrayList or not-
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName))
			{
				j++;
				// click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemsNeeded.length)
				{
					break;
				}
			}
		}

	}

}
