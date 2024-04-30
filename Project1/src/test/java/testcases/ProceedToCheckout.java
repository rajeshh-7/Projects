package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProceedToCheckout {

	WebDriver driver;

	@BeforeClass
	public void initiateBrowser() {

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/gear/bags.html");

	}

	@Test
	public void testcase1() throws InterruptedException {

		// Verify that the checkout process starts from the cart
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[9]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[9]/div/a/span/span/img")));

		product.click(); // Select the Product

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

		proceedToCheckoutButton.click();

		String pageTitle = driver.getTitle();

		System.out.println(driver.getTitle());

		Assert.assertTrue(pageTitle.contains("Checkout"), "Checkout page is not displayed");

		Thread.sleep(5000);

	}

	@Test
	public void testcase2() throws InterruptedException {

		// Verify by selecting a shipping address during checkout
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement emailAddress = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"customer-email\"]")));

		// WebElement emailAddress =
		// driver.findElement(By.xpath("//*[@id=\"customer-email\"]"));

		emailAddress.sendKeys("test1704@gmail.com");

		WebElement firstName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));

		firstName.sendKeys("Rajesh");

		WebElement lastName = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='lastname']")));

		lastName.sendKeys("Rawool");

		WebElement company = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='company']")));

		company.sendKeys("Test");

		WebElement streetAddress = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='street[0]']")));

		streetAddress.sendKeys("Andheri");

		WebElement city = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='city']")));

		city.sendKeys("Mumbai");

		WebElement postalCode = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='postcode']")));

		postalCode.sendKeys("400093");

		Thread.sleep(5000);

		Select country = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='country_id']"))));

		country.selectByVisibleText("India");

		Thread.sleep(5000);

		Select stateProvinceDropDown = new Select(
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='region_id']"))));

		stateProvinceDropDown.selectByVisibleText("Maharashtra");

		WebElement phoneNumber = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='telephone']")));

		phoneNumber.sendKeys("7788994455");

		WebElement nextBtn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")));

		nextBtn.click();
		
		Thread.sleep(5000);

	}

	@AfterTest
	public void terminateBrowser() {

		driver.close();

	}

}
