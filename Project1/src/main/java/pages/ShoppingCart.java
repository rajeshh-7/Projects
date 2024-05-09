package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {

	WebDriver driver;
	By product = By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[6]/div/a/span/span/img");
	By selectSize = By.xpath("//div[@id='option-label-size-143-item-168']");
	By selectColor = By.xpath("//div[@id='option-label-color-93-item-51']");
	By selectQuantity = By.xpath("//input[@id='qty']");
	By addToCartButton = By.xpath("//*[@id=\"product-addtocart-button\"]");
	By cart = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
	By removeProductFromCart = By.xpath("//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a");
	By editItem = By.xpath("//a[@class='action edit']");
	By updateQuantity = By.xpath("//input[@id='qty']");
	By updateCartButton = By.xpath("//*[@id=\"product-updatecart-button\"]");

	public ShoppingCart(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnProduct() {
		driver.findElement(product).click();
	}

	public void clickOnSelectSize() {
		driver.findElement(selectSize).click();
	}

	public void clickOnSelectColor() {
		driver.findElement(selectColor).click();
	}
	
	public void clickOnSelectQuantity() {
		driver.findElement(selectQuantity).clear();
		driver.findElement(selectQuantity).sendKeys("2");
	}

	public void clickOnAddToCartButton() {
		driver.findElement(addToCartButton).click();
	}

	public void clickOnCart() {
		driver.findElement(cart).click();
	}

	public void clickOnRemoveProductFromCart() {
		driver.findElement(removeProductFromCart).click();
	}
	
	public void clickOnEditItem() {
		driver.findElement(editItem).click();
	}
	
	public void clickOnUpdateQuantity() {
		driver.findElement(updateQuantity).clear();
		driver.findElement(updateQuantity).sendKeys("1");
	}
	
	public void clickOnUpdateCartButton() {
		driver.findElement(updateCartButton).click();
	}

}
