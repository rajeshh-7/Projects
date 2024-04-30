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

public class SignIn {

	WebDriver driver;

	@BeforeClass
	public void initiateBrowser() {

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/");

	}

	@Test
	public void testcase1() throws InterruptedException {

		// Verify with the correct data and check it is allowing to sign in
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement signIn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")));
		signIn.click();

		Actions action = new Actions(driver);

		WebElement scrollToElement = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]"));

		action.moveToElement(scrollToElement).build().perform();

		Thread.sleep(1000);

		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("test1740@gmail.com");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		password.sendKeys("Admin@1234");

		WebElement signInBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign In']")));
		signInBtn.click();

		WebElement dropDown = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='action switch']")));
		dropDown.click();

		WebElement signOut = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")));
		signOut.click();

	}

	@Test
	public void testcase2() throws InterruptedException {

		// Entering the incorrect email id and password and try to check it is allowing
		// to sign in
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement signIn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")));
		signIn.click();

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("test1706@gmail.com");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		password.sendKeys("Admin@1234*");

		WebElement signInBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign In']")));
		signInBtn.click();

		WebElement error = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div"));

		String actualError = error.getText();
		String expectedError = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";

		Assert.assertEquals(actualError, expectedError);

	}

	@Test
	public void testcase3() throws InterruptedException {

		// Enter the correct email and incorrect password and try to check it allowing
		// to sign in
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement signIn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")));
		signIn.click();

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("test1740@gmail.com");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		password.sendKeys("Admin@4321");

		WebElement signInBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign In']")));
		signInBtn.click();

		WebElement error = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div"));

		String actualError = error.getText();
		String expectedError = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";

		Assert.assertEquals(actualError, expectedError);

	}

	@Test
	public void testcase4() throws InterruptedException {

		// Verify by entering the email in upper case
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement signIn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")));
		signIn.click();

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("TEST1740@GMAIL.COM");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		password.sendKeys("Admin@1234");

		WebElement signInBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign In']")));
		signInBtn.click();

		WebElement dropDown = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='action switch']")));
		dropDown.click();

		WebElement signOut = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")));
		signOut.click();

	}

	@Test
	public void testcase5() throws InterruptedException {

		// Verify by entering the email and password in upper case
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement signIn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")));
		signIn.click();

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("TEST1740@GMAIL.COM");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		password.sendKeys("ADMIN@1234");

		WebElement signInBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign In']")));
		signInBtn.click();

		WebElement error = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div"));

		String actualError = error.getText();
		String expectedError = "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";

		Assert.assertEquals(actualError, expectedError);

	}

	@Test
	public void testcase6() throws InterruptedException {

		// Verify by entering the blank username and password
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement signIn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")));
		signIn.click();

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("                ");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		password.sendKeys("          ");

		WebElement signInBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign In']")));
		signInBtn.click();

		WebElement emailErrorMessage = driver.findElement(By.id("email-error"));

		Assert.assertEquals(emailErrorMessage.getText(), "This is a required field.");

		WebElement passwordErrorMessage = driver.findElement(By.id("pass-error"));

		Assert.assertEquals(passwordErrorMessage.getText(), "This is a required field.");

	}

	@Test
	public void testcase7() throws InterruptedException {

		// Verify the Forgot Password link
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement signIn = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")));
		signIn.click();

		Actions action = new Actions(driver);

		WebElement scrollToElement = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]")));

		action.moveToElement(scrollToElement).build().perform();

		WebElement forgotYourPassword = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Forgot Your Password?']")));
		forgotYourPassword.click();

		WebElement resetMyPassword = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Reset My Password']")));

		action.moveToElement(resetMyPassword).build().perform();

		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_address")));
		email.sendKeys("test1740@gmail.com");

		WebElement resetMyPasswordBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Reset My Password']")));
		resetMyPasswordBtn.click();

	}

	@AfterTest
	public void terminateBrowser() {

		driver.close();

	}

}
