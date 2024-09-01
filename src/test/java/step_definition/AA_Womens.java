package step_definition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AA_Womens {
	
	 WebDriver driver;
	
	 Actions act;
	
	 SoftAssert sa;
	
	 WebDriverWait wait;
	
     JavascriptExecutor js;
     
     ExtentReports reports;
 	
 	 ExtentTest tests;
	
     public static void capture(WebDriver driver,int n) throws IOException {
           
        	// Cast the WebDriver instance to TakesScreenshot to enable screenshot functionality
	    
        	TakesScreenshot ts=(TakesScreenshot)driver; 
        	
        	// Capture the screenshot as a File object
        	
        	File image = ts.getScreenshotAs(OutputType.FILE);
        	
        	// Define the destination file path with a unique filename using the provided integer
        	
        	File img =new File("C:\\Users\\annie\\OneDrive\\Documents\\Desktop\\Construct_Week_B38\\CScreenShots" + n + ".png");
        	
        	FileUtils.copyFile(image, img);
		
	}
        
	
	@Given("Open the browser,enter the Naptol URL")
	
	public void open_the_browser_enter_the_naaptol_url() {
		
		// Initialize ExtentReports for test reporting with a specified output file path
		
        reports=new ExtentReports("C:\\Users\\annie\\OneDrive\\Documents\\Desktop\\Construct_Week_B38\\Cucumber(TestNG) Naaptol\\WReport.html");
		
        // Start a new test case with a descriptive name
        
		tests=reports.startTest("Naaptol Apparal and Accessoris Testing Using Cucumber(Womens Wear)");
		
		// Initialize the ChromeDriver to open a Chrome browser instance
		
		driver=new ChromeDriver();
		
		// Log the status of opening the Chrome browser
		
		tests.log(LogStatus.PASS, "The Chrome Browser is Opened");
		
		// Navigate to the Naaptol website
		
		driver.get("https://www.naaptol.com/");
		
		tests.log(LogStatus.PASS, "The URL is entered");
		
		// Maximize the browser window
		
		driver.manage().window().maximize();
		
		// Set implicit wait time for locating elements
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Initialize Actions class for performing complex user interactions
		
		act=new Actions(driver);
		
		// Initialize SoftAssert for soft assertions
		
		sa=new SoftAssert();
		
		// Initialize JavaScript Executor for executing JavaScript commands
		
		js=(JavascriptExecutor)driver;
		
	}
	
	// Clicks on the 'Shopping Categories' element on the homepage

	@Given("On the homepage click on Shopping Categories")
	
	public void on_the_homepage_click_on_shopping_categories() {
		
		driver.findElement(By.cssSelector("[class='arrowNav']")).click();
		
	}
	
	// Moves to the 'Apparel & Accessories' element in the dropdown menu

	@Given("User clicks on Apparel and Accessories from the dropdown")
	
	public void user_clicks_on_apparel_and_accessories_from_the_dropdown() {
		
		WebElement apparel = driver.findElement(By.linkText("Apparel & Accessories"));
		
		act.moveToElement(apparel).build().perform();
		
	}
	
	// Moves to the 'Apparel & Accessories' element in the dropdown menu

	@When("User clicks on Shawls from the dropdown")
	
	public void user_clicks_on_shawls_from_the_dropdown() {
		
		driver.findElement(By.linkText("Shawls")).click();
		
	}
	
	// Selects 'Cash on Delivery' option and checks 'Exclude Out of Stock' checkbox
	
	@When("User clicks on with cash on delivery and exculde out of stock checkbox")
	
	public void user_clicks_on_with_cash_on_delivery_and_exculde_out_of_stock_checkbox() throws InterruptedException {
		
		driver.findElement(By.id("iscod")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.id("isexoutStock")).click();
		
	}
	
	// Clicks on the 'Set' button to apply selected filters

	@Then("User clicks on Set button")
	
	public void user_clicks_on_set_button() {
		
		driver.findElement(By.xpath("//span[.=' Set ']")).click();
			
	}
	
	// Verifies that an item is displayed on the Shawls page
	
	@Then("Item should be displayed in the Shawls page.")
	
	public void item_should_be_displayed_in_the_shawls_page() throws IOException {
		
	    String shawl_text = driver.findElement(By.xpath("//div[.='No more results to display.']")).getText();
    
	    sa.assertEquals("No more results to display.", shawl_text);
	    
	    sa.assertAll();
	    
	    capture(driver, 20);
	    
		tests.log(LogStatus.PASS, "Searched for Shwals and Clicked on Cash on delivery and Out of stock checkboc");
	    
        driver.close();
        
        tests.log(LogStatus.PASS, "The Browser is  Closed");
	}
    
	// Enters "Kurthi" into the search bar on the homepage
	
	@Given("Search for Kurtis & Dupatta in the Search Bar")
	
	public void search_for_kurtis_dupatta_in_the_search_bar() {
		
		driver.findElement(By.id("header_search_text")).sendKeys("Kurthi");

	}
	
	// Clicks on the search icon to initiate the search

	@When("User clicks on Seacrh bar icon")
	
	public void user_clicks_on_seacrh_bar_icon() {
		
		driver.findElement(By.xpath("(//div[@class='search'])[2]")).click();
		
	}
	
	// Clicks on "Clear All [x]" to reset any applied filters

	@When("User clicks on the Clear all from the Narrow Results")
	
	public void user_clicks_on_the_clear_all_from_the_narrow_results() throws InterruptedException {
		
		Thread.sleep(200);
		
		driver.findElement(By.linkText("Clear All [x]")).click();
		
	}
	
	// Selects the 'Exclude Out of Stock' checkbox and clicks the 'Set' button to apply the filter

	@When("User clicks on Set button1")
	
	public void user_clicks_on_set_button1() {
		
		driver.findElement(By.id("isexoutStock")).click();
		
		driver.findElement(By.xpath("//span[.=' Set ']")).click();
	    
	}
	
	// Verifies that the search results include items related to Kurtis and Dupatta, takes a screenshot, and closes the browser

	@Then("The Kurtis and Dupatta items should be displayed")
	
	public void the_kurtis_and_dupatta_items_should_be_displayed() throws IOException {
		
		String kurthi_text = driver.findElement(By.xpath("//span[.='Search Results For :']")).getText();
		
		sa.assertEquals(kurthi_text,"Search Results For :");
		
		sa.assertAll();
		
		capture(driver, 21);
		
		tests.log(LogStatus.PASS, "Searched for Kurthis and Dupatta");
		
		driver.close();
	        
	    tests.log(LogStatus.PASS, "The Browser is  Closed");

	}
	
	// Clicks on the 'Dress Material' link

	@When("User clicks on Dress Material")
	
	public void user_clicks_on_dress_material() {
		
		driver.findElement(By.linkText("Dress Material")).click();
		
	}
	
	// Performs a mouse-over action on the 'Quick View' element for the 'Printed Dress Material Set'

	
	@Then("User mouse overs on Quik view")
	
	public void user_mouse_overs_on_quik_view()  throws IOException {
		
        WebElement dress = driver.findElement(By.xpath("//a[text()='Printed Dress Material Set + 1 Kurti Fabric Free - Pick Any ']"));
		
		act.moveToElement(dress).build().perform();
		
		tests.log(LogStatus.PASS, "Searched for Dress material and performed mouse over");

		capture(driver, 22);
	
	}
	
	// Ensures that the 'Printed Dress Material' is visible on the page and closes the browser

	
	@Then("The Printed Dress Material should be visible")
	
	public void the_printed_dress_material_should_be_visible(){
		
		 driver.close();
	        
	     tests.log(LogStatus.PASS, "The Browser is  Closed");
		
		
	}
	
	// Clicks on the 'Nightwear & Lingerie' link
	
	@When("User clicks on Nightwear")
	
	public void user_clicks_on_nightwear() {
		
		driver.findElement(By.linkText("Nightwear & Lingerie")).click();
		
	}
	
	// Selects multiple brands from the 'Brands' filter in the Nightwear section

	@Then("User clicks on Pakhi,Stylexa,Amy Rose,Scottish Club,Get In Shape from Brands")
	
	public void user_clicks_on_pakhi_stylexa_amy_rose_scottish_club_get_in_shape_from_brands() throws InterruptedException {
		
		   // WebElement pakhi = wait.until(ExpectedConditions.stalenessOfBy.name("Pakhi")));
		    //pakhi.click();
		Thread.sleep(1000);
        driver.findElement(By.name("Stylexa")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Amy Rose")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Scottish Club")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("Get In Shape")).click();
		 
	}
	
	// Verifies that items are displayed on the Nightwear page and takes a screenshot before closing the browser

	@Then("Items should be displayed in the Nightwear page")
	
	public void items_should_be_displayed_in_the_nightwear_page() throws IOException {
		
		String nightwear_text = driver.findElement(By.xpath("//div[.='No more results to display.']")).getText();
	    
	    sa.assertEquals("No more results to display.",nightwear_text);
	    
	    sa.assertAll();
	    
	    capture(driver, 23);
	    
	    tests.log(LogStatus.PASS, "Cicked on the checkboxs");
	    
	    driver.close();
        
        tests.log(LogStatus.PASS, "The Browser is  Closed");
		
	}
	
	// Selects all available price filter checkboxes and takes a screenshot

	@Then("User clicks on the all the checkboxs of price filter")
	
	public void user_clicks_on_the_all_the_checkboxs_of_price_filter() throws InterruptedException, IOException {
		
		Thread.sleep(1000);
		driver.findElement(By.id("priceFilterBox5")).click();//priceFilterBox5
		Thread.sleep(1000);
		driver.findElement(By.id("priceFilterBox6")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("priceFilterBox3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("priceFilterBox7")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("priceFilterBox1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("priceFilterBox2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("priceFilterBox4")).click();
        Thread.sleep(1000);
        
        capture(driver, 24);
        
        tests.log(LogStatus.PASS, "Clicked on all the prices checkboxes");
        
        driver.close();
        
        tests.log(LogStatus.PASS, "The Browser is  Closed");
		
	}
    
	// Applies filters for '50% Discount' and 'Acrylic' material and takes a screenshot

	@Then("User clicks on Discount of fifty percent and Material of Acrylic")
	
	public void user_clicks_on_discount_of_fifty_percent_and_material_of_acrylic() throws InterruptedException, IOException {
		
		driver.findElement(By.id("discountFilterBox1")).click(); 
		
		Thread.sleep(200);

		driver.findElement(By.id("featureFilterBox0f1")).click();
		
		Thread.sleep(300);
		
		capture(driver, 25);
		
	}
	
	// Clicks on the 'Womens Wear' link from the navigation bar

	@When("User clicks on the Womens Wear from the navigation bar")
	
	public void user_clicks_on_the_womens_wear_from_the_navigation_bar() {
		
		driver.findElement(By.xpath("(//a[@href='/shop-online/apparels-accessories/womens-wear.html'])[2]")).click();
		
	}
	
	// Clicks on the 'Kurthis & Dupatta' link
	
	@When("User clicks on Kurthi & Dupatta")
	
	public void user_clicks_on_kurthi_dupatta() {

		driver.findElement(By.xpath("(//a[@title='Kurtis & Dupatta'])[1]")).click();
	}
	
	// Checks that the 'Kurthis and Dupatta' page displays the appropriate error message if no products are found, takes a screenshot, and closes the browser

	@Then("Kurthi and Dupatta page should be displayed")
	
	public void kurthi_and_dupatta_page_should_be_displayed() throws IOException {
		
	    String error_msg = driver.findElement(By.cssSelector("[class='errorMsg']")).getText();
	    
	    sa.assertEquals(error_msg,"No product found for this filter combination, remove some of the filters to see products");
	    
	    sa.assertAll();
	    
        capture(driver, 26);
        
        tests.log(LogStatus.PASS, "Clicked on different checkboxes of Personalise Search");
        
	    driver.close();
	    
	    tests.log(LogStatus.PASS, "The Browser is  Closed");
	    
	}
	
	// Clicks on the 'Warm Shawls' link and switches to a new browser window

	@When("Click on Warm Shawls")
	
	public void click_on_warm_shawls() throws IOException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.xpath("(//a[@title='Warm Shawls for Women - BOGO'])[2]")).click();
		
		//driver.findElement(By.xpath("//span[.='Shawls']")).click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		Set<String> All_Win = driver.getWindowHandles();
		
		for (String next : All_Win) {
			
			if(!next.equals(parent)) {
				
				driver.switchTo().window(next);
				
				break;
			}
			
		}
		
		driver.switchTo().window(parent);
		
		capture(driver, 27);
		
		tests.log(LogStatus.PASS, "Switched to multpile windows");
		
		driver.close();
		
	}

	//// Verifies that the 'Add to Cart' button is displayed and quits the browser
	
	@Then("Add to cart should be displayed")
	
	public void add_to_cart_should_be_displayed() throws IOException {
		 
		driver.quit();
		 
		 tests.log(LogStatus.PASS, "The Browser is  Closed");
		
	}
	
	// Clicks on 'Add to Compare' buttons for three specific items

	@When("Click on Add to compare1,compare2,compare3")
	
	public void click_on_add_to_compare1_compare2_compare3() throws InterruptedException {
		
		js.executeScript("window.scrollBy(0,150);");
		
		driver.findElement(By.id("cpid12612091")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.id("cpid12612782")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.id("cpid12611904")).click();
		
	}
	
	// Clicks on the 'Compare Now' button to view the comparison of selected items

	@Then("Click on CompareNow button")
	
	public void click_on_compare_now_button() {
		
		js.executeScript("window.scrollBy(0,-150);");
		
		driver.findElement(By.id("compareButton")).click();
		
		
	}
	
	// Verifies that the 'Add to Compare' section is displayed and takes a screenshot before closing the browser

	@Then("Add To Compare Should be displayed")
	
	public void add_to_compare_should_be_displayed() throws IOException {
		
	    String compare = driver.findElement(By.xpath("//td[.='Main feature']")).getText();
	    
	    sa.assertEquals("Main feature", compare);
	    
	    sa.assertAll();
	    
	    capture(driver, 28);
	    
	    tests.log(LogStatus.PASS, "Compared different Nightwear Products ");
	    
	    driver.close();
	    
	    tests.log(LogStatus.PASS, "The Browser is  Closed");
	}
	
	// Selects 'Pakhi' and 'Scottish Club' brands from the filter
	
	@When("User Clicks on Pakhi and Scottish Club")
	
	public void user_clicks_on_pakhi_and_scottish_club() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("Pakhi")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("Scottish Club")).click();
		
		Thread.sleep(2000);
		
		
	}
	
	// Selects a price filter checkbox
	
	@When("User Clicks on Price")
	
	public void user_clicks_on_price() throws InterruptedException {
		
		driver.findElement(By.id("priceFilterBox1")).click();
		
		Thread.sleep(2000);
	}
	
	// Applies a discount filter for more than 50%

	@When("User Clicks on discount more than fifty")
	
	public void user_clicks_on_discount_more_than_fifty() throws InterruptedException {
		
		driver.findElement(By.id("discountFilterBox1")).click();

        Thread.sleep(2000);
        
	}
	
	// Selects the 'One Piece' filter option

	@When("User Clicks on no. of pcs onepc")
	
	public void user_clicks_on_no_of_pcs_onepc() throws InterruptedException {
		
		driver.findElement(By.id("featureFilterBox0f1")).click();
		
		Thread.sleep(2000);
	       	
	}
	
	// Selects the 'Long' length filter option

	@When("User Clicks on length long")
	
	public void user_clicks_on_length_long() throws InterruptedException {
		
		driver.findElement(By.name("Long")).click();
		
	    Thread.sleep(2000);
	        
	}
	
	// Ensures that the 'Designer Maxi Nighty' is displayed and takes a screenshot before closing the browser

	@Then("Designer Maxi Nighty should be displayed")
	
	public void designer_maxi_noghty_should_be_displayed() throws IOException {
		
       String nightwear_text = driver.findElement(By.xpath("//div[.='No more results to display.']")).getText();
	    
	    sa.assertEquals("No more results to display.",nightwear_text);
	    
	    sa.assertAll();
	    
	    capture(driver, 29);
	    
	    tests.log(LogStatus.PASS, "Asserted the page of Nightwear after clicking all the checkbox");
	    
	    driver.close();
	    
	    tests.log(LogStatus.PASS, "The Browser is  Closed");
	    
        reports.flush();
		
		reports.endTest(tests);
	    
	}
	
	// Clicks on a link to view the 'Mughal Inspired' dress

	@When("Click on Mughal Insipired dress")
	
	public void click_on_mughal_insipired_dress() {
		
		driver.findElement(By.xpath("//a[@title='Collection of 7 Mughal Inspired Printed Dress Material (7PDM11)']")).click();
		
	}
	
	// Verifies that the 'Currently Not Available' message is displayed for the item and closes the browser

	@Then("No offer for sale on Naaptol should be displayed")
	
	public void no_offer_for_sale_on_naaptol_should_be_displayed() throws IOException {
		
		String not_avail = driver.findElement(By.xpath("(//span[.='Currently Not Available'])[1]")).getText();
		
		sa.assertEquals(not_avail,"Currently Not Available");
		
		sa.assertAll();
		
		capture(driver, 28);
		
		tests.log(LogStatus.PASS, "Asserted the Out of stock item");
		
		driver.quit();
		
		tests.log(LogStatus.PASS, "The Browser is  Closed");
		
        reports.flush();
		
		reports.endTest(tests);
		
	}

	
}
	
