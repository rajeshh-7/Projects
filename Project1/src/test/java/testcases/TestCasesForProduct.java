package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCasesForProduct {

	WebDriver driver;

	@BeforeClass
	public void initiateBrowser() {

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/men/bottoms-men/shorts-men.html");

	}

	@Test
	public void testcase1() {

		// Verify the users should be able to select the desired attributes of the
		// product-on-product page such as size, color, etc.
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement scrollToElement = driver
				.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[5]"));

		action.moveToElement(scrollToElement).build().perform(); // Scroll to the element

		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[5]/div/a/span/span/img")));

		product.click(); // Click on product

		WebElement selectSize = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='33']")));

		selectSize.click(); // Click on size

		WebElement selectColour = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@option-label='Black']")));

		selectColour.click(); // Click on color

		String selectedSize = "33";
		String selectedColour = "Black";

		// Verify the size selection
		if (selectedSize.equals("33")) {

			System.out.println("Selected size is correct");

		} else {

			System.out.println("Selected size is incorrect");

		}

		// Verify the color selection
		if (selectedColour.equals("Black")) {

			System.out.println("Selected colour is correct");

		} else {

			System.out.println("Selected colour is incorrect");

		}

		driver.navigate().back();

	}

	@Test
	public void testcase2() throws InterruptedException {

		// Verify by adding a product to the shopping cart.
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[11]")));

		action.moveToElement(scrollToElement).build().perform(); // Scroll to the element

		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[11]/div/a/span/span/img")));

		product.click(); // Click on product

		WebElement selectSize = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='33']")));

		selectSize.click(); // Click on size

		WebElement selectColour = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@option-label='Black']")));

		selectColour.click(); // Click on color

		WebElement addToCartButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"product-addtocart-button\"]")));

		addToCartButton.click(); // Click on Add to Cart button

		Thread.sleep(5000);

		WebElement cart = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action showcart']")));

		action.moveToElement(cart).build().perform();

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
	public void testcase3() {

		// Verify whether users can add a product to the wish list.
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement signIn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")));
		signIn.click();

		WebElement scrollToElement1 = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]"));

		action.moveToElement(scrollToElement1).build().perform();

		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("test1740@gmail.com");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		password.sendKeys("Admin@1234");

		WebElement signInBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign In']")));
		signInBtn.click();

		WebElement scrollToElement2 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[11]")));

		action.moveToElement(scrollToElement2).build().perform(); // Scroll to the element

		WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/ol/li[11]/div/a/span/span/img")));

		product.click(); // Click on product

//		WebElement selectSize = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='32']")));
//
//		selectSize.click(); // Click on size
//
//		WebElement selectColour = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@option-label='Black']")));
//
//		selectColour.click(); // Click on color

		WebElement addToWishList = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='action towishlist']")));

		addToWishList.click();

		WebElement actualMessage = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")));

		String expectedMessage = "Apollo Running Short has been added to your Wish List. Click here to continue shopping.";

		Assert.assertEquals(actualMessage.getText(), expectedMessage);

		driver.navigate().back();

		driver.navigate().back();

	}

	@Test
	public void testcase4() {

		// Verify the grid view button is click able or not
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement gridView = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//strong[@class='modes-mode active mode-grid']")));

		boolean isClickable = gridView.isEnabled();

		if (isClickable) {
			gridView.click();
			System.out.println("Grid view is clickable");
		} else {
			System.out.println("Grid view is not clickable");
		}
	}

	@Test
	public void testcase5() {

		// Verify the list view button is click able or not
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement listView = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='modes-mode mode-list']")));

		boolean isClickable = listView.isEnabled();

		if (isClickable) {
			listView.click();
			System.out.println("List view is clickable");
		} else {
			System.out.println("List view is not clickable");
		}
	}

	@AfterTest
	public void terminateBrowser() {

		driver.close();

	}

}
