package TestNgClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import PageObjectModel.HomePage;
import PageObjectModel.RadioButtonPage;
import Utility.DriverManager;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class RadioButtonCase {
	WebDriver driver;
	DriverManager obj=new DriverManager();
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	HomePage objHome;
	RadioButtonPage objRadioBtn;
	SoftAssert softassert;
  @Test
  public void RadioButtonVerification() throws InterruptedException {
	  objHome.inputFormlick();
	  objRadioBtn.radioDemo();
	  objRadioBtn.radiobtnclick();
	  objRadioBtn.showValueclick();
	  String acutualValue="Radio button 'Female' is checked";
	  String expectedValue=objRadioBtn.getValues();
	  softassert.assertEquals(acutualValue, expectedValue,"error");
	  softassert.assertAll();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objHome=new HomePage(driver);
	  objRadioBtn=new RadioButtonPage(driver);
	  softassert=new SoftAssert();
	  
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
