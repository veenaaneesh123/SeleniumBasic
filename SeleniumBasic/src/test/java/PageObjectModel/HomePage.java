package PageObjectModel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.ExcelUtility;
import Utility.PageUtilities;

public class HomePage {

WebDriver driver;

PageUtilities obj;

public HomePage(WebDriver driver)

{

this.driver=driver;

PageFactory.initElements( driver,this);

obj = new PageUtilities(driver);

}

@FindBy(xpath = "//*[@id='collapsibleNavbar']/ul/li[2]/a")

public WebElement inputform;

@FindBy(id="single-input-field")

public WebElement textbox;

@FindBy(id="button-one")

public WebElement button;

@FindBy(id="message-one")

public WebElement getvalue;

@FindBy(xpath="//*[@id=\"value-a\"]")

public WebElement textbox1;

@FindBy(xpath="//*[@id=\"value-b\"]")

public WebElement textbox2;

@FindBy(xpath="//*[@id=\"button-two\"]")

public WebElement GetTotalButton;

@FindBy(id="message-two")

public WebElement getvalues;

public void inputFormlick()

{

inputform.click();

}

public void messageVerification() throws IOException

{
	
	

inputform.click();

//textbox.sendKeys("hello");
textbox.sendKeys(ExcelUtility.readIntData(0, 1));//to call from excel

obj.screenshot();

button.click();

}

public void addition()

{

textbox1.sendKeys("20");

textbox2.sendKeys("30");

GetTotalButton.click();

}

public String returntextvalue()

{

return getvalue.getText();

}

public String returnGetvalue()

{

return getvalues.getText();

}

}