package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

WebDriver driver;

HomePage objHome;

public DropDownPage(WebDriver driver )

{

this.driver=driver;

PageFactory.initElements(driver,this);

objHome=new HomePage(driver);

}

@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[4]/a")

public WebElement selectinput;

@FindBy(id="single-input-field")

public WebElement selectcolor;

public void initialStep()

{

objHome.inputFormlick();

selectinput.click();

}

public void dropDownHandling()

{

Select obj=new Select(selectcolor);

obj.selectByIndex(1);

obj.selectByValue("Green");

obj.selectByVisibleText("Yellow");

}

}