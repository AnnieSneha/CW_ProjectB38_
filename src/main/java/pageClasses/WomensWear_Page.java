package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomensWear_Page {
	
 WebDriver driver;
	
	public WomensWear_Page(WebDriver driver) {
		
		// Assign the WebDriver instance to the class-level variable
		
		this.driver=driver;
				
		// Initialize all WebElements in the Home_Page class using PageFactory
				
		PageFactory.initElements(driver, this);
		
	} 
	
	//Dress material add everything
	
	//Kurthi Dupata: No
	
	//Add to Cart 1 Item
	
	//Shawls
	
	@FindBy(linkText = "Pick Any 1 Women's Wear Jacquard Designer Shawl (WJS-1)")
	
	private WebElement shawls1;
	
	@FindBy(xpath = "//a[.='Warm Shawls for Women - BOGO']")
	
	private WebElement shawls2;
	
	//Brand
    
	@FindBy(name = "Pakhi")
	
	private WebElement brand_pakhi;
	
    @FindBy(name = "Stylexa")
	
	private WebElement brand_style;

    @FindBy(name = "Amy Rose")

    private WebElement brand_amy;
  
    @FindBy(name = "Scottish Club")

     private WebElement brand_scotti;

     @FindBy(name = "Get In Shape")

     private WebElement brand_shape;
  
     @FindBy(name = "Vrindam Creations")

     private WebElement brand_create;

     @FindBy(name = "Branded")

     private WebElement brand_branded;
     
     //Price of Nighty
     @FindBy(id="priceFilterBox6")
     
     private WebElement sprice1;
     
    @FindBy(id="priceFilterBox3")
     
     private WebElement sprice2;

     @FindBy(id="priceFilterBox7")


     private WebElement sprice3;

     @FindBy(id="priceFilterBox1")

    private WebElement sprice4;

@FindBy(id="priceFilterBox2")

private WebElement sprice5;


@FindBy(id="priceFilterBox4")

private WebElement sprice6;


//No.of pCs

@FindBy(name="1 Pc")

private WebElement pc1;

@FindBy(name="2 Pc")

private WebElement pc2;

@FindBy(name="4 Pc")

private WebElement pc3;

//Type

@FindBy(name="Combo Sets")

private WebElement type_combo;

@FindBy(name="Nighties")

private WebElement type_night;	

@FindBy(name="Pyjama And Lounge Wear")

private WebElement type_pyjama;	
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
	
	@FindBy(css = "[cpid='12609732']")
	
	private WebElement compare2;
	
    @FindBy(css = "[cpid='12609732']")
	
	private WebElement compare3;
    
    //the item from dropdown {Pack of Lycra)
    
    @FindBy(id="cpid12612931")
    
    private WebElement compareItem;
    
    //Compare Now
    
    public WebElement getShawls1() {
    	
		return shawls1;
		
	}

	public WebElement getShawls2() {
		
		return shawls2;
		
	}

	public WebElement getBrand_pakhi() {
		
		return brand_pakhi;
		
	}

	public WebElement getBrand_style() {
		
		return brand_style;
	}

	public WebElement getBrand_amy() {
		
		return brand_amy;
		
	}

	public WebElement getBrand_scotti() {
		
		return brand_scotti;
		
	}

	public WebElement getBrand_shape() {
		
		return brand_shape;
		
	}

	public WebElement getBrand_create() {
		
		return brand_create;
		
	}

	public WebElement getBrand_branded() {
		
		return brand_branded;
	}

	public WebElement getSprice1() {
		return sprice1;
	}

	public WebElement getSprice2() {
		return sprice2;
	}

	public WebElement getSprice3() {
		return sprice3;
	}

	public WebElement getSprice4() {
		return sprice4;
	}

	public WebElement getSprice5() {
		return sprice5;
	}

	public WebElement getSprice6() {
		return sprice6;
	}

	public WebElement getPc1() {
		return pc1;
	}

	public WebElement getPc2() {
		return pc2;
	}

	public WebElement getPc3() {
		return pc3;
	}

	public WebElement getType_combo() {
		return type_combo;
	}

	public WebElement getType_night() {
		return type_night;
	}

	public WebElement getType_pyjama() {
		return type_pyjama;
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

	@FindBy(id="compareButton")
    
    private WebElement compareNow;
    
    @FindBy(css="[class='dropDownCompare']")
    
    private WebElement dd_brand;
    
    //Close button
    
    @FindBy(css="[title='Close']")
    
    private WebElement close_button;
    
    
    //Nightwear Brand
    
    public void Night_AllBrand() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	brand_amy.click();
    	Thread.sleep(1000);
    	brand_scotti.click();
    	Thread.sleep(1000);
    	brand_shape.click();
    	Thread.sleep(1000);
    	brand_style.click();

    	
    }
    
    //Click on all prices
    
    public void Night_AllPrice() throws InterruptedException {
    	
//    	Thread.sleep(200);
//    	sprice1.click();
    	Thread.sleep(1000);
    	sprice2.click();
    	Thread.sleep(1000);
    	sprice3.click();
    	Thread.sleep(1000);
    	sprice4.click();
    	Thread.sleep(1000);
    	sprice5.click();
    	Thread.sleep(1000);
    	sprice6.click();

    }
    
    //CLicks on type material
    
    public void Night_AllTypes() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	type_combo.click();
    	Thread.sleep(1000);
    	type_night.click();
    	Thread.sleep(1000);
    	type_pyjama.click();
    	
    }
    
    //CLicks on Pieces
    
    public void NightAll_Pcs() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	pc1.click();
    	Thread.sleep(1000);
    	pc2.click();
    	Thread.sleep(1000);
    	pc3.click();
    }
    
    public void Compare() {
    	
    	
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,150);");
    	compare1.click();
    	compare2.click();
    	compare3.click();
    	js.executeScript("window.scrollBy(0,-150);");
		compareNow.click();
        Select select=new Select(brand_amy);
        

    	
    }
    
    
   

    
    
}
