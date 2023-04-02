package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager 
{
 public WebDriver driver;

public void launchBrowser(String url,String browser)

{
	if(browser.equals("chrome")) {
		
	
	System.setProperty("webdriver.chome.driver",
			"C://Users//Aneesh//eclipse-workspace//SeleniumBasic//src//main//resources//chromedriver_win32 (1)//chromedriver.exe");
	ChromeOptions onarg=new ChromeOptions();
	onarg.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(onarg);
	driver.manage().window().maximize();
	driver.get(url);
	}
	if(browser.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C://Users//Aneesh//eclipse-workspace//SeleniumBasic//src//main//resources//geckodriver-v0.32.2-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
	
	}
}	
public void closeBrowser()
	{
		driver.close();
	}
	
}