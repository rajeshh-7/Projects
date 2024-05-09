package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateanAccount {

	WebDriver driver;
	By createanAccount = By.xpath("//a[text()='Create an Account']");
	By firstName = By.id("firstname");
	By lastName = By.id("lastname");
	By emailId = By.id("email_address");
	By pass = By.id("password");
	By confirmPassword = By.id("password-confirmation");
	By createanAccountBtn = By.xpath("//span[text()='Create an Account']");
	
	public CreateanAccount(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateAnAccount() {
		driver.findElement(createanAccount).click();
	}
	
	public void setFirstName(String firstname) {
		driver.findElement(firstName).sendKeys(firstname);
	}
	
	public void setLastName(String lastname) {
		driver.findElement(lastName).sendKeys(lastname);
	}
	
	public void setEmail(String email) {
		driver.findElement(emailId).sendKeys(email);
	}
	
	public void setPassword(String password) {
		driver.findElement(pass).sendKeys(password);
	}
	
	public void setConfirmPassword(String confirmpassword) {
		driver.findElement(confirmPassword).sendKeys(confirmpassword);
	}
	
	public void clickCreateAnAccountBtn() {
		driver.findElement(createanAccountBtn).click();
	}

}
