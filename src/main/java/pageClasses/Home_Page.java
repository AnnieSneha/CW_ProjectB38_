package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
    WebDriver driver;
	
	Actions act;
	
	public Home_Page(WebDriver driver) {
		
		// Assign the WebDriver instance to the class-level variable
		
		this.driver=driver;
		
		 // Initialize all WebElements in the Home_Page class using PageFactory
		
		PageFactory.initElements(driver, this);
		
		// Initialize the Actions class to handle complex user interactions
		
		act=new Actions(driver);
	}
	
	@FindBy(xpath = "//*[.='Shopping Categories']")
	
	private WebElement shopping_cat;
	
	@FindBy(linkText = "Apparel & Accessories")
	
	private WebElement apparel_access;
	
	//Getter Method

	public WebElement getShopping_cat() {
		
		return shopping_cat;
		
	}
	
	public WebElement getApparel_access() {
		
		return apparel_access;
		
	}
	
	public void Shopping_Cat() {
		
		 // Click on the 'Shopping Categories' element
		
		shopping_cat.click();
		
	    // Hover over the 'Apparel & Accessories' element using Actions
		
		act.moveToElement(apparel_access).build().perform();
	}

	

	
	
	
	

}
