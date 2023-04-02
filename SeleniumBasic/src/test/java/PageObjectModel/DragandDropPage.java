package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtilities;

public class DragandDropPage {
	WebDriver driver;
	PageUtilities objpage;
	Actions act;
	
	public DragandDropPage(WebDriver driver )
	
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			objpage=new PageUtilities(driver);
		}
	@FindBy(xpath="//*[@id=\"fourth\"]/a")
	public WebElement from;
	@FindBy(xpath="//*[@id=\"amt7\"]")
	public WebElement to;

	public void action() throws InterruptedException {
		/*Actions act=new Actions(driver);
		act.dragAndDrop(from,to).build().perform();  
		Thread.sleep(4000);*/
		
		objpage.dragDropActions(driver, from, to);
		Thread.sleep(2000);
		
	}
}
