package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {

	WebDriver driver;
	By whatsNew = By.xpath("//*[@id=\"ui-id-3\"]");
	By women = By.xpath("//*[@id=\"ui-id-4\"]");
	By men = By.xpath("//*[@id=\"ui-id-5\"]");
	By gear = By.xpath("//*[@id=\"ui-id-6\"]");
	By training = By.xpath("//*[@id=\"ui-id-7\"]");
	By sale = By.xpath("//*[@id=\"ui-id-8\"]");
	By wtops = By.xpath("//*[@id=\"ui-id-9\"]");
	By wbottoms = By.xpath("//*[@id=\"ui-id-10\"]");
	By mtops = By.xpath("//*[@id=\"ui-id-17\"]");
	By mbottoms = By.xpath("//*[@id=\"ui-id-18\"]");
	By bags = By.xpath("//*[@id=\"ui-id-25\"]");
	By fitnessequipment = By.xpath("//*[@id=\"ui-id-26\"]");
	By watches = By.xpath("//*[@id=\"ui-id-27\"]");
	By videodownload = By.xpath("//*[@id=\"ui-id-28\"]");
	By jackets1 = By.xpath("//*[@id=\"ui-id-11\"]");
	By hoodiesAndSweatshirts1 = By.xpath("//*[@id=\"ui-id-12\"]");
	By tees1 = By.xpath("//*[@id=\"ui-id-13\"]");
	By brasAndTanks = By.xpath("//*[@id=\"ui-id-14\"]");
	By pants1 = By.xpath("//*[@id=\"ui-id-15\"]");
	By shorts1 = By.xpath("//*[@id=\"ui-id-16\"]");
	By jackets2 = By.xpath("//*[@id=\"ui-id-19\"]");
	By hoodiesAndSweatshirts2 = By.xpath("//*[@id=\"ui-id-20\"]");
	By tees2 = By.xpath("//*[@id=\"ui-id-21\"]");
	By tanks = By.xpath("//*[@id=\"ui-id-22\"]");
	By pants2 = By.xpath("//*[@id=\"ui-id-23\"]");
	By shorts2 = By.xpath("//*[@id=\"ui-id-24\"]");
	
	public NavigationBar(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnWhatsNew() {
		driver.findElement(whatsNew).click();
	}
	
	public void clickOnWomen() {
		driver.findElement(women).click();
	}
	
	public void clickOnMen() {
		driver.findElement(men).click();
	}
	
	public void clickOnGear() {
		driver.findElement(gear).click();
	}
	
	public void clickOnTraining() {
		driver.findElement(training).click();
	}
	
	public void clickOnSale() {
		driver.findElement(sale).click();
	}
	
	public void clickOnWTops() {
		driver.findElement(wtops).click();
	}
	
	public void clickOnWBottoms() {
		driver.findElement(wbottoms).click();
	}
	
	public void clickOnMTops() {
		driver.findElement(mtops).click();
	}
	
	
	public void clickOnMBottoms() {
		driver.findElement(mbottoms).click();
	}
	
	public void clickOnBags() {
		driver.findElement(bags).click();
	}
	
	public void clickOnFitnessEquipment() {
		driver.findElement(fitnessequipment).click();
	}
	
	public void clickOnWatches() {
		driver.findElement(watches).click();
	}
	
	public void clickOnVideoDownload() {
		driver.findElement(videodownload).click();
	}
	
	public void clickOnJackets1() {
		driver.findElement(jackets1).click();
	}

	public void clickOnHoodiesAndSweatshirts1() {
		driver.findElement(hoodiesAndSweatshirts1).click();
	}
	
	public void clickOnTees1() {
		driver.findElement(tees1).click();
	}
	
	public void clickOnBrasAndTanks() {
		driver.findElement(brasAndTanks).click();
	}
	
	public void clickOnPants1() {
		driver.findElement(pants1).click();
	}
	
	public void clickOnShorts1() {
		driver.findElement(shorts1).click();
	}
	
	public void clickOnJackets2() {
		driver.findElement(jackets2).click();
	}
	
	public void clickOnHoodiesAndSweatshirts2() {
		driver.findElement(hoodiesAndSweatshirts2).click();
	}
	
	public void clickOnTees2() {
		driver.findElement(tees2).click();
	}
	
	public void clickOnTanks() {
		driver.findElement(tanks).click();
	}
	
	public void clickOnPants2() {
		driver.findElement(pants2).click();
	}
	
	public void clickOnShorts2() {
		driver.findElement(shorts2).click();
	}
	
	
}
