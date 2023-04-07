package TestNgClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.CheckBoxPage;
import PageObjectModel.WindowHandlePage;
import Utility.DriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;

public class WindowHandleCase {
	WebDriver driver;
	WindowHandlePage objhandle;
	DriverManager obj=new DriverManager();
	String expectedURL="https://demo.guru99.com/popup.php";	
  @Test
  public void verifyWindowHandle() throws InterruptedException 
  {
  objhandle.parentWindowHandling();
  objhandle.childWindowHandling();
  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objhandle=new WindowHandlePage(driver);
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
