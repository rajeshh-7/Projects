package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {

	WebDriver driver;
	By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
	By emailId = By.id("email");
	By pass = By.id("pass");
	By signInBtn = By.xpath("//span[text()='Sign In']");
	By dropDown = By.xpath("//button[@class='action switch']");
	By signOut = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a");
	By forgotYourPassword = By.xpath("//span[text()='Forgot Your Password?']");
	By email_address = By.id("email_address");
	By resetMyPasswordBtn = By.xpath("//span[text()='Reset My Password']");
	
	public SignIn(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickSignIn() {
		driver.findElement(signIn).click();
	}
	
	public void setEmail(String email) {
		driver.findElement(emailId).sendKeys(email);
	}
	
	public void setPassword(String password) {
		driver.findElement(pass).sendKeys(password);
	}
	
	public void clickSignInBtn() {
		driver.findElement(signInBtn).click();
	}
	
	public void clickDropDown() {
		driver.findElement(dropDown).click();
	}
	
	public void clickSignOut() {
		driver.findElement(signOut).click();
	}
	
	public void clickForgotYourPassword() {
		driver.findElement(forgotYourPassword).click();
	}
	
	public void setEmailAddress(String emailaddress) {
		driver.findElement(email_address).sendKeys(emailaddress);
	}
	
	public void clickResetMyPasswordBtn() {
		driver.findElement(resetMyPasswordBtn).click();
	}

}
