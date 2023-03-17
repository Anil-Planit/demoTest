package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
	this.driver=driver;
	}
	
	
	public void navigateTo(String categoryName, String subCategogyName, String productType) throws InterruptedException {
		Thread.sleep(4000);
		
		WebElement category = driver.findElement(By.xpath("//nav[@class='navigation']//ul//li//a[text()='"+categoryName+"']"));
		new Actions(driver).moveToElement(category);
		
		Thread.sleep(1000);
		WebElement subCategory = driver.findElement(By.xpath("//*[@role=\"menu\"]//span[text()='"+subCategogyName+"']"));
		new Actions(driver).moveToElement(subCategory);
	
		WebElement productLink = driver.findElement(By.xpath("//*[@role=\"menu\"]//span[text()='"+productType+"']"));
		productLink.click();
	}
	
}