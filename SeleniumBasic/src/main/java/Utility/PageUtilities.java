package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class PageUtilities {
	WebDriver driver;
	Alert objalert;
	Actions act;
	Date currentdate;

	public PageUtilities(WebDriver driver)

	{

	this.driver=driver;

	}

	public void scrolltoElement(WebElement element) {

	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);

	}
	public void click(WebElement element)
	{	
		try {
		element.click();
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}
	public void enterText(WebElement element,String value)
	{
		//try
		//{
		element.sendKeys(value);
		//}catch(Exception e)
		//{
			//e.printStackTrace();
			
	//	}
	}
	
	public String gettextValue(WebElement element)
	{
		return element.getText();
	}
	
	public String alert(WebDriver driver,String actions,String value) throws InterruptedException
	{
		 String text = null;
		try {
       objalert=driver.switchTo().alert();
      
		switch (actions) 
		{
		case "accept":
						objalert.accept();
						Thread.sleep(2000);
						break;
		case "dismiss":
						objalert.dismiss();
						Thread.sleep(2000);
						break;
        case "sendkeys":
			            objalert.sendKeys(value);
			            Thread.sleep(2000);
			            break;
        case "gettext":
        				text = objalert.getText();
        				return text;
        
		default:
						break;
		}
		}catch(Exception e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
		return text;
		 
	}

	public String allActions(WebElement element,String actions,String value) throws InterruptedException
	{
      
       String text = null;
		switch (actions) 
		{
		case "click":
						element.click();
						Thread.sleep(2000);
						break;
		
        case "sendkeys":
			            element.sendKeys(value);
			            Thread.sleep(2000);
			            break;
        case "gettext":
        				text = element.getText();
        
		default:
						break;
						
		}
		 return text;
	}
public void dragDropActions(WebDriver driver,WebElement from,WebElement to)

{
	act=new Actions(driver);
	act.dragAndDrop(from, to).build().perform();
	
}

public void screenshot() throws IOException {
	currentdate=new Date();
	String test=currentdate.toString().replace("","-").replace(":","");
	System.out.println(currentdate);
	TakesScreenshot scrShot =((TakesScreenshot)driver);

	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

    File DestFile=new File("C:\\Users\\Aneesh\\eclipse-workspace\\SeleniumBasic\\src\\test\\resources\\screenshot"+test+".png");
	                //Copy file at destination

    FileUtils.copyFile(SrcFile, DestFile);
	}

//public void windowHandling(WebDriver driver)

//{
	//String parentWindow=driver.getWindowHandle();
	//handle=new 
//}

	
}






