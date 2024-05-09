package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	By clickOnImage1 = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/a/img");
	By shopNewYogaBtn = By.xpath("//span[text()='Shop New Yoga']");
	By clickOnImage2 = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[1]/img");
	By shopPantsBtn = By.xpath("//span[text()='Shop Pants']");
	By clickOnImage3 = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[2]");
	By shopTeesBtn = By.xpath("//span[text()='Shop Tees']");
	By clickOnImage4 = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[3]/span");
	By shopErinRecommends = By.xpath("//span[text()='Shop Erin Recommends']");
	By clickOnImage5 = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[4]");
	By shopPerformanceBtn = By.xpath("//span[text()='Shop Performance']");
	By clickOnImage6 = By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[3]/div[1]/div/a[5]");
	By shopEcoFriendlyBtn = By.xpath("//span[text()='Shop Eco-Friendly']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnImage1() {
		driver.findElement(clickOnImage1).click();
	}
	
	public void clickOnShopNewYogaBtn() {
		driver.findElement(shopNewYogaBtn).click();
	}
	
	public void clickOnImage2() {
		driver.findElement(clickOnImage2).click();
	}
	
	public void clickOnShopPantsBtn() {
		driver.findElement(shopPantsBtn).click();
	}
	
	public void clickOnImage3() {
		driver.findElement(clickOnImage3).click();
	}
	
	public void clickOnShopTeesBtn() {
		driver.findElement(shopTeesBtn).click();
	}
	
	public void clickOnImage4() {
		driver.findElement(clickOnImage4).click();
	}
	
	public void clickOnShopErinRecommends() {
		driver.findElement(shopErinRecommends).click();
	}
	
	public void clickOnImage5() {
		driver.findElement(clickOnImage5).click();
	}
	
	public void clickOnShopPerformanceBtn() {
		driver.findElement(shopPerformanceBtn).click();
	}
	
	public void clickOnImage6() {
		driver.findElement(clickOnImage6).click();
	}
	
	public void clickOnShopEcoFriendlyBtn() {
		driver.findElement(shopEcoFriendlyBtn).click();
	}

}
