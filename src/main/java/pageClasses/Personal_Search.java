package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Search {
	
    WebDriver driver;
	
	public Personal_Search(WebDriver driver) {
		
		// Assign the WebDriver instance to the class-level variable
		
	    this.driver=driver;
				
	    // Initialize all WebElements in the Home_Page class using PageFactory
				
	    PageFactory.initElements(driver, this);
				
		// Initialize the Actions class to handle complex user interactions;
	}
	
	@FindBy(id = "iscod")
	
	private WebElement cash_delivery;
	
	@FindBy(id="isexoutStock")
	
	private WebElement out_stock;
	
	@FindBy(id="isfreeship")
	
	private WebElement freeshipping;
	
	@FindBy (xpath = "//span[.=' Set ']")
	
	private WebElement set_button;
	
	@FindBy(name = "Pakhi")
	
	private WebElement sbrand_pakhi;
	
	@FindBy(id="priceFilterBox1")
	
	private WebElement sprice_box;
	
	@FindBy(id="discountFilterBox1")
	
	private WebElement sdiscount_box;
	
	@FindBy(id = "featureFilterBox0f1")
	
	private WebElement smaterial_box;
	
	@FindBy(xpath = "(//a[.='Clear All [x]'])[1]")
	
	private WebElement clearall;
	

	public WebElement getClearall() {
		
		return clearall;
	}


	public WebElement getCash_delivery() {
		
		return cash_delivery;
		
	}

	public WebElement getOut_stock() {
		
		return out_stock;
		
	}
	public WebElement getFreeshipping() {
		
		return freeshipping;
	}

	public WebElement getSet_button() {
		
		return set_button;	
	}

	public WebElement getSBrand_pakhi() {
		
		return sbrand_pakhi;
	}
	
	public WebElement getSPrice_box() {
		
		return sprice_box;
	}

	public WebElement getSDiscount_box() {
		
		return sdiscount_box;
	}

	
	//Creating a method for cash on delivery,out of stock,free shipping
	
	public void CashExculdeFree() throws InterruptedException {
		
		
		clearall.click();
		cash_delivery.click();
		Thread.sleep(1000);
		out_stock.click();
		Thread.sleep(1000);
		freeshipping.click();
		Thread.sleep(1000);
		set_button.click();
		
	}
	//Creating a method for out of stock option
	
	public void Exclude() throws InterruptedException {
		
		clearall.click();
		out_stock.click();
		Thread.sleep(1000);
		set_button.click();
		Thread.sleep(1000);
		
	}
	
	//Creating a method for Cash on delivery
	
	public void CashOnDelivery() throws InterruptedException {
		
		
		cash_delivery.click();
		Thread.sleep(1000);
		out_stock.click();
		Thread.sleep(1000);
		set_button.click();
		
	}
	
	//Creating a method for to Check all the items present in the Personalise Search
	
	public void Search1() throws InterruptedException {
		
		clearall.click();
		cash_delivery.click();
		Thread.sleep(2000);
        out_stock.click();
        set_button.click();
        sbrand_pakhi.click();
        sprice_box.click();
        sdiscount_box.click();
        
	}
	
	//Only clear only button
	
	public void ClearAll() {
		
		clearall.click();
	}

		

}
