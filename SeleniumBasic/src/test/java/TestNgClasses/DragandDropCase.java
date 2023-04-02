package TestNgClasses;

import org.testng.annotations.Test;
import PageObjectModel.DragandDropPage;
import Utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class DragandDropCase {
	WebDriver driver;
	DriverManager obj=new DriverManager();
	String expectedURL="https://demo.guru99.com/test/drag_drop.html";
	DragandDropPage objDragandDropPage ;

  @Test
  public void drag_dropactions() throws InterruptedException {
	  objDragandDropPage.action();
  }
  @BeforeTest
  public void beforeTest() {
	  obj.launchBrowser(expectedURL,"chrome");
	  this.driver=obj.driver;
	  objDragandDropPage=new DragandDropPage(driver);
	     
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
