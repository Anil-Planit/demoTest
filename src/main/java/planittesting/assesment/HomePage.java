<<<<<<< HEAD
package planittesting.assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage
{
    
	public HomePage(WebDriver driver) {
	super(driver);
	}
	
	
	public void navigateTo(String categoryName, String productType) {
		
		WebElement category = driver.findElement(By.xpath("//nav[@class=\"navigation\"]//ul//span[text()='"+categoryName+"']"));
		new Actions(driver).moveToElement(category);
	
		WebElement productLink = driver.findElement(By.xpath("//*[@role=\"menu\"]//span[text()='"+productType+"']"));
		productLink.click();
	}

}
=======
package planittesting.assesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage
{
    
	public HomePage(WebDriver driver) {
	super(driver);
	}
	
	
	public void navigateTo(String categoryName, String productType) {
		
		WebElement category = driver.findElement(By.xpath("//nav[@class=\"navigation\"]//ul//span[text()='"+categoryName+"']"));
		new Actions(driver).moveToElement(category);
	
		WebElement productLink = driver.findElement(By.xpath("//*[@role=\"menu\"]//span[text()='"+productType+"']"));
		productLink.click();
	}

}
>>>>>>> branch 'main' of https://github.com/Anil-Planit/demoTest.git
