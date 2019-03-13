package StepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.base;
import resources.objectsmain;

public class stepdefination extends base  {
	 Logger log = LogManager.getLogger(stepdefination.class);
	 objectsmain m =new objectsmain(driver);
	@Given("^chrome driver is assigned to open the url$")
	public void chrome_driver_is_assigned_to_open_the_url() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver=invoke();

	}

	@When("^the url is hit on browser$")
	public void the_url_is_hit_on_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    log.info("paytm app is invoked");
	}

	@Then("^the url should open successfully$")
	public void the_url_should_open_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    log.info("successful");

	}
	@When("^we click on bus$")
	public void we_click_on_bus() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	m.bus.click();
	}

	/* @And("^enter source as (.+) and destination as (.+) $")
	    public void enter_source_as_and_destination_as(String source, String dest) throws Throwable {
		 WebElement x=m.place;
		 Thread.sleep(2000l);
			m.place.sendKeys(source);
			
			x.findElement(By.xpath("//*[text()='Goa']")).click();
			WebElement x1=m.place1;
		Thread.sleep(2000l);
			x1.sendKeys(dest);
	    }
*/
	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	m.search.click();
	}

@When("^enter source as goa and destination as mumbai$")
public void enter_source_as_goa_and_destination_as_mumbai() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 WebElement x=m.place;
	 Thread.sleep(2000l);
		m.place.sendKeys("goa");
		
		x.findElement(By.xpath("//*[text()='Goa']")).click();
		WebElement x1=m.place1;
	Thread.sleep(2000l);
		x1.sendKeys("mumbai");
		x1.findElement(By.xpath("//*[text()='Mumbai']")).click();
    }


	@Then("^should be able to get options of bus$")
	public void should_be_able_to_get_options_of_bus() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   log.info("bus options");
	}
	@Then("^print error message and navigate back to home page\\.$")
	public void print_error_message_and_navigate_back_to_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println( m.errormsg.getText());
	   driver.navigate().back();
	}
	
	 @Given("^go to the footer section of the page and click on the links$")
	    public void go_to_the_footer_section_of_the_page_and_click_on_the_links() throws Throwable {
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	       js.executeScript("arguments[0].scrollIntoView(true)", m.DISCLAIMER);
	    }
	 @When("^the links are clicked$")
	 public void the_links_are_clicked() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions

	     WebElement footer=  driver.findElement(By.xpath("//div[@class='footerLinkInfo']"));
	    WebElement column= footer.findElement(By.xpath("//div[@data-reactid='389']"));
	    int count=column.findElements(By.tagName("a")).size();
	    System.out.println(count);
	    for (int i=0;i<count ;i++)
	    {
	    	column.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);	
	    }
	    
	   Set<String> s= driver.getWindowHandles();
	  Iterator<String> s1= s.iterator();
	  while(s1.hasNext())
	  {
		String title=driver.switchTo().window(s1.next()) .getTitle();
		System.out.println(title);
	    
	    } 
	    }
	 
	 @Then("^to be opened in seperate tabs$")
	 public void to_be_opened_in_seperate_tabs() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	     
	        log.info("opened in seperate tabs ");
	    }

	    
	    @And("^get the title of each page$")
	    public void get_the_title_of_each_page() throws Throwable {
	      log.info("title of each pge printed");
	    }

	}

