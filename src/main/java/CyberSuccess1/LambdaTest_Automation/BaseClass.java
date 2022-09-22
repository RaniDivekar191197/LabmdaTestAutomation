package CyberSuccess1.LambdaTest_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void launchBrowsers(String browserName) {
		switch(browserName)
		{
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;

		case "mozilla" :
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;

		case "edge" :
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		
	}
	

}
