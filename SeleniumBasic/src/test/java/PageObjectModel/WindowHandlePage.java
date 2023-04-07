package PageObjectModel;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtilities;

public class WindowHandlePage {
	WebDriver driver;
	PageUtilities objpage;
	
	
	
	public WindowHandlePage(WebDriver driver )
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		objpage=new PageUtilities(driver);
	}
	@FindBy(xpath="/html/body/p/a")
	public WebElement clickHere;
	@FindBy(xpath="/html/body/form/table/tbody/tr[5]/td[2]/input")
	public WebElement childEmail;
	@FindBy(xpath="/html/body/form/table/tbody/tr[6]/td[2]/input")
	public WebElement submitChild;
	
	public void parentWindowHandling() throws InterruptedException
	{	
		objpage.click(clickHere);
		Thread.sleep(2000);
	}
	

public void childWindowHandling() 
{
	String parentWindow=driver.getWindowHandle();		
	Set<String>windows=driver.getWindowHandles();	
	Iterator<String> i1=windows.iterator();		 
	while(i1.hasNext())			
		{		
		 	String ChildWindow=i1.next();		
		    if(!parentWindow.equalsIgnoreCase(ChildWindow))			
		            {    	
		                    driver.switchTo().window(ChildWindow);	                                                                                                           
		                    driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");                			
		                    driver.findElement(By.name("btnLogin")).click();			
		                    driver.close();		
		            }		
		        }		
		            driver.switchTo().window(parentWindow);				
}
}