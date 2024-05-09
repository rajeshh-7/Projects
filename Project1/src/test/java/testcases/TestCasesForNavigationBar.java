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

import pages.NavigationBar;

public class TestCasesForNavigationBar {

	WebDriver driver;
	NavigationBar navigationbar;

	@BeforeClass
	public void initiateBrowser() {

		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/");

		navigationbar = new NavigationBar(driver);

	}

	@Test
	public void testcase1() {
		// Verify that user is able to click on each items on the navigation bar or not
		navigationbar.clickOnWhatsNew();

		driver.navigate().back();

		navigationbar.clickOnWomen();

		driver.navigate().back();

		navigationbar.clickOnMen();

		driver.navigate().back();

		navigationbar.clickOnGear();

		driver.navigate().back();

		navigationbar.clickOnTraining();

		driver.navigate().back();

		navigationbar.clickOnSale();
		
		driver.navigate().back();

	}

	@Test
	public void testcase2() {

		// Verify that user is able to click on sub-menu on the navigation bar or
		// not
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement womenCategory1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));

		action.moveToElement(womenCategory1).build().perform(); // Hover on Women Category

		navigationbar.clickOnWTops(); // Click on Tops

		driver.navigate().back();

		WebElement womenCategory2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));

		action.moveToElement(womenCategory2).build().perform();// Hover on Women Category

		navigationbar.clickOnWBottoms(); // Click on Bottoms

		driver.navigate().back();

		WebElement menCategory1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]")));

		action.moveToElement(menCategory1).build().perform(); // Hover on Men Category

		navigationbar.clickOnMTops(); // Click on Tops

		driver.navigate().back();

		WebElement menCategory2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]")));

		action.moveToElement(menCategory2).build().perform(); // Hover on Men Category

		navigationbar.clickOnMBottoms(); // Click on Bottoms

		driver.navigate().back();

		WebElement gearCategory1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-6\"]")));

		action.moveToElement(gearCategory1).build().perform(); // Hover on Gear Category

		navigationbar.clickOnBags(); // Click on Bags

		driver.navigate().back();

		WebElement gearCategory2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-6\"]")));

		action.moveToElement(gearCategory2).build().perform(); // Hover on Gear Category

		navigationbar.clickOnFitnessEquipment(); // Click on Fitness Equipment

		driver.navigate().back();

		WebElement gearCategory3 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-6\"]")));

		action.moveToElement(gearCategory3).build().perform(); // Hover on Gear Category

		navigationbar.clickOnWatches(); // Click on Watches

		driver.navigate().back();

		WebElement trainingCategory1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-7\"]")));

		action.moveToElement(trainingCategory1).build().perform(); // Hover on Training Category

		navigationbar.clickOnVideoDownload(); // Click on Video Download
		
		driver.navigate().back();

	}

	@Test
	public void testcase3() {

		// Verify that user is able to click on sub-menu items on the navigation bar or
		// not
		WebDriverWait wait = new WebDriverWait(driver, 10);

		Actions action = new Actions(driver);

		WebElement womenCategory1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));

		action.moveToElement(womenCategory1).build().perform(); // Hover on Women Category

		WebElement topCategory1 = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));

		action.moveToElement(topCategory1).build().perform();// Hover on Tops Category
		
		navigationbar.clickOnJackets1(); // Click on Jackets
		
		driver.navigate().back();
		
		WebElement womenCategory2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));

		action.moveToElement(womenCategory2).build().perform(); // Hover on Women Category

		WebElement topCategory2 = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));

		action.moveToElement(topCategory2).build().perform(); // Hover on Tops Category
		
		navigationbar.clickOnHoodiesAndSweatshirts1(); // Click on Hoodies & Sweatshirts
		
		driver.navigate().back();
		
		WebElement womenCategory3 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));

		action.moveToElement(womenCategory3).build().perform(); // Hover on Women Category

		WebElement topCategory3 = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));

		action.moveToElement(topCategory3).build().perform(); // Hover on Tops Category
		
		navigationbar.clickOnTees1(); // Click on Tees
		
		driver.navigate().back();
		
		WebElement womenCategory4 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));

		action.moveToElement(womenCategory4).build().perform(); // Hover on Women Category

		WebElement topCategory4 = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));

		action.moveToElement(topCategory4).build().perform(); // Hover on Tops Category
		
		navigationbar.clickOnBrasAndTanks(); // Click on Bras & Tanks
		
		driver.navigate().back();
		
		WebElement womenCategory5 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));

		action.moveToElement(womenCategory5).build().perform(); // Hover on Women Category

		WebElement bottomCategory1 = driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]"));

		action.moveToElement(bottomCategory1).build().perform(); // Hover on Bottoms Category
		
		navigationbar.clickOnPants1(); // Click on Pants
		
		driver.navigate().back();
		
		WebElement womenCategory6 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));

		action.moveToElement(womenCategory6).build().perform(); // Hover on Women Category

		WebElement bottomCategory2 = driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]"));

		action.moveToElement(bottomCategory2).build().perform(); // Hover on Bottoms Category
		
		navigationbar.clickOnShorts1(); // Click on Shorts
		
		driver.navigate().back();
		
		WebElement menCategory1 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]")));

		action.moveToElement(menCategory1).build().perform(); // Hover on Men Category

		WebElement topCategory5 = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));

		action.moveToElement(topCategory5).build().perform(); // Hover on Tops Category
		
		navigationbar.clickOnJackets2(); // Click on Jackets
		
		driver.navigate().back();
		
		WebElement menCategory2 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]")));

		action.moveToElement(menCategory2).build().perform(); // Hover on Men Category

		WebElement topCategory6 = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));

		action.moveToElement(topCategory6).build().perform();  // Hover on Tops Category
		
		navigationbar.clickOnHoodiesAndSweatshirts2(); // Click on Hoodies & Sweatshirts
		
		driver.navigate().back();
		
		WebElement menCategory3 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]")));

		action.moveToElement(menCategory3).build().perform(); // Hover on Men Category

		WebElement topCategory7 = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));

		action.moveToElement(topCategory7).build().perform(); // Hover on Tops Category
		
		navigationbar.clickOnTees2(); // Click on Tees
		
		driver.navigate().back();
		
		WebElement menCategory4 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]")));

		action.moveToElement(menCategory4).build().perform(); // Hover on Men Category

		WebElement topCategory8 = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));

		action.moveToElement(topCategory8).build().perform(); // Hover on Tops Category
		
		navigationbar.clickOnTanks(); // Click on Tanks
		
		driver.navigate().back();
		

		WebElement menCategory5 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]")));

		action.moveToElement(menCategory5).build().perform(); // Hover on Men Category

		WebElement bottomCategory3 = driver.findElement(By.xpath("//*[@id=\"ui-id-18\"]"));

		action.moveToElement(bottomCategory3).build().perform(); // Hover on Bottoms Category
		
		navigationbar.clickOnPants2(); // Click on Pants
		
		driver.navigate().back();
		
		WebElement menCategory6 = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]")));

		action.moveToElement(menCategory6).build().perform(); // Hover on Men Category

		WebElement bottomCategory4 = driver.findElement(By.xpath("//*[@id=\"ui-id-18\"]"));

		action.moveToElement(bottomCategory4).build().perform(); // Hover on Bottoms Category
		
		navigationbar.clickOnShorts2(); // Click on Shorts
		
		driver.navigate().back();

	}

//	@Test
//	public void testcase1() throws InterruptedException {
//
//		// Verify that user is able to click on each items on the navigation bar or not
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		WebElement whatsNew = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-3\"]")));
//		whatsNew.click(); // Click on What's New
//
//		driver.navigate().back();
//
//		WebElement women = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));
//		women.click(); // Click on Women
//
//		driver.navigate().back();
//
//		WebElement men = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]")));
//		men.click(); // Click on Men
//
//		driver.navigate().back();
//
//		WebElement gear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-6\"]")));
//		gear.click(); // Click on Gear
//
//		driver.navigate().back();
//
//		WebElement training = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-7\"]")));
//		training.click(); // Click on Training
//
//		driver.navigate().back();
//
//		WebElement sale = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-8\"]")));
//		sale.click(); // Click on Sale
//
//		driver.navigate().back();
//
//	}
//
//	@Test
//	public void testcase2() throws InterruptedException {
//
//		// Verify that user is able to click on sub-menu on the navigation bar or
//		// not
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		Actions action = new Actions(driver);
//
//		WebElement womenCategory1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]")));
//
//		action.moveToElement(womenCategory1).build().perform(); // Hover on Women Category
//
//		driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]")).click(); // Click on Tops
//
//		driver.navigate().back();
//
//		WebElement womenCategory2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]"))); // Hover on
//																											// Women
//																											// Category
//
//		action.moveToElement(womenCategory2).build().perform();
//
//		driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]")).click(); // Click on Bottoms
//
//		driver.navigate().back();
//
//		WebElement menCategory1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]"))); // Hover on Men
//																											// Category
//
//		action.moveToElement(menCategory1).build().perform();
//
//		driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")).click(); // Click on Tops
//
//		driver.navigate().back();
//
//		WebElement menCategory2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]"))); // Hover on Men
//																											// Category
//
//		action.moveToElement(menCategory2).build().perform();
//
//		driver.findElement(By.xpath("//*[@id=\"ui-id-18\"]")).click(); // Click on Bottoms
//
//		driver.navigate().back();
//
//		WebElement gearCategory1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-6\"]"))); // Hover on
//																											// Gear
//																											// Category
//
//		action.moveToElement(gearCategory1).build().perform();
//
//		driver.findElement(By.xpath("//*[@id=\"ui-id-25\"]")).click(); // Click on Bags
//
//		driver.navigate().back();
//
//		WebElement gearCategory2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-6\"]"))); // Hover on
//																											// Gear
//																											// Category
//
//		action.moveToElement(gearCategory2).build().perform();
//
//		driver.findElement(By.xpath("//*[@id=\"ui-id-26\"]")).click(); // Click on Fitness Equipment
//
//		driver.navigate().back();
//
//		WebElement gearCategory3 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-6\"]"))); // Hover on
//																											// Gear
//																											// Category
//
//		action.moveToElement(gearCategory3).build().perform();
//
//		driver.findElement(By.xpath("//*[@id=\"ui-id-27\"]")).click(); // Click on Watches
//
//		driver.navigate().back();
//
//		WebElement trainingCategory1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-7\"]"))); // Hover on
//																											// Training
//																											// Category
//
//		action.moveToElement(trainingCategory1).build().perform();
//
//		driver.findElement(By.xpath("//*[@id=\"ui-id-28\"]")).click(); // Click on Video Download
//
//		driver.navigate().back();
//
//	}
//
//	@Test
//	public void testcase3() throws InterruptedException {
//
//		// Verify that user is able to click on sub-menu items on the navigation bar or
//		// not
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//
//		Actions action = new Actions(driver);
//
//		WebElement womenCategory1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]"))); // Hover on
//																											// Women
//																											// Category
//
//		action.moveToElement(womenCategory1).build().perform();
//
//		WebElement topCategory1 = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]")); // Hover on Tops Category
//
//		action.moveToElement(topCategory1).build().perform();
//
//		WebElement jackets1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-11\"]")));
//		jackets1.click(); // Click on Jackets
//
//		driver.navigate().back();
//
//		WebElement womenCategory2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]"))); // Hover on
//																											// Women
//																											// Category
//
//		action.moveToElement(womenCategory2).build().perform();
//
//		WebElement topCategory2 = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]")); // Hover on Tops Category
//
//		action.moveToElement(topCategory2).build().perform();
//
//		WebElement hoodiesAndSweatshirts1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-12\"]")));
//		hoodiesAndSweatshirts1.click(); // Click on Hoodies & Sweatshirts
//
//		driver.navigate().back();
//
//		WebElement womenCategory3 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]"))); // Hover on
//																											// Women
//																											// Category
//
//		action.moveToElement(womenCategory3).build().perform();
//
//		WebElement topCategory3 = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]")); // Hover on Tops Category
//
//		action.moveToElement(topCategory3).build().perform();
//
//		WebElement tees1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-13\"]")));
//		tees1.click(); // Click on Tees
//
//		driver.navigate().back();
//
//		WebElement womenCategory4 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]"))); // Hover on
//																											// Women
//																											// Category
//
//		action.moveToElement(womenCategory4).build().perform();
//
//		WebElement topCategory4 = driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]")); // Hover on Tops Category
//
//		action.moveToElement(topCategory4).build().perform();
//
//		WebElement brasAndTanks = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-14\"]")));
//		brasAndTanks.click(); // Click on Bras & Tanks
//
//		driver.navigate().back();
//
//		WebElement womenCategory5 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]"))); // Hover on
//																											// Women
//																											// Category
//
//		action.moveToElement(womenCategory5).build().perform();
//
//		WebElement bottomCategory1 = driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]")); // Hover on Bottoms Category
//
//		action.moveToElement(bottomCategory1).build().perform();
//
//		WebElement pants1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-15\"]")));
//		pants1.click(); // Click on Pants
//
//		driver.navigate().back();
//
//		WebElement womenCategory6 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-4\"]"))); // Hover on
//																											// Women
//																											// Category
//
//		action.moveToElement(womenCategory6).build().perform();
//
//		WebElement bottomCategory2 = driver.findElement(By.xpath("//*[@id=\"ui-id-10\"]")); // Hover on Bottoms Category
//
//		action.moveToElement(bottomCategory2).build().perform();
//
//		WebElement shorts1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-16\"]")));
//		shorts1.click(); // Click on Shorts
//
//		driver.navigate().back();
//
//		WebElement menCategory1 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]"))); // Hover on Men
//																											// Category
//
//		action.moveToElement(menCategory1).build().perform();
//
//		WebElement topCategory5 = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")); // Hover on Tops Category
//
//		action.moveToElement(topCategory5).build().perform();
//
//		WebElement jackets2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-19\"]")));
//		jackets2.click(); // Click on Jackets
//
//		driver.navigate().back();
//
//		WebElement menCategory2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]"))); // Hover on Men
//																											// Category
//
//		action.moveToElement(menCategory2).build().perform();
//
//		WebElement topCategory6 = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")); // Hover on Tops Category
//
//		action.moveToElement(topCategory6).build().perform();
//
//		WebElement hoodiesAndSweatshirts2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-20\"]")));
//		hoodiesAndSweatshirts2.click(); // Click on Hoodies & Sweatshirts
//
//		driver.navigate().back();
//
//		WebElement menCategory3 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]"))); // Hover on Men
//																											// Category
//
//		action.moveToElement(menCategory3).build().perform();
//
//		WebElement topCategory7 = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")); // Hover on Tops Category
//
//		action.moveToElement(topCategory7).build().perform();
//
//		WebElement tees2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-21\"]")));
//		tees2.click(); // Click on Tees
//
//		driver.navigate().back();
//
//		WebElement menCategory4 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]"))); // Hover on Men
//																											// Category
//
//		action.moveToElement(menCategory4).build().perform();
//
//		WebElement topCategory8 = driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]")); // Hover on Tops Category
//
//		action.moveToElement(topCategory8).build().perform();
//
//		WebElement tanks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-22\"]")));
//		tanks.click(); // Click on Tanks
//
//		driver.navigate().back();
//
//		WebElement menCategory5 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]"))); // Hover on Men
//																											// Category
//
//		action.moveToElement(menCategory5).build().perform();
//
//		WebElement bottomCategory3 = driver.findElement(By.xpath("//*[@id=\"ui-id-18\"]")); // Hover on Bottoms Category
//
//		action.moveToElement(bottomCategory3).build().perform();
//
//		WebElement pants2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-23\"]")));
//		pants2.click(); // Click on Pants
//
//		Thread.sleep(2000);
//
//		driver.navigate().back();
//
//		WebElement menCategory6 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-5\"]"))); // Hover on Men
//																											// Category
//
//		action.moveToElement(menCategory6).build().perform();
//
//		WebElement bottomCategory4 = driver.findElement(By.xpath("//*[@id=\"ui-id-18\"]")); // Hover on Bottoms Category
//
//		action.moveToElement(bottomCategory4).build().perform();
//
//		WebElement shorts2 = wait
//				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ui-id-24\"]")));
//		shorts2.click();// Click on Shorts
//
//		driver.navigate().back();
//
//	}

	@AfterTest
	public void terminateBrowser() {

		driver.close();

	}

}
