package test;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.LogStatus;
import generics.BaseTest;


public class FinalTest extends BaseTest{
    
	@Test(priority = 4)
	
	// Verify the error message when filtering Women's Shawls with Asserting the checkbox of the Cash,Exclude and Free Shipping
	
	public void Womens_ShawlsCEF() throws InterruptedException, IOException {
		
		//Dress material
		
		home.Shopping_Cat();
		
		apparel_access.Dress_Material();
		
		personal_search.CashExculdeFree();	
		
        SoftAssert sa=new SoftAssert();
		
		String title=driver.findElement(By.cssSelector("[class=\"errorMsg\"]")).getText();
		
		sa.assertEquals(title, "No product found for this filter combination, remove some of the filters to see products");
		
		sa.assertAll();
		
		tests.log(LogStatus.PASS, "Successfully asserted the Error Message after clicking on the checkboxs");
		
		capture(driver,1);
		
	 
	}
	@Test 
	
	// Verify the "Currently Not Available" message when searching for Women's Kurthi
	
	public void  Womens_Kurthi() throws InterruptedException, IOException {
		
		home.Shopping_Cat();
		
		apparel_access.Kurthi();
		
		personal_search.ClearAll();  
		
        SoftAssert sa=new SoftAssert();
		
		String title=driver.findElement(By.xpath("(//span[.='Currently Not Available'])[1]")).getText();
		
		sa.assertEquals(title, "Currently Not Available");
		
		sa.assertAll();
		
		tests.log(LogStatus.PASS, "Searched for Kurthi and Dupatta");
		
		capture(driver,2);
		
	}
	
	@Test
	
	// Verify the functionality of the "Exclude Out of Stock" filter on Women's Dress
	
	public void Womens_Dress() throws InterruptedException, IOException {
		
		home.Shopping_Cat();
		
		apparel_access.Dress_Material();
		
      	personal_search.ClearAll(); 
		
      	Thread.sleep(2000);
      	
		WebElement check1 = driver.findElement(By.id("isexoutStock"));
		
		Assert.assertTrue(check1.isDisplayed());
		
		check1.click();
		
		tests.log(LogStatus.PASS, "Asserted the Checkbox of Exclude Out of Stock");
		
		capture(driver,3);

	}
	
	@Test 
	
	// Verify the product title after applying the brand filter on Women's Nightwear

	
	public void Womens_Nbrand() throws InterruptedException, IOException {
		
       home.Shopping_Cat();
		
	   apparel_access.NightWear();
		
	   personal_search.ClearAll();
	   
	   capture(driver,4);
	   
	   womens_wear.Night_AllBrand();
	   
	   SoftAssert sa=new SoftAssert();
		
	   String title=driver.findElement(By.xpath("(//a[@title=\"Pack of 4 Assorted 100% Cotton Nightwear by Stylexa\"])[1]")).getText();
		
	   sa.assertEquals(title, "Pack of 4 Assorted 100% Cotton Nightwear by Stylexa");
		
	   sa.assertAll();
	   
	   tests.log(LogStatus.PASS, "Clicked on all the Brand filter of Nightwear Page");
	   
	   capture(driver,5);
	   
	}
	
	// Verify the price filter functionality on Women's Nightwear page
	
	@Test
	
	public void Womens_NPrice() throws InterruptedException, IOException {
		
		home.Shopping_Cat();
		
		apparel_access.NightWear();
		
		personal_search.ClearAll();
		
		womens_wear.Night_AllPrice();
		
		tests.log(LogStatus.PASS, "Clicked on all the Price filter of Nightwear Page");
		
		capture(driver, 6);
	}
	
	@Test
	
	// Verify the PCS filter functionality on Women's Nightwear page
	
	public void Womens_NPcs() throws InterruptedException, IOException {
		
		   home.Shopping_Cat();
		
		   apparel_access.NightWear();
		   
		   personal_search.ClearAll();
		   
		   womens_wear.NightAll_Pcs();
		   
		   tests.log(LogStatus.PASS, "Clicked on all the Pcs filter of Nightwear Page");
		   
		   capture(driver, 7);
		
	}
	
	@Test
	
	// Verify the brand and price filters functionality on Women's Nightwear page
	
	public void Womens_NAll() throws InterruptedException, IOException {
		
		   home.Shopping_Cat();
			
		   apparel_access.NightWear();
		   
		   personal_search.ClearAll();
		   
		   womens_wear.Night_AllBrand();
		   
		   womens_wear.getSprice1().click();
		   
		   tests.log(LogStatus.PASS, "Clicked on all the Brand filter and price filter of Nightwear Page");
		   
		   capture(driver, 8);

	}
	
	@Test
	
	// Verify the type filter functionality on Women's Nightwear page
	
	public void Womens_NTypes() throws InterruptedException, IOException {
		
		   home.Shopping_Cat();
			
		   apparel_access.NightWear();
		   
		   personal_search.ClearAll();
		   
		   womens_wear.Night_AllTypes();
		   
		   tests.log(LogStatus.PASS, "Clicked on all the Types filter of Nightwear Page");
		   
		   capture(driver, 9);
	}
	

	@Test
	
	// Verify the search functionality for Men's wear items
	
	public void Mens_Search() throws IOException  {
		
		mens_wear.Search(mens);
	
		mens_wear.getSearch_icon().click();
		
		personal_search.ClearAll();
		
		personal_search.getCash_delivery();
		
		personal_search.getSet_button().click();
		
		SoftAssert sa=new SoftAssert();
		
		String title=driver.findElement(By.xpath("(//a[@title=\"Mr. Tusker Set of 3 Denims (MT2)\"])[1]")).getText();
			
		sa.assertEquals(title, "Mr. Tusker Set of 3 Denims (MT2)");
			
		sa.assertAll();
		
		tests.log(LogStatus.PASS, "Searched for Shorts using the search text box");
		   
	    capture(driver,10);
		
		
	}
	
	@Test(priority = 2)
	
	// Verify the search results for Women's Kurthi from Apparel and Accessories
	
	public void Womans_Kurthi() throws InterruptedException, IOException {
		
		
		home.Shopping_Cat();
		
		apparel_access.Kurthi();
		
		personal_search.ClearAll();
		
		personal_search.CashExculdeFree();
		
        SoftAssert sa=new SoftAssert();
		
		String title=driver.findElement(By.cssSelector("[class=\"errorMsg\"]")).getText();
		
		sa.assertEquals(title, "No product found for this filter combination, remove some of the filters to see products");
		
		sa.assertAll();
		
		tests.log(LogStatus.PASS, "Searched for Kurthi from Apparel and Accessories");
		
		capture(driver, 11);
		
	}
	
	@Test
	
	// Verify the "Add to Compare" feature functionality for selected items
	
	public void CompareItems() throws InterruptedException, IOException {
		
        home.Shopping_Cat();
		
		apparel_access.Shorts();
		
		personal_search.ClearAll();
		
	    personal_search.CashOnDelivery();
	    
	    mens_wear.SCompare();
	    
	    SoftAssert sa=new SoftAssert();
	    
        String compare = driver.findElement(By.xpath("//td[.='Features']")).getText();
	    
	    sa.assertEquals("Features", compare);
	    
	    tests.log(LogStatus.PASS, "Added the items to Add to Compare feature");
	    
	    capture(driver, 12);
	    
		
	}
	
	@Test
	
	// Verify the search functionality for multiple Men's wear items
	
	public void Search_Mall() throws IOException {
		
		mens_wear.MSearchAll(mens, Smens, Jmens);
		
        SoftAssert sa=new SoftAssert();
		
		String title=driver.findElement(By.xpath("(//a[@title=\"Pick Any 1 Raincoat for Men by Scottish Club\"])[2]")).getText();
			
		sa.assertEquals(title, "Pick Any 1 Raincoat for Men by Scottish Club");
			
		sa.assertAll();
		
		tests.log(LogStatus.PASS, "Searched for Trousers,Shorts and Jackets using the search text box");
		   
	    capture(driver,13);
		
	    
	}
	
	@Test
	
	public void SortBy() throws InterruptedException, IOException {
		
		// Verify the sort functionality for Jackets based on different criteria
		
		mens_wear.Search(Jmens);
		
		mens_wear.getSearch_icon().click();
		
		mens_wear.JsortAll(popular, new1, rate, exp, cheap, rel);
		
        SoftAssert sa=new SoftAssert();
		
		String title=driver.findElement(By.xpath("(//a[@title=\"Pick Any 1 Fleece Jacket with Front Pockets (1FJ3)\"])[1]")).getText();
			
		sa.assertEquals(title, "Pick Any 1 Fleece Jacket with Front Pockets (1FJ3)");
			
		sa.assertAll();
		   
	    capture(driver,14);
		
		
	}
	
	
}
