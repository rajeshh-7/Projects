package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchBar {

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
	public void testcase1() {

		// Verify the search bar is visible to the user or not
		WebElement searchBar = driver.findElement(By.id("search"));

		// Verify if the search box is present on the page
		if (searchBar != null) {
			System.out.println("Search box is present on the page.");

			// Verify if the search box is visible to the user
			if (searchBar.isDisplayed()) {
				System.out.println("Search box is visible to the user.");
			} else {
				System.out.println("Search box is not visible to the user.");
			}
		} else {
			System.out.println("Search box is not present on the page.");

		}
	}

	@Test
	public void testcase2() {

		// Verify that the search bar accepts input from the user.
		WebElement searchBar = driver.findElement(By.id("search"));

		searchBar.sendKeys("Jackets");

		searchBar.submit();

		String actualValue = "Jackets";

		String expectedValue = "Jackets";

		Assert.assertEquals(actualValue, expectedValue);

		driver.navigate().back();

	}

	@Test
	public void testcase3() throws InterruptedException {

		// Verify that the Clear button in search filters works
		WebElement searchBar = driver.findElement(By.id("search"));

		searchBar.sendKeys("Top");

		Thread.sleep(2000);

		searchBar.clear();

	}

	@AfterTest
	public void terminateBrowser() {

		driver.close();

	}

}
