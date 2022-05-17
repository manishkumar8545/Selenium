import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/Manish/M_Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("name")).sendKeys("Manish Kumar");
		Thread.sleep(2000);
		
		//With CSS for Email
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("manish.kumar8545@gmail.com");
		
		// - With Xpath for email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manish.kumar8545@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Manish@123");
		
		driver.findElement(By.className("form-check-label")).click();
		
		//driver.findElement(By.id("exampleFormControlSelect1")).click();
		
	
		driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]/option[1]")).click();
		////input[@value='option1']
		
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[6]/div[2]/label")).click();
		
		driver.findElement(By.name("bday")).sendKeys("17/02/1992");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
	}

}
