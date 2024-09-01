package step_definition;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AA_Mens {
	
	WebDriver driver;
	
	Actions act;
	
	SoftAssert sa;
	
	JavascriptExecutor js;
	
	ExtentReports reports;
 	
	ExtentTest tests;
	
	public static void capture(WebDriver driver,int n) throws IOException {
			
		// Cast the WebDriver instance to TakesScreenshot to enable screenshot functionality
		    
     	TakesScreenshot ts=(TakesScreenshot)driver; 
     	
     	// Capture the screenshot as a File object
     	
     	File image = ts.getScreenshotAs(OutputType.FILE);
			
       // Define the destination file path with a unique filename using the provided integer
    	
     	File img =new File("C:\\Users\\annie\\OneDrive\\Documents\\Desktop\\Construct_Week_B38\\CScreenShots" + n + ".png");//practice.png I should give here,so it will a craete a folder in the screeshot
			
	    FileUtils.copyFile(image, img);
			
	 }
	
	@Given("Open the browser,enter the Naaptol URL")
	
	public void open_the_browser_enter_the_naaptol_url() {
		
		// Initialize ExtentReports for test reporting with a specified output file path
		
        reports=new ExtentReports("C:\\Users\\annie\\OneDrive\\Documents\\Desktop\\Construct_Week_B38\\Cucumber(TestNG) Naaptol\\MReport.html");
		
        // Start a new test case with a descriptive name
        
		tests=reports.startTest("Naaptol Apparal and Accessoris Testing Using Cucumber(Mens Wear)");
		
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

	// Clicks on the 'Apparel and Accessories' link from the homepage
	
	@When("User clicks on the Apparel and Accessories from homepage")
	
	public void user_clicks_on_the_apparel_and_accessories_from_homepage() throws InterruptedException {
		
		js.executeScript("window.scrollBy(0,150);");
	
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/apparels-accessories.html\"])[2]")).click();
		
	}
	
	// Clicks on the 'Men's Wear' link

	@Then("User clicks on Mens Wear1")
	
	public void user_clicks_on_mens_wear1() {
		
		driver.findElement(By.xpath("(//a[.=\"Men's Wear\"])[2]")).click();
	     
	}
	
	// Verifies that the 'Men's Wear' page is displayed and takes a screenshot before closing the browser

	@Then("Mens Wear page should be displayed")
	
	public void mens_wear_page_should_be_displayed() throws IOException {
		
		tests.log(LogStatus.PASS, "Men's Wear Page is displayed");
		
		capture(driver, 40);
		
		driver.close();
		
		tests.log(LogStatus.PASS, "The Browser is  Closed");
	    
	}
	
	// Clicks on the 'Apparel and Accessories' link from the homepage (another step)

	@Given("User clicks on the Apparel and Accessories from homepage1")
	
	public void user_clicks_on_the_apparel_and_accessories_from_homepage1() {
		
		driver.findElement(By.xpath("(//a[@href=\"/shop-online/apparels-accessories.html\"])[2]")).click();
	}
    
	// Clicks on the 'Men's Wear' link (another step)
	
	@Given("User clicks on Mens Wear") // 
	
	public void user_clicks_on_mens_wear() {
		
		driver.findElement(By.xpath("(//a[.=\"Men's Wear\"])[2]")).click();
		
	}

	// Clicks on the 'Sportswear & Shorts' link
	
	@When("User clicks on SportsWear and Shorts")
	
	public void user_clicks_on_sports_wear_and_shorts() {
		
		driver.findElement(By.xpath("(//a[.=\"Sportswear & Shorts\"])[2]")).click();
		
	}
 
	// Applies filters for cash on delivery and excludes out of stock items, then clicks the 'Set' button

	@When("User clicks on Cash on delivery,Exclude out of stock checkbox and User Clicks on Set button")
	
	public void user_clicks_on_cash_on_delivery_exclude_out_of_stock_checkbox_and_user_clicks_on_set_button() throws InterruptedException {
		
		driver.findElement(By.linkText("Clear All [x]")).click();
       
		driver.findElement(By.id("iscod")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("isexoutStock")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.=' Set ']")).click();
	}
	
	// Clicks on the 'Scottish Club' brand checkbox

	@When("User clicks on Scottish Club Brand checkbox")
	
	public void user_clicks_on_scottish_club_brand_checkbox() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("Scottish Club")).click();
		
	}
	
	// Clicks on the 'Price Range' filter
	
	@When("User clicks on Price Range")
	
	public void user_clicks_on_price_range() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("priceFilterBox1")).click();
		
		Thread.sleep(2000);
		
	}
	
	// Applies a discount filter for more than 50%

	@When("User clicks on Discount of more than fifty checkbox")
	
	public void user_clicks_on_discount_of_more_than_fifty_checkbox() throws InterruptedException {
		
		Thread.sleep(2000);

        driver.findElement(By.id("discountFilterBox1")).click(); 
		
		Thread.sleep(2000);
	}
	// Selects the 'Sportswear' filter checkbox

	@When("User clicks On Sportswear filter checkbox")
	
	public void user_clicks_on_sportswear_filter_checkbox() throws InterruptedException { // 
		
		Thread.sleep(2000);
		
		 driver.findElement(By.name("Sportswear")).click(); 
	}
	// Selects the 'Lowers' filter checkbox
	
	@When("User clicks on Lowers type checkbox")
	
	public void user_clicks_on_lowers_type_checkbox() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("Lowers")).click(); 
		
	}
	// Selects the 'Polyester' material filter checkbox
	
	@When("User clicks on Polyester material checkbox")
	
	public void user_clicks_on_polyester_material_checkbox() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("Polyester")).click(); 
	}
    
	// Verifies that the 'No more results to display' message is shown and takes a screenshot before closing the browser

	@Then("No more results to display should be displayed in the Sportswearpage")
	
	public void no_more_results_to_display_should_be_displayed_in_the_sportswearpage() throws IOException {
		
		String shorts = driver.findElement(By.xpath("//div[.='No more results to display.']")).getText();
	    
	    sa.assertEquals( shorts,"No more results to display.");
	    
	    tests.log(LogStatus.PASS, "No more results to display message is asserted");
	    
	    capture(driver, 41);
	
	    driver.close();
	    
	    tests.log(LogStatus.PASS, "The Browser is  Closed");
	    
	}

	// Clicks on the 'Clear All' link to remove all applied filters

	@Given("User clicks on Clear All link in the Narrow Results")
	
	public void user_clicks_on_clear_all_link_in_the_narrow_results() {
		
		driver.findElement(By.cssSelector("[onclick=\"productSearch.clearAllFilter(false)\"]")).click();

	}
    
	// Applies filters for cash on delivery and excludes out of stock items, then clicks the 'Set' button (another step)

	@Given("User clicks on Cash on delivery,Exclude out of stock checkbox and User Clicks on Set button1")
	
	public void user_clicks_on_cash_on_delivery_exclude_out_of_stock_checkbox_and_user_clicks_on_set_button1() throws InterruptedException {
		
		driver.findElement(By.id("iscod")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.id("isexoutStock")).click();
		
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//span[.=' Set ']")).click();
	}

	// Clicks on the 'Sportswear & Shorts' link (another step)

	@Given("User clicks on Sportswear and Shorts")
	
	public void user_clicks_on_sportswear_and_shorts() {
		
		driver.findElement(By.xpath("(//a[.='Sportswear & Shorts'])[2]")).click();
	}
	
	// Clicks on the 'Add to Compare' checkboxes for three specific items

	@When("User clicks on Add to Compare1,Compare2 anf Compare3 checkbox")
	
	public void user_clicks_on_add_to_compare1_compare2_anf_compare3_checkbox() throws InterruptedException {
		
        js.executeScript("window.scrollBy(0,150);");
		
        Thread.sleep(1000);
        
		driver.findElement(By.id("cpid12613597")).click();
		
        Thread.sleep(1000);
        
		driver.findElement(By.id("cpid12609732")).click();

        Thread.sleep(1000);
		
		driver.findElement(By.id("cpid12609047")).click();
	}
	
	// Clicks on the 'Compare Now' button to view the comparison of selected items

	@When("User clicks on CompareNow button")
	
	public void user_clicks_on_compare_now_button() throws InterruptedException {
		
        js.executeScript("window.scrollBy(0,-150);");
        
        Thread.sleep(1000);
		
		driver.findElement(By.id("compareButton")).click();
	}
	
	// Selects 'Branded' from a dropdown menu

	@When("User Selects Branded from the dropdown")
	
	public void user_selects_branded_from_the_dropdown() {
		
		WebElement s1 = driver.findElement(By.className("dropDownCompare"));
		
		Select select=new Select(s1);
		
		select.selectByVisibleText("Branded");
	}
	
	// Clicks on the 'Pack of Lycra Shorts' link

	@Then("User clicks on Pack of lyrca shorts")
	
	public void user_clicks_on_pack_of_lyrca_shorts() throws InterruptedException  {
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("cpid12612931")).click();
		
		
	}
	
	// Verifies that 'Pack Of Lycra Stretchable Pants' is displayed and takes a screenshot before closing the browser

	@Then("Pack Of Lycra Stretchable Pants should be displayed")
	
	public void pack_of_lycra_stretchable_pants_should_be_displayed()throws IOException {
		
		String compare = driver.findElement(By.xpath("//td[.='Features']")).getText();
		    
		sa.assertEquals(compare,"Features");
		
		tests.log(LogStatus.PASS, "Compared the products of SportsWear and Shorts");
		
		capture(driver, 42);
		    
		driver.close();
		
	}
	
	// Clicks on the 'Jackets' link
	
	@Given("User clicks on jackets")
	
	public void user_clicks_on_jackets() {
		
		driver.findElement(By.xpath("(//a[.='Jackets'])[2]")).click();
		
	}
	
	// Applies various sorting options: 'Most Popular', 'New Arrivals', 'Highest Rated', 'Most Expensive', 'Cheapest'

	@When("User selects most popular,new arrivals,highest rated,most expensive,cheapest")
	
	public void user_selects_most_popular_new_arrivals_highest_rated_most_expensive_cheapest() throws InterruptedException {
		
		WebElement sort = driver.findElement(By.id("sortByFilter"));
		
		Select select=new Select(sort);
		
		select.selectByVisibleText("Most Popular");
		
		Thread.sleep(1000);
		
		select.selectByVisibleText("Highest Rated");
		
		Thread.sleep(1000);
		
		select.selectByVisibleText("Most Expensive");
		
		Thread.sleep(1000);
		
		select.selectByVisibleText("Cheapest");
		
		
	}
	
	// Ensures that 'Winter Gloves with Sensor' is displayed at the top of the list and takes a screenshot before closing the browser

	@Then("Winter Gloves should be visible in the first")
	
	public void winter_gloves_should_be_visible_in_the_first()	throws IOException { 
		
		String glove = driver.findElement(By.cssSelector("[title=\"Winter Gloves with Sensor\"]")).getText();
	    
		sa.assertEquals(glove,"Winter Gloves with Sensor");
		
		tests.log(LogStatus.PASS, "Winter Gloves Product is Displayed at the Top");
		
		capture(driver, 43);
		    
		driver.close();
		
		tests.log(LogStatus.PASS, "The Browser is  Closed");
		
	    reports.flush();
			
	    reports.endTest(tests);
	    
		}
		
	}



