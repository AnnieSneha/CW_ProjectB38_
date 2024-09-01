
@tag
Feature: Womens Wear of Apparel and Accessories

  @tag1
  Scenario: To validate the Shawls feature of Apparel and Accessories and Asserting the checkbox of Personalise Search
  
    Given Open the browser,enter the Naptol URL
    
    And On the homepage click on Shopping Categories
    
    And User clicks on Apparel and Accessories from the dropdown
    When User clicks on Shawls from the dropdown
    And User clicks on with cash on delivery and exculde out of stock checkbox
    Then User clicks on Set button
    And Item should be displayed in the Shawls page.
    
   @tag2
   Scenario: To validate the Kurtis & Dupatta feature by Search functionality
   Given Open the browser,enter the Naptol URL
   And Search for Kurtis & Dupatta in the Search Bar
   When User clicks on Seacrh bar icon
   And User clicks on the Clear all from the Narrow Results
   And User clicks on with cash on delivery and exculde out of stock checkbox
   And User clicks on Set button
   Then The Kurtis and Dupatta items should be displayed
   
   @tag3
   Scenario: To validate the Dress Material feature for a Quick View
   Given Open the browser,enter the Naptol URL
   And On the homepage click on Shopping Categories
   And User clicks on Apparel and Accessories from the dropdown
   When User clicks on Dress Material 
   And User clicks on the Clear all from the Narrow Results
   And User clicks on with cash on delivery and exculde out of stock checkbox
   And User clicks on Set button1
   Then User mouse overs on Quik view
   And The Printed Dress Material should be visible
   
   @tag4
   Scenario: To validate the Brands filter of Nightwear feature
   Given Open the browser,enter the Naptol URL
   And On the homepage click on Shopping Categories
   And User clicks on Apparel and Accessories from the dropdown
   When User clicks on Nightwear
   And User clicks on the Clear all from the Narrow Results
   Then User clicks on Pakhi,Stylexa,Amy Rose,Scottish Club,Get In Shape from Brands 
   And Items should be displayed in the Nightwear page
   
   
   @tag5
   Scenario: To validate the Price filter of Nightwear feature
   Given Open the browser,enter the Naptol URL
   And On the homepage click on Shopping Categories
   And User clicks on Apparel and Accessories from the dropdown
   When User clicks on Nightwear
   And User clicks on the Clear all from the Narrow Results
   Then User clicks on the all the checkboxs of price filter
   
   
 @tag6
   Scenario: To validate the Discount and Material filter of Shawls feature
   Given Open the browser,enter the Naptol URL
   And On the homepage click on Shopping Categories
   And User clicks on Apparel and Accessories from the dropdown
   When User clicks on Shawls from the dropdown
   Then User clicks on Discount of fifty percent and Material of Acrylic
   And Items should be displayed in the Nightwear page
   
   @tag7
   Scenario: To validate by navigating mutliple features of Womens Wear
   Given Open the browser,enter the Naptol URL
   And On the homepage click on Shopping Categories
   And User clicks on Apparel and Accessories from the dropdown
   When User clicks on Shawls from the dropdown
   And User clicks on the Womens Wear from the navigation bar
   And User clicks on Kurthi & Dupatta
   Then Kurthi and Dupatta page should be displayed 
   
   @tag8
   Scenario: To validate by Adding the product to the cart
   Given Open the browser,enter the Naptol URL
   And On the homepage click on Shopping Categories
   And User clicks on Apparel and Accessories from the dropdown
   When User clicks on Shawls from the dropdown
   And Click on Warm Shawls 
   And Add to cart should be displayed
   
   
   @tag9
   Scenario: To validate by comparing two products
   Given Open the browser,enter the Naptol URL
   And On the homepage click on Shopping Categories
   And User clicks on Apparel and Accessories from the dropdown
   When User clicks on Nightwear
   And Click on Add to compare1,compare2,compare3
   Then Click on CompareNow button
   And Add To Compare Should be displayed
   
   @tag10
   Scenario: To validate the filter functionlaity of Nightwear
   Given Open the browser,enter the Naptol URL
   And On the homepage click on Shopping Categories
   And User clicks on Apparel and Accessories from the dropdown
   When User clicks on Nightwear
   And User clicks on the Clear all from the Narrow Results
   And User clicks on with cash on delivery and exculde out of stock checkbox
   And User clicks on Set button
   And User Clicks on Pakhi and Scottish Club
   And User Clicks on Price 
   And User Clicks on discount more than fifty
   And User Clicks on no. of pcs onepc 
   #And User Clicks on type nighties
   And User Clicks on length long
   Then Designer Maxi Nighty should be displayed
   
   @tag11
   Scenario: To validate the by out of stock item
   Given Open the browser,enter the Naptol URL
   And On the homepage click on Shopping Categories
   And User clicks on Apparel and Accessories from the dropdown
   When User clicks on Dress Material 
   And User clicks on the Clear all from the Narrow Results
   And Click on Mughal Insipired dress
   Then No offer for sale on Naaptol should be displayed
   
   
  
  
