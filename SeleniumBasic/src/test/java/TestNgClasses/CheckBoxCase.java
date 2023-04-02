package TestNgClasses;

import org.testng.annotations.Test;

import PageObjectModel.CheckBoxPage;
import PageObjectModel.HomePage;
import Utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CheckBoxCase {
	WebDriver driver;
	DriverManager obj=new DriverManager();
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	HomePage objHome;
	CheckBoxPage objCheckBoxPage;
	
  @Test
  public void CheckBoxVerification() throws InterruptedException {
	  objHome.inputFormlick();
	  objCheckBoxPage.CheckBoxDemo();
	  objCheckBoxPage.clickCheckBox();
	  String s=objCheckBoxPage.getValue();
	  if(s.contains("Check box is checked"))  
	  	{
		  Assert.assertTrue(true);
	  	}
	  else
	  	{
		  Assert.fail("COMPARISION FAILD");
	  	}
  }
  @BeforeTest
  public void beforeTest() {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objHome=new HomePage(driver);
	  objCheckBoxPage=new CheckBoxPage(driver);
	  
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
