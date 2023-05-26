package stepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AdminPage;

public class StepDefination extends Base
{

	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() {
//		  System.setProperty("webdriver.chrome.driver","D:\\QE_14_software\\chromedriver_win32\\chromedriver.exe");
//			driver=new ChromeDriver(); 
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver(chromeOptions);
			
			ad=new AdminPage(driver);//creating object of AdminPage class
	}

	@When("User open url {string}")
	public void user_open_url(String url) throws Exception {
	  driver.get(url);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
	   ad.setUserName(email);
	   ad.setPassword(password);
		  Thread.sleep(2000);

	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception {
	   ad.clickLogin();
		  Thread.sleep(2000);

	}
	
	@Then("Page Title Should be {string}")
	public void page_title_should_be(String title) {
	    Assert.assertEquals(title, driver.getTitle());
	}
	

	@Then("close browser")
	public void close_browser() {
	     driver.close();
	}
}
