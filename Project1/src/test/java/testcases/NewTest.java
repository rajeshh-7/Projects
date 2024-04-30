package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {

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

		// Entering the correct data and check it is allowing to sign in

		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("email")).sendKeys("test1704@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.id("pass")).sendKeys("Admin@1234");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Sign In']")).click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='action switch']")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();

	}
	
	@Test
	public void testcase2() throws InterruptedException {
		
		//Checking the entered account details are correct or not
		
		WebElement accountInformation = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[1]/div[4]/div[2]/div/div[1]"));
		
		String actualaccountInformation = accountInformation.getText();
		String expectedactualaccountInformation = "Rajesh Rawool, test1704@gmail.com";

		Assert.assertEquals(actualaccountInformation, expectedactualaccountInformation);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='action switch']")).click();

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
		
	}
}
