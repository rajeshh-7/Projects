package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ShoppingCart {

	WebDriver driver;

	@BeforeClass
	public void initiateBrowser() {

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html");

	}

	@Test
	public void testcase1() throws InterruptedException {

		// Verify by adding a product to the shopping cart.
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[9]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[9]/div/a/span/span/img")));

		product.click(); // Select the Product

		WebElement selectSize = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-size-143-item-168']")));

		selectSize.click(); // Select the Size

		WebElement selectColor = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-color-93-item-59']")));

		selectColor.click(); // Select the Color

		WebElement addToCartButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-addtocart-button\"]")));

		addToCartButton.click(); // Click on Add to Cart button

		WebElement cart = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));

		action.moveToElement(cart).build().perform();

		Thread.sleep(2000);

		cart.click();

		if (cart.isDisplayed()) {
			System.out.println("Product is added to the cart successfully");
		} else {
			System.out.println("Failed to add product to the cart");
		}

		Thread.sleep(2000);

		driver.navigate().back();

	}

	@Test
	public void testcase2() throws InterruptedException {

		// Verify by removing a product from the cart.
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[6]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[6]/div/a/span/span/img")));

		product.click(); // Select the Product

		WebElement selectSize = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-size-143-item-168']")));

		selectSize.click(); // Select the Size

		WebElement selectColor = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-color-93-item-51']")));

		selectColor.click(); // Select the Color

		WebElement addToCartButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-addtocart-button\"]")));

		addToCartButton.click(); // Click on Add to Cart button

		Thread.sleep(5000);

		driver.navigate().back();

		WebElement cart = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")));

		action.moveToElement(cart).build().perform();

		Thread.sleep(2000);

		cart.click(); // Click on Cart Icon

		WebElement removeProductFromCart = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a")));

		removeProductFromCart.click(); // Remove Product from Cart

//		Alert alert = driver.switchTo().alert();
//		
//		Thread.sleep(2000);
//		
//		alert.accept();
//		
//		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[4]/aside[2]/div[2]/footer/button[2]")).click();

	}

	@Test
	public void testcase3() throws InterruptedException {

		// Verify by updating the quantity of a product from the cart.
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[6]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[6]/div/a/span/span/img")));

		product.click(); // Select the Product

		WebElement selectSize = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-size-143-item-168']")));

		selectSize.click(); // Select the Size

		WebElement selectColor = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-color-93-item-51']")));

		selectColor.click(); // Select the Color

		WebElement selectQuantity = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='qty']")));

		selectQuantity.clear();

		selectQuantity.sendKeys("2"); // Select the Quantity

		WebElement addToCartButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-addtocart-button\"]")));

		addToCartButton.click(); // Click on Add to Cart button

		Thread.sleep(5000);

		driver.navigate().back();

		WebElement cart = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")));

		action.moveToElement(cart).build().perform();

		Thread.sleep(2000);

		cart.click(); // Click on Cart Icon

		WebElement editItem = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action edit']")));

		editItem.click(); // Click on Edit Item Icon

		WebElement updateQuantity = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='qty']")));

		updateQuantity.clear();

		updateQuantity.sendKeys("1"); // Update the Quantity

		WebElement updateCartButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-updatecart-button\"]")));

		updateCartButton.click(); // Click on Update Cart button

		driver.navigate().back();

		driver.navigate().back();

	}

	@Test
	public void testcase4() throws InterruptedException {

		// Verify the proceed to checkout button is clickable or not
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[6]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[6]/div/a/span/span/img")));

		product.click(); // Select the Product

		WebElement selectSize = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-size-143-item-168']")));

		selectSize.click(); // Select the Size

		WebElement selectColor = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='option-label-color-93-item-51']")));

		selectColor.click(); // Select the Color

		WebElement addToCartButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-addtocart-button\"]")));

		addToCartButton.click(); // Click on Add to Cart button

		Thread.sleep(5000);

		WebElement cart = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")));

		action.moveToElement(cart).build().perform();

		Thread.sleep(2000);

		cart.click(); // Click on Cart Icon

		WebElement proceedToCheckoutButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='top-cart-btn-checkout']")));

		if (proceedToCheckoutButton.isEnabled()) {

			proceedToCheckoutButton.click();
			System.out.println("Proceed to Checkout button is clickable");

		} else {

			System.out.println("Proceed to Checkout button is not clickable");

		}

		driver.navigate().back();

	}

	@Test
	public void testcase5() throws InterruptedException {

		// Check for a confirmation message while removing items from cart.
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement cart = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")));

		action.moveToElement(cart).build().perform();

		Thread.sleep(2000);

		cart.click(); // Click on Cart Icon

		Thread.sleep(2000);

		WebElement removeProductFromCart = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"mini-cart\"]/li/div/div/div[3]/div[2]/a")));

		if (removeProductFromCart.isEnabled()) {

			removeProductFromCart.click(); // Remove Product from Cart

			Thread.sleep(2000);

			System.out.println("Confirmation message while removing items from cart is successfully displayed");

		} else {

			System.out.println("Confirmation message while removing items from cart is not displayed");

		}

	}

	@AfterTest
	public void terminateBrowser() {

		driver.close();

	}

}
