package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateanAccount {

	WebDriver driver;
	CreateanAccount createanaccount;

	@BeforeClass
	public void initiateBrowser() {

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/");

	}

	@Test(groups = "CreateanAccount")
	public void testCase1() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement createanAccount = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create an Account']")));
		createanAccount.click();

		WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
		firstName.sendKeys("Rajesh");

		WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastname")));
		lastName.sendKeys("Rawool");

		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_address")));
		email.sendKeys("test1740@gmail.com");

		WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		password.sendKeys("Admin@1234");

		WebElement confirmPassword = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("password-confirmation")));
		confirmPassword.sendKeys("Admin@1234");

		WebElement createanAccountBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create an Account']")));
		createanAccountBtn.click();

	}

	@AfterTest
	public void terminateBrowser() {

		driver.close();

	}

}
