package TestNgClasses;

import org.testng.annotations.Test;

import PageObjectModel.HomePage;
import Utility.DriverManager;
import Utility.ExcelUtility;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class InitialClass 
{
	WebDriver driver;

	DriverManager obj= new DriverManager();

	//HomePage objHome=new HomePage(driver);HomePage objHome;

	String expectedURL="https://selenium.obsqurazone.com/index.php";

	HomePage objHome;
	
  @Test(priority=1,enabled=true,dataProvider = "data-provider123")
public void valueCheck1(String value) throws InterruptedException, IOException

{//pageobject model with page factory

//HomePage objHome=new HomePage(driver);

objHome.messageVerification(value);//value for dataprovider

String appvaluue=objHome.returntextvalue();

/*WebElement inputForm = driver.findElement(By.xpath("//*[@id='collapsibleNavbar']/ul/li[2]/a"));

inputForm.click();

Thread.sleep(2000);

WebElement textbox = driver.findElement(By.id("single-input-field"));

textbox.sendKeys("Hello");

Thread.sleep(2000);

WebElement button = driver.findElement(By.id("button-one"));

button.click();

Thread.sleep(2000);

WebElement getvalue = driver.findElement(By.id("message-one"));

String appvaluue = getvalue.getText();*/

//Assert.assertEquals(appvaluue, "Your Message : " + ExcelUtility.readIntData(0, 1));"for excel read"
Assert.assertEquals(appvaluue, "Your Message : " + value);
}
  
  
  
  
  @Test(priority = 1,enabled =false)

public void valueCheck2() throws InterruptedException

{

//HomePage obj1Home=new HomePage(driver);

objHome.addition();

String totalvalue=objHome.returnGetvalue();

/*WebElement inputForm1 = driver.findElement(By.xpath("//*[@id='collapsibleNavbar']/ul/li[2]/a"));

inputForm1.click();

Thread.sleep(2000);

WebElement textbox1=driver.findElement(By.xpath("//*[@id=\"value-a\"]"));

textbox1.sendKeys("5");

Thread.sleep(2000);

textbox1.click();

WebElement textbox2=driver.findElement(By.xpath("//*[@id=\"value-b\"]"));

textbox2.sendKeys("5");

textbox1.click();

WebElement GetTotalButton=driver.findElement(By.xpath("//*[@id=\"button-two\"]"));

GetTotalButton.click();

WebElement getvalue = driver.findElement(By.id("message-two"));

String totalvalue = getvalue.getText();*/

if(totalvalue.contains("50"))

	{
	
	Assert.assertTrue(true);
	
	}

else

	{
	
	Assert.fail("comparsion failed");
	
	}

}
  
  @BeforeTest
  public void beforeTest() 
	  {
		  obj.launchBrowser(expectedURL,"chrome");
	
			  this.driver=obj.driver;
	
			  objHome=new HomePage(driver);
	  }

  @AfterTest
  public void afterTest() 
	  {
		  obj.closeBrowser();
	  }
  @DataProvider (name = "data-provider123")
  public Object[][] dpMethod()
  {
	 return new Object[][] {{"First-Value"}, {"Second-Value"}};
  }  
}
