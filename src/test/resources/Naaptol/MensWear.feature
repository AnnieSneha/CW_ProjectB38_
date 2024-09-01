@tag
Feature: Accessoires of Apparel and Accessory
 

  @tag11
  Scenario: Navigating to the Shorts and Trousers page from the home page
    Given Open the browser,enter the Naaptol URL
    When User clicks on the Apparel and Accessories from homepage
    Then User clicks on Mens Wear1
    And Mens Wear page should be displayed
    
  @tag22
  Scenario: To validate by entering  all the filter options on Sportswear
    Given Open the browser,enter the Naaptol URL
   And User clicks on the Apparel and Accessories from homepage1
   And User clicks on Mens Wear
   When User clicks on SportsWear and Shorts
   And User clicks on Cash on delivery,Exclude out of stock checkbox and User Clicks on Set button
   And User clicks on Scottish Club Brand checkbox
   And User clicks on Price Range
   And User clicks on Discount of more than fifty checkbox
   And User clicks On Sportswear filter checkbox
   And User clicks on Lowers type checkbox
   And User clicks on Polyester material checkbox
   Then No more results to display should be displayed in the Sportswearpage
   
   
   #@tag3
   #Scenario: To Validate by adding mutiple items in the add to cart
   # Given Open the browser,enter the Naaptol URL
   #And User clicks on the Apparel and Accessories from homepage1
   #And User clicks on Mens Wear
   #And User clicks on jackets
   #And User clicks on Clear All link in the Narrow Results
   #And User clicks on Cash on delivery,Exclude out of stock checkbox and User Clicks on Set button1
   #And User clicks on Fleece Jacket link
   #And Selects the Size Yellow-Xl
   #When User clicks on Click here to buy
   #And User clicks on Continue Shopping
   #And User clicks on Jackets from Navigation bar
   #And User clicks on Winter Puffer link
   #And Selects the size Grey-Xl
   #Then User clicks on Click here to buy1
   #And My Shopping Cart page should be displayed 
   
   
   @tag4
   Scenario: To validate by comparing the items of Sportwear
   Given Open the browser,enter the Naaptol URL
   And User clicks on the Apparel and Accessories from homepage1
   And User clicks on Mens Wear
   And User clicks on Sportswear and Shorts
   And User clicks on Clear All link in the Narrow Results
   And User clicks on Cash on delivery,Exclude out of stock checkbox and User Clicks on Set button1
   When User clicks on Add to Compare1,Compare2 anf Compare3 checkbox
   And User clicks on CompareNow button
   And User Selects Branded from the dropdown
   Then User clicks on Pack of lyrca shorts
   And Pack Of Lycra Stretchable Pants should be displayed
   
   
   @tag5
   Scenario: To validate the Sort By dropdown in the Jackets 
   Given Open the browser,enter the Naaptol URL
   And User clicks on the Apparel and Accessories from homepage1
   And User clicks on Mens Wear
   And User clicks on jackets
   And User clicks on Clear All link in the Narrow Results
   When User selects most popular,new arrivals,highest rated,most expensive,cheapest
   Then Winter Gloves should be visible in the first
   

   
   
   
   
   
   
   

 