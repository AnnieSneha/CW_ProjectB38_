package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCompare_Page {
	
	WebDriver driver;
	
	public AddCompare_Page(WebDriver driver) {
		
		// Assign the WebDriver instance to the class-level variable
	    
		this.driver=driver;
		
		// Initialize all WebElements in the Home_Page class using PageFactory
		PageFactory.initElements(driver, this);
		
	}
	
	//Add to Cart 1 Item
	//Shawls
	
	@FindBy(linkText = "Pick Any 1 Women's Wear Jacquard Designer Shawl (WJS-1)")
	
	private WebElement shawls1;
	
	@FindBy(xpath = "//a[.='Warm Shawls for Women - BOGO']")
	
	private WebElement shawls2;
	
	//Color of Shawls 1
	
	@FindBy(xpath = "(//a[text()='Green'])[1]")
	
	private WebElement color_green;
	
	//Add to Cart button
	
	@FindBy(css  = ".red_button icon chat")
	
	private WebElement add_button;
	
	//Add to Compare 
	
	//SportsWear
	
	@FindBy(linkText = "Rocket Deal - 3 Comfortable Pants (3SPT2)")
	
	private WebElement shorts1;
	
	@FindBy(linkText = "Buy 1 Get 1 Track Pant for Men (2T1)")
	
	private WebElement shorts2;
	
	@FindBy(linkText = "Set of 2 Cotton Jogger for Men (2J1)")
	
	private WebElement shorts3;
	
	//Add to Compare button 1
	
    @FindBy(css = "[cpid='12613597']")
    
	private WebElement compare1;
    
    //Add to Compare button 2
	
	@FindBy(css = "[cpid='12609732']")
		
	private WebElement compare2;
	
	//Add to Compare button 3
	
    @FindBy(css = "[cpid='12609732']")
	
	private WebElement compare3;
    
    //the item from dropdown {Pack of Lycra)
    
    @FindBy(id="cpid12612931")
    
    private WebElement compareItem;
    
    //Compare Now
    
    @FindBy(id="compareButton")
    
    private WebElement compareNow;
    
    @FindBy(css="[class='dropDownCompare']")
    
    private WebElement dd_brand;
    
    //Close button
    
    @FindBy(css="[title='Close']")
    
    private WebElement close_button;
    
    //Getter Method

	public WebElement getShawls1() {
		
		return shawls1;
	}

	public WebElement getShawls2() {
		
		return shawls2;
	}

	public WebElement getColor_green() {
		
		return color_green;
	}

	public WebElement getAdd_button() {
		
		return add_button;
	}

	public WebElement getShorts1() {
		
		return shorts1;
	}

	public WebElement getShorts2() {
		
		return shorts2;
	}

	public WebElement getShorts3() {
		
		return shorts3;
	}

	public WebElement getCompare1() {
		
		return compare1;
	}

	public WebElement getCompare2() {
		
		return compare2;
	}

	public WebElement getCompare3() {
		
		return compare3;
	}

	public WebElement getCompareItem() {
		
		return compareItem;
	}

	public WebElement getCompareNow() {
		
		return compareNow;
	}

	public WebElement getDd_brand() {
		
		return dd_brand;
	}

	public WebElement getClose_button() {
		
		return close_button;
	}
	
    
}
    
    
	
	
	
	
	
	
	
	
	


