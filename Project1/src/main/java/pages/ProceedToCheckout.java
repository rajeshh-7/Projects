package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToCheckout {

	WebDriver driver;
	By product = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[9]/div/a/span/span/img");
	By addToCartButton = By.xpath("//*[@id=\"product-addtocart-button\"]");
	By cart = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
	By proceedToCheckoutButton = By.xpath("//button[@id='top-cart-btn-checkout']");
	By emailAddress = By.xpath("//*[@id=\"customer-email\"]");
	By firstName = By.xpath("//input[@name='firstname']");
	By lastName = By.xpath("//input[@name='lastname']");
	By company = By.xpath("//input[@name='company']");
	By streetAddress = By.xpath("//input[@name='street[0]']");
	By city = By.xpath("//input[@name='city']");
	By postalCode = By.xpath("//input[@name='postcode']");
	By phoneNumber = By.xpath("//input[@name='telephone']");
	By nextBtn = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");
	
	public ProceedToCheckout(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnProduct() {
		driver.findElement(product).click();
	}
	
	public void clickOnAddToCartButton() {
		driver.findElement(addToCartButton).click();
	}
	
	public void clickOnCart() {
		driver.findElement(cart).click();
	}
	
	public void clickOnProceedToCheckoutButton() {
		driver.findElement(proceedToCheckoutButton).click();
	}
	
	public void clickOnEmailAddress() {
		driver.findElement(emailAddress).sendKeys("test1704@gmail.com");
	}
	
	public void clickOnFirstName() {
		driver.findElement(firstName).sendKeys("Rajesh");
	}
	
	public void clickOnLastName() {
		driver.findElement(lastName).sendKeys("Rawool");
	}
	
	public void clickOnCompany() {
		driver.findElement(company).sendKeys("Test");
	}
	
	public void clickOnStreetAddress() {
		driver.findElement(streetAddress).sendKeys("Andheri");
	}
	
	public void clickOnCity() {
		driver.findElement(city).sendKeys("Mumbai");
	}
	
	public void clickOnPostalCode() {
		driver.findElement(postalCode).sendKeys("400093");
	}
	
	public void clickOnPhoneNumber() {
		driver.findElement(phoneNumber).sendKeys("");
	}
	
	public void clickOnNextBtn() {
		driver.findElement(nextBtn).click();
	}
	
	

}
