package PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.PageUtilities;

public class AlertModalsPage {

WebDriver driver;

PageUtilities objpage;
AlertModalsPage objalert;//Alert objalert;

public AlertModalsPage(WebDriver driver )

{

this.driver=driver;

PageFactory.initElements(driver,this);

objpage=new PageUtilities(driver);

}

@FindBy(xpath="//*[@id=\"alert-modal\"]")

public WebElement alertmodal;

@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[5]/a")

public WebElement javascript;

@FindBy(xpath="/html/body/section/div/div/div[2]/div[3]/div/div[2]/button")
public WebElement RedButton;

@FindBy(xpath="//*[@id=\"prompt-demo\"]")

public WebElement message;

public void alertModelClick() throws InterruptedException {
	//alertmodal.click();
	//objpage.click(alertmodal);
	objpage.allActions(alertmodal, "click", "");
}


public void javaScriptClick() throws InterruptedException

{
//objpage.click(javascript);	
//javascript.click();
objpage.allActions(javascript, "click", "");

}

public void scrollElement()

{

objpage.scrolltoElement(RedButton);

}

public String ButtonClick1() throws InterruptedException

{
	objpage.click(RedButton);
	objpage.alert(driver, "sendkeys", "hai");
	objpage.alert(driver, "dismiss", "");
	String text=objpage.gettextValue(message);
	return text;

//RedButton.click();

/*Alert objalerts=driver.switchTo().alert();

objalerts.sendKeys("hai");

objalerts.dismiss();

return message.getText();
*/


}

public String ButtonClick2() throws InterruptedException

{
	objpage.click(RedButton);
	objpage.alert(driver, "sendkeys", "hai");
	objpage.alert(driver, "accept", "");
	String text=objpage.gettextValue(message);
/*
RedButton.click();

Alert objalerts=driver.switchTo().alert();

objalerts.sendKeys("hello");

objalerts.accept();

return message.getText();*/
return text;
}


}

