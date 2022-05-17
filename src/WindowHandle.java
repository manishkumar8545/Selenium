import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Manish/M_Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//a[class='blinkingText']
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set <String> windows=driver.getWindowHandles(); // Parent id, Child Id
		Iterator<String>it= windows.iterator();
		String CildId = it.next();
		driver.switchTo().window(CildId);
		
	}

}
