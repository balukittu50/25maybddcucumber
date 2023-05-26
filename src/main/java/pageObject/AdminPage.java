package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public WebDriver ldriver;
	
	public AdminPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	// WebElement txtEmail=driver.findElement(By.xpath("//input[@id='Email']"));

	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//button[@class='button-1 login-button']")
	WebElement btnLogin;

	// we can create separate user defined method for every webelement.

	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}

	public void setPassword(String pwd) {
        txtPassword.clear();
        txtPassword.sendKeys(pwd);		
		
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
}
