package TestNgClasses;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class UrlVerification 
	{
		WebDriver driver;
		
		String expectedURL="https://selenium.obsqurazone.com/";

		DriverManager obj=new DriverManager();

		@Test(priority=0)

		public void urlCheck()

		{

		String s=driver.getCurrentUrl();

		//hhardassert

		// Assert.assertEquals(expectedURL, "jkljllk");

		// System.out.println("sdkjasgdkjsgadjksgadkjgsakgdsakdjs");

		//softassert
		
		SoftAssert objassert=new SoftAssert();

		objassert.assertEquals(expectedURL, "jkljllk");

		System.out.println("sdkjasgdkjsgadjksgadkjgsakgdsakdjs");

		objassert.assertAll();

		// if(expectedURL.equals("hjdkakjdakjdga"))

		// {

		// Assert.assertTrue(true);

		// }else

		// {

		// Assert.fail("String comparsion failed for url verification");

		// }

		}

		@Test(priority=1)

		public void urlChecks() throws InterruptedException

		{
	
			String s=driver.getCurrentUrl();
	
			if(expectedURL.equals(s))
		
				{
		
				System.out.println("pass");
		
				}
	
			else
	
				System.out.println("fail");
			Thread.sleep(2000);

		}

		@BeforeTest

		public void beforeTest()

		{
			obj.launchBrowser(expectedURL,"chrome");
			this.driver=obj.driver;


		}

		@AfterTest

		public void afterTest() 
		{

			obj.closeBrowser();

		}

	}


