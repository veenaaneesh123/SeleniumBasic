package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtilities;

public class RadioButtonPage {
	WebDriver driver;
	PageUtilities objpage;
	
	public RadioButtonPage(WebDriver driver )
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		objpage=new PageUtilities(driver);
	}
@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[3]/a")
public WebElement radioBtnDemo;
@FindBy(xpath="//*[@id=\"inlineRadio2\"]")
public WebElement femaleClick;
@FindBy(xpath="//*[@id=\"button-one\"]")
public WebElement showValue;
@FindBy(id="message-one")
public WebElement getValues;



public void radioDemo() throws InterruptedException
	{	
		objpage.click(radioBtnDemo);
		Thread.sleep(2000);
	}
public void radiobtnclick() throws InterruptedException
	{
		objpage.click(femaleClick);
		Thread.sleep(2000);
	}
public void showValueclick() throws InterruptedException
	{
		objpage.click(showValue);
		Thread.sleep(2000);
	}
public String getValues() 
	{
		
		return objpage.gettextValue(getValues);
	}
	

}
