package pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MensWear_Page {
	
	 WebDriver driver;
		
		public MensWear_Page(WebDriver driver) {
			
			// Assign the WebDriver instance to the class-level variable
			
			this.driver=driver;
			
			// Initialize all WebElements in the Home_Page class using PageFactory
			
			PageFactory.initElements(driver, this);
			
		}
		//Search bar enter jackets clear,shorts clear,trousers and assert
		
		@FindBy(id = "header_search_text")
		
		private WebElement search_box;
		
		@FindBy(xpath="(//div[@class='search'])[2]")
		
		private WebElement search_icon;
		
		 @FindBy(name = "Scottish Club")

	     private WebElement Mbrand_scotti;
		
		 @FindBy(name = "Branded")

	     private WebElement Mbrand_branded;
		 
		 @FindBy(id="priceFilterBox2")

		 private WebElement Mprice1;
		 
		 @FindBy(id="priceFilterBox3")
		     
		 private WebElement Mprice2;
		 
		 @FindBy(id="priceFilterBox1")

		 private WebElement Mprice3;
		 
		 @FindBy(name="Sportswear")

		 private WebElement product1;

		 @FindBy(name="Lowers")

		 private WebElement type1;
		 
		 @FindBy(name="Polyester")

		 private WebElement material1;
		 
		 @FindBy(xpath = "(//a[.='Buy 1 Get 1 Track Pant for Men (2T1)'])[1]")
		 
		 private WebElement shorts1;
		 
		 @FindBy(id="cpid12613597")
	     
		 private WebElement Scompare1 ;
		 
		 @FindBy(id="cpid12609732")
			     
		 private WebElement Scompare2;
		 
		 @FindBy(id="cpid12609047")
			     
		 private WebElement Scompare3;
		 
		 @FindBy(id="compareButton")
	     
		 private WebElement compareButton;
		 
		 @FindBy(id="dropDownCompare")
		 
		 private WebElement Jdrop1;  //dropdown
		 
		 @FindBy(id="cpid12607834")
	     
		 private WebElement JIndigo; //Indigo and after main feature
		 
		 @FindBy(xpath = "(//a[@title=\"Pick Any 1 Hoodie Jacket with Sporty Watch Free (1HP3)\"])[2]")
		 
		 private WebElement Jdress1;
		 
         @FindBy(xpath = "(//a[@title=\"3 Layer Super Warm Puffer Jacket with Hood (MPJ-1)\"])[2]")
		 
		 private WebElement Jdress2;
		 
         @FindBy(xpath = "(//a[@title=\"Pick Any 1 Fleece Jacket with Free Designer Watch (1FJ7)\"])[2]")
		 
		 private WebElement Jdress3;
         
         @FindBy(xpath = "(//a[text()='Blue-XL'])[1]")
     	
     	 private WebElement Jcolor_blue1; 
     	 
     	 @FindBy(xpath = "(//a[text()='Black-L'])[1]")
      	
     	 private WebElement Jcolor_black2;
         
     	@FindBy(xpath = "(//a[text()='Yellow-M'])[1]")
      	
    	 private WebElement Jcolor_yellow3;
        
         @FindBy(css = "[title=\"Buy online\"]")
         
         private WebElement click_to_buy;
         
         @FindBy(xpath = "(//a[@class='link_Continue'])[1]")
         
         private WebElement continue_button;
         
         //Naviagtion Bar
         
         @FindBy(xpath = "//span[.='Jackets']")
         
         private WebElement nav_jacket;
         
         @FindBy(xpath = "(//a[@href='/shop-online/apparels-accessories/mens-wear.html'])[2]")
         
         private WebElement mens_wear_nav;
         
         //Sort BY
         
         @FindBy(id="sortByFilter")
         
         private WebElement sort;
         
         //Getter Method

		public WebElement getSearch_box() {
			
			return search_box;
			
		}
		
		public WebElement getSearch_icon() {
			
			return search_icon;
			
		}
		
		public WebElement getMbrand_scotti() {
			
			return Mbrand_scotti;
			
		}

		public WebElement getMbrand_branded() {
			
			return Mbrand_branded;
			
		}

		public WebElement getMprice1() {
			
			return Mprice1;
			
		}
		
		public WebElement getMprice2() {
			
			return Mprice2;
			
		}

		public WebElement getMprice3() {
			
			return Mprice3;
			
		}

		public WebElement getProduct1() {
			
			return product1;
			
		}

		public WebElement getType1() {
			
			return type1;
			
		}

		public WebElement getMaterial1() {
			
			return material1;
			
		}

		public WebElement getShorts1() {
			
			return shorts1;
			
		}

		public WebElement getScompare1() {
			
			return Scompare1;
			
		}

		public WebElement getScompare2() {
			
			return Scompare2;
			
		}

		public WebElement getScompare3() {
			
			return Scompare3;
			
		}

		public WebElement getCompareButton() {
			
			return compareButton;
			
		}

		public WebElement getJdrop1() {
			
			return Jdrop1;
			
		}

		public WebElement getJIndigo() {
			
			return JIndigo;
			
		}

		public WebElement getJdress1() {
			
			return Jdress1;
			
		}

		public WebElement getJdress2() {
			
			return Jdress2;
			
		}

		public WebElement getJdress3() {
			
			return Jdress3;
			
		}

		public WebElement getJcolor_blue1() {
			
			return Jcolor_blue1;
			
		}

		public WebElement getJcolor_black2() {
			
			return Jcolor_black2;
			
		}

		public WebElement getJcolor_yellow3() {
			
			return Jcolor_yellow3;
			
		}

		public WebElement getClick_to_buy() {
			
			return click_to_buy;
			
		}

		public WebElement getContinue_button() {
			
			return continue_button;
		}

		public WebElement getNav_jacket() {
			
			return nav_jacket;
		}

		public WebElement getMens_wear_nav() {
			
			return mens_wear_nav;
		}

		public WebElement getSort() {
			
			return sort;
			
		}
		
		public void Search(String mens1) {
			
			search_box.sendKeys(mens1);
			
			
		}
		
		public void MSearchAll(String mens1,String mens2,String mens3) {
			
			// Perform three consecutive searches with different terms (mens1, mens2, mens3) by entering each term, clicking the search icon, and clearing the search box after each search.
			search_box.sendKeys(mens1);
			
			search_icon.click();
			
			search_box.clear();
			
			search_box.sendKeys(mens2);
			
			search_icon.click();
			
			search_box.clear();
			
			search_box.sendKeys(mens3);
			
			search_icon.click();
		}
		
		// Scroll down, select three items for comparison, scroll back up, and click the compare button.
		
		public void SCompare() throws InterruptedException {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,150);");
			
			Thread.sleep(200);
			
			Scompare1.click();
			
			Scompare2.click();
			
			Scompare3.click();
			
			js.executeScript("window.scrollBy(0,-150);");
			
			compareButton.click();

			
		}
		
		//Mutltiple Links
		
		// Scroll down, select a dress, navigate to jackets, reselect the dress, and navigate back to jackets.
		
		public void MutilpleAdd() throws InterruptedException {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,550);");
			
			Thread.sleep(2000);
			
			Jdress1.click();
			
			Thread.sleep(1000);
			
			nav_jacket.click();
			
			Jdress1.click();
			
			nav_jacket.click();

			
		}
		
		// Select different sort options sequentially, pausing between each selection.
		
		public void JsortAll(String STpopular,String STnew,String STrate,String STexp,String STcheap,String STrel) throws InterruptedException {
			
			Select select=new Select(this.sort);
			select.selectByVisibleText(STpopular);
			Thread.sleep(2000);
			select.selectByVisibleText(STnew);
			Thread.sleep(2000);
			select.selectByVisibleText(STrate);
			Thread.sleep(2000);
			select.selectByVisibleText(STexp);
			Thread.sleep(2000);
			select.selectByVisibleText(STcheap);
			Thread.sleep(2000);
			select.selectByVisibleText(STrel);
			
			
		}


		
		
		
		
		
		
		
         
         
         
         
         
         
         
         
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		

}
