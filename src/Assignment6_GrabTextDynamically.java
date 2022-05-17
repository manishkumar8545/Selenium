import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6_GrabTextDynamically {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Manish\\M_Selenium\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[value='option2']")).click();
		String grabtext = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(grabtext);
		Thread.sleep(2000);
		WebElement Dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select (Dropdown);
		s.selectByVisibleText(grabtext);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='name']")).sendKeys(grabtext);
		Thread.sleep(2000);
		driver.findElement(By.id("alertbtn")).click();
		String alerttext = driver.switchTo().alert().getText();
		if (alerttext.contains(grabtext))
		{
			System.out.println("Congratulations! Your grabbed text is matched successfully");
		}
		else
		System.out.println("Grabbed text is not matching, please check your code");

		
	}
}
