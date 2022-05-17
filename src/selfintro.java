import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selfintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking browser
		
		//ChromeDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.chrome.driver","D:/Manish/M_Selenium/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//firefox launch
		//geckodriver
		//webdriver.gecko.driver
		//System.setProperty("webdriver.gecko.driver","D:/Manish/M_Selenium/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		//Edge launch
		//geckodriver
		//webdriver.edge.driver
		System.setProperty("webdriver.edge.driver","D:/Manish/M_Selenium/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();

	}

}
