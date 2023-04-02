package TestNgClasses;

import org.testng.annotations.Test;

import PageObjectModel.AlertModalsPage;
import Utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AlertModalsCase {
	WebDriver driver;
	DriverManager obj=new DriverManager();
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	AlertModalsPage objalert;
  @Test
  public void alertModals() throws InterruptedException {
	  objalert.alertModelClick();
	  objalert.javaScriptClick();
	  objalert.scrollElement();
	  String ttr = objalert.ButtonClick1();
	  if((ttr=="null")||ttr.isEmpty())

	  {

		  Assert.assertTrue(true);

	  }

	  else

	  {

		  Assert.fail("failed comparision");

	  }
  }
  @Test
  public void alertModals1() throws InterruptedException
  {
	  String ttr1=objalert.ButtonClick2();

	  if(ttr1.contains("hai"))

	  {

	  Assert.assertTrue(true);

	  }

	  else

	  {

	  Assert.fail("failed comparision");

	  }
  }
  
  @BeforeTest
  public void beforeTest() {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objalert=new AlertModalsPage(driver);
	  
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
