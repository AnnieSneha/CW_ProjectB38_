package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Apparel_Accessories {
	 
	WebDriver driver;
	
	Actions act;
	
	public Apparel_Accessories(WebDriver driver) {
		
		// Assign the WebDriver instance to the class-level variable
		
		this.driver=driver;
				
		// Initialize all WebElements in the Home_Page class using PageFactory
				
		PageFactory.initElements(driver, this);
				
	}
	
	@FindBy(linkText  = "Shawls")
	
	private WebElement shawls;
	
	@FindBy(linkText = "Dress Material")
	
	private WebElement dress_material;
	
	@FindBy(linkText = "Kurtis & Dupatta")
	
	private WebElement kurti_dupat;
	
	@FindBy(linkText = "Nightwear & Lingerie")
	
	private WebElement nightwear;
	
	@FindBy(linkText = "Trousers & Chino")
	
	private WebElement trousers;
	
	@FindBy(linkText = "Sportswear & Shorts")
	
	private WebElement shorts;
	
	@FindBy(linkText = "Jackets")
	
	private WebElement jackets;

	public WebElement getShawls() {
		
		return shawls;
	}

	public WebElement getDress_material() {
		
		return dress_material;
	}

	public WebElement getKurti_dupat() {
		
		return kurti_dupat;
	}

	public WebElement getNightwear() {
		
		return nightwear;
	}

	public WebElement getTrousers() {
		
		return trousers;
	}

	public WebElement getShorts() {
		
		return shorts;
	}

	public WebElement getJackets() {
		
		return jackets;
	}
    
	public void Shawls() {
		
		shawls.click();
		
	}
	public void Dress_Material() throws InterruptedException {
		
		dress_material.click();

	}
	public void Kurthi() {
		
		kurti_dupat.click();
	}
	public void NightWear() {
		
		nightwear.click();
		
	}
	public void Trousers() {
		
		trousers.click();
	}
	public void Jackets() {
		
		jackets.click();
		
	}
	public void Shorts() {
		
		shorts.click();
		
	}
	

}
