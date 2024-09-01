package generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageClasses.AddCompare_Page;
import pageClasses.Apparel_Accessories;
import pageClasses.Home_Page;
import pageClasses.MensWear_Page;
import pageClasses.Personal_Search;
import pageClasses.WomensWear_Page;

public class BaseTest {
	
	public WebDriver driver;
	
	String URL;
	
	//public String shorts_brand;
	
	public Home_Page home;
	
	public Apparel_Accessories apparel_access;
	
	public Personal_Search personal_search;
	
	public AddCompare_Page add_cart;
	
	public WomensWear_Page womens_wear;
	
	public MensWear_Page mens_wear;
	
	public TakesScreenshot ts;
	
	protected String mens;
	
	protected String Jmens;
	
	protected String Smens;
	
	protected String popular;
	
	protected String new1;
	
	protected String rate;
	
	protected String exp;
	
	protected String cheap;
	
	protected String rel;
	
	SoftAssert sa;
	
    public  ExtentReports reports;
	
	public ExtentTest tests;
	
@BeforeClass
	
    //Initializes the ExtentReports object and starts a test in the report

	public void extent_report() {
		
		reports=new ExtentReports("C:\\Users\\annie\\OneDrive\\Documents\\Desktop\\Construct_Week_B38\\Page Object Model Naaptol\\Report.html");
		
		tests=reports.startTest("Naaptol Apparal and Accessoris Testing Using POM Model");
	}
    
	
	
	@BeforeMethod
	
	public void setup() throws IOException {
		
		// Sets up the ChromeDriver and logs the browser opening event
		
		driver=new ChromeDriver();
		
		tests.log(LogStatus.PASS, "The Chrome Browser is Opened");
		
		// Loads properties from the config file
		
		Properties properties=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\annie\\OneDrive\\Documents\\Desktop\\Construct_Week_B38\\Page Object Model Naaptol\\src\\test\\resources\\config.properties");
		
		properties.load(file);
		
		// Retrieves the URL from properties and navigates to it
		
		URL = properties.getProperty("url");
		
		//shorts_brand=properties.getProperty(shorts_brand);
		
		driver.get(URL);
		
		tests.log(LogStatus.PASS, "The URL is entered");
		
		// Maximizes the browser window and sets an implicit wait time
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Initializes page objects for the test
		
		home = new Home_Page(driver);
		
		apparel_access=new Apparel_Accessories(driver);
		
		personal_search=new Personal_Search(driver);
		
		add_cart=new AddCompare_Page(driver);
		
		womens_wear=new WomensWear_Page(driver);
		
		mens_wear=new MensWear_Page(driver);
		
	    // Loads additional properties for the test
		
		mens = properties.getProperty("mens1");
		
		Smens = properties.getProperty("mens2");
		
		Jmens = properties.getProperty("mens3");
		
		popular = properties.getProperty("STpopular");
		
		new1 = properties.getProperty("STnew");
		
		rate = properties.getProperty("STrate");
		
		exp = properties.getProperty("STexp");
		
		cheap = properties.getProperty("STcheap");
		
		rel = properties.getProperty("STrel");
		
		
		
	}
	 public  void capture(WebDriver driver,int n) throws IOException {
			
		 // Cast the WebDriver instance to TakesScreenshot to enable screenshot functionality
		    
		 ts=(TakesScreenshot)driver; 
	     	
	     // Capture the screenshot as a File object
	     	
	     File image = ts.getScreenshotAs(OutputType.FILE);
			
		 File img =new File("C:\\Users\\annie\\OneDrive\\Documents\\screeshot\\practice" + n + ".png");
			
		 FileUtils.copyFile(image, img);
			
		}
	
	@AfterMethod
	
	public void teardown() {
		
		// Closes the browser and logs the event after each test method
		
    	driver.close();
    	
    	tests.log(LogStatus.PASS, "The Browser is  Closed");
		
	}
	

	@AfterClass
	
	// Closes the browser and logs the event after each test method
	
	public void flush() {
		
		reports.flush();
		
		reports.endTest(tests);
	}
	
	

}
