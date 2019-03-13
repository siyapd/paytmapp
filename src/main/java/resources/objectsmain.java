package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class objectsmain {
	
WebDriver driver;

public objectsmain(WebDriver driver)
{
PageFactory.initElements(driver, this);
	
}

@FindBy(xpath="//div[@class='jCqS _19iN']/div[3]/div/a/span")
public WebElement bus;


@FindBy(xpath="//div[@class='fl-input-container']/input")
public WebElement place;

@FindBy(xpath="//div[@class='_2xgL']/div")
public WebElement goa;
@FindBy(xpath="(//div[@class='fl-input-container']/input) [2]")
public WebElement place1;

@FindBy(xpath="//input[@class='fl-input _9KqY']")
public WebElement date;

@FindBy(xpath="//div[@class='react-datepicker__current-month']")
public List< WebElement> month;

@FindBy(xpath="//div[@class='react-datepicker__header']/a")
public  WebElement arrow;

@FindBy(className ="react-datepicker__day")
public  WebElement monthdate;

@FindBy(xpath ="//*[text()='DISCLAIMER']")
public  WebElement DISCLAIMER;


@FindBy(xpath="//button[@class='button button--default button--bold _3Su5']")
public  WebElement search;

@FindBy(xpath="//div[@class='_1nWi']")
public  WebElement errormsg;


@FindBy(xpath="//span[@class='_2PUy _3RRf _1aUb']")
public  WebElement lowtohigh;

@FindBy(xpath="//div[@data-reactid='193']/div/div/div[5]/button")
public WebElement overallbus;

}
