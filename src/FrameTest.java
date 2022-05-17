import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:/Manish/M_Selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		//driver.findElement(By.cssSelector("div[id='draggable']")).click();	
		Actions a= new Actions(driver);
		WebElement Source = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement Target = driver.findElement(By.cssSelector("div[id='droppable']"));
		a.dragAndDrop(Source, Target).build().perform();
	}

}
