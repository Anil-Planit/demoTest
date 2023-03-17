package test;

import org.testng.annotations.Test;

import pages.HomePage;

public class DemoTest extends BaseTest
{

    @Test
    public void DemoExample() throws InterruptedException
    {
    
    	// Application URL : https://magento.softwaretestingboard.com/
    	    
        HomePage homepage = new HomePage(driver);
        homepage.navigateTo("Women","Tops","Tees");
        
        String product1= "Gwyn Endurance Tee";
        
        // 1. addToCart(product1,"S","Yellow");
		
		// 2. Verify the message "You added Gwyn Endurance Tee to your shopping cart.”

		// 3. Click on the "shopping cart" link from above message

		// 4. Click proceed to Checkout

		// 5. Click next button from the bottom of the page

		// 6. Verify the warning message "The shipping method is missing. Select the shipping method and try again."
    }
}