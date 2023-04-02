package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.DriverManager;
import Utility.PageUtilities;

public class CheckBoxPage {
	WebDriver driver;
	PageUtilities objpage;
	public CheckBoxPage(WebDriver driver )
	
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			objpage=new PageUtilities(driver);
		}
	//@FindBy(xpath = "//*[@id='collapsibleNavbar']/ul/li[2]/a")
	//public WebElement inputform;
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[2]")
	public WebElement checkBoxDemo;
	@FindBy(xpath="//*[@id=\"gridCheck\"]")
	public WebElement ClickBox;
	@FindBy(id="message-one")
	public WebElement getValue;
	
	public void CheckBoxDemo() throws InterruptedException
		{
			objpage.click(checkBoxDemo);
			Thread.sleep(2000);
		}
	public void clickCheckBox() throws InterruptedException
		{
			objpage.click(ClickBox);
			Thread.sleep(2000);
		}
	public String getValue() 
		{
			
			return objpage.gettextValue(getValue);
		}
		

	
}
