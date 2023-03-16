package planittesting.assesment;

import org.testng.annotations.Test;

public class DemoTest extends BaseTest
{

    @Test
    public void DemoExample() throws InterruptedException
    {
    
    	// Application URL : https://magento.softwaretestingboard.com/
    	    
        HomePage homepage = new HomePage(driver);
        homepage.navigateTo("Women","Tops","Tees");
        
        String product1= "Gwyn Endurance Tee";
        String product2="Iris Workout Top";
        
		// Create a method to add multiple products to cart from the same page

		// 1. addToCart(product1,"S","Yellow");
		
		// 2. Verify the message "You added Gwyn Endurance Tee to your shopping cart.”

		// 3. addToCart(product2,"XL","Green");
		
		// 4. Verify the message "You added Iris Workout Top to your shopping cart.”

		// 5. Click on the "shopping cart" link from above message

		// 6. Click proceed to Checkout

		// 7. Click next button from the bottom of the page

		// 8. Verify the warning message "The shipping method is missing. Select the shipping method and try again."
    }
}
