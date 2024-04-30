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

public class HomePage {

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

		WebDriverWait wait = new WebDriverWait(driver, 10);

		System.out.println("Content 1");

		WebElement content1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/a/span")));

		System.out.println(content1.getText());

		WebElement clickOnImage1 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/a/img")));
		clickOnImage1.click(); // Clicking on image and verifying it is allowing me to click on it and sending
								// me to next tab

		driver.navigate().back();

		WebElement shopNewYogaBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shop New Yoga']")));
		shopNewYogaBtn.click(); // Click on "Shop New Yoga" button and verifying it is allowing me to next tab

		driver.navigate().back();

		System.out.println();

		System.out.println("Content 2");

		WebElement content2 = driver
				.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[1]/span"));

		System.out.println(content2.getText());

		WebElement clickOnImage2 = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[1]/img")));
		clickOnImage2.click(); // Clicking on image and verifying it is allowing me to click on it and sending
								// me to next tab

		driver.navigate().back();

		WebElement shopPantsBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shop Pants']")));
		shopPantsBtn.click(); // Click on "Shop Pants" button and verifying it is allowing me to next tab

		driver.navigate().back();

		System.out.println();

		System.out.println("Content 3");

		WebElement content3 = driver
				.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[2]/span[2]"));

		System.out.println(content3.getText());

		WebElement clickOnImage3 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[2]")));
		clickOnImage3.click(); // Clicking on image and verifying it is allowing me to click on it and sending
								// me to next tab

		driver.navigate().back();

		WebElement shopTeesBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shop Tees']")));
		shopTeesBtn.click(); // Click on "Shop Tees" button and verifying it is allowing me to next tab

		driver.navigate().back();

		System.out.println();

		System.out.println("Content 4");

		WebElement content4 = driver
				.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[3]/span"));

		System.out.println(content4.getText());

		WebElement clickOnImage4 = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[3]/span")));
		clickOnImage4.click(); // Clicking on image and verifying it is allowing me to click on it and sending
								// me to next tab

		driver.navigate().back();

		WebElement shopErinRecommends = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shop Erin Recommends']")));
		shopErinRecommends.click(); // Click on "Shop Erin Recommends" button verifying it is allowing me to next
									// tab

		driver.navigate().back();

		System.out.println();

		System.out.println("Content 5");

		WebElement content5 = driver
				.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[4]/span"));

		System.out.println(content5.getText());

		WebElement clickOnImage5 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[4]")));
		;
		clickOnImage5.click(); // Clicking on image and verifying it is allowing me to click on it and sending
								// me to next tab

		driver.navigate().back();

		WebElement shopPerformanceBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shop Performance']")));
		shopPerformanceBtn.click(); // Click on "Shop Performance" button and verifying it is allowing me to next
									// tab

		driver.navigate().back();

		System.out.println();

		System.out.println("Content 6");

		WebElement content6 = driver
				.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[5]/span"));

		System.out.println(content6.getText());

		WebElement clickOnImage6 = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[5]")));
		clickOnImage6.click(); // Clicking on image and verifying it is allowing me to click on it and sending
								// me to next tab

		driver.navigate().back();

		WebElement shopEcoFriendlyBtn = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Shop Eco-Friendly']")));
		shopEcoFriendlyBtn.click(); // Click on "Shop Eco-Friendly" button and verifying it is allowing me to next
									// tab

		driver.navigate().back();

		System.out.println();

	}

	@AfterTest
	public void terminateBrowser() {

		driver.close();

	}

}
