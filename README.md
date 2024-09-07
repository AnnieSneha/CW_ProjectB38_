# Naaptol
![image](https://github.com/user-attachments/assets/18ab4ba3-fb94-427a-b751-688a3e69f3c3)

## Introduction
Naaptol is an Indian online shopping platform that offers a wide variety of products across different categories, including electronics, home appliances, fashion, and more. Known for its teleshopping model, Naaptol allows customers to purchase products through its website, mobile app, and television channel. It provides a convenient shopping experience with multiple payment options and customer support channels, making it a significant player in the Indian e-commerce market.

This project involves automating the testing of the Naaptol platform using Selenium, with a focus on the 'Apparel and Accessories' module. The automation is performed using a Page Object Model (POM) framework and Cucumber framework.

## Project Type
E-commerce platform testing

Frontend testing

## Architecture
Selenium WebDriver: Provides a programming interface to create and execute test scripts.   
Browser Drivers: Such as ChromeDriver and GeckoDriver, these act as intermediaries between the WebDriver and the browser to execute commands.  
Web Browsers: Execute the commands and perform actions on web pages.

## Directory Structure

POM Directory Structure:
```
CW_POM_1
├── src/
│   ├── main/
│   │   ├── java/
│   │       └── page classess/
│   │           ├── AddCompare_Page.java
│   │           ├── Apparel_Accessories.java
│   │           ├── Home_Page.java
│   │           ├── MensWear_Page.java
│   │           ├── Personal_Search.java
│   │           └── WomensWear_Page.java
│   │   
│   │       
│   ├── test/
│   │   ├── java/
│   │   │   ├── generics/
│   │   │   │   └── BaseTest.java
│   │   │   └── test/
│   │   │       └── FinalTest.java
│   │   └── resources/
│   │       └── config.properties
└── pom.xml
```

Cucumber Directory Structure:
```
CW_Cucumber_2/
├── src/
│   ├── main/     
│   ├── test/
│   │   ├── java/
│   │   │   ├── runner/
│   │   │   │   └── TestRunner.java
│   │   │   └── step_definition/
│   │   │       ├── AA_Mens.java
│   │   │       └── AA_Womens.java
│   ├── test/
│   │   └── resources/
│   │       └── Naaptol/
│   │           ├── MensWear.feature
│   │           └── WomensWear.feature
├── pom.xml

```
## Features
Operations Performed in the Project:

Page Object Model (POM) Implementation

Designed and implemented Page Object Model to structure page-specific classes.  
Defined page objects and actions for the 'Apparel and Accessories' module.
Used TestNG annotations for test execution
Utilized a properties file to manage configurable data such as URLs.
Applied explicit and implicit waits to handle dynamic elements and ensure reliable test execution.
Automated the capture of screenshots for key test steps
Generated Extent Reports for detailed insights into test execution results.

Cucumber Framework Implementation:

Developed feature files for the 'Apparel and Accessories' module.
Applied explicit and implicit waits to handle dynamic elements and ensure reliable test execution.
Automated the capture of screenshots for key test steps
Generated Extent Reports for detailed insights into test execution results.

## Prerequisites
Install Java Development Kit (JDK)  

Install an Integrated Development Environment (IDE)  

Install Apache Maven  

Install IDE-SpringTool

## Project Setup
Create a Maven project in IDE

Add Dependencies in pom.xml: Include Selenium, TestNG, Cucumber, Screenshots,Extent Reports and other necessary dependencies.

## Usage
1. Clone the Repository
https://github.com/AnnieSneha/CW_ProjectB38_.git
   
3. Create a folder and Navigate to the the folder and Open a command prompt and use the command
```
mvn test
```

## Screenshots

![image](https://github.com/user-attachments/assets/5b3ca3f1-6433-486e-814b-1b4ade7cc38e)
POM:
![image](https://github.com/user-attachments/assets/039a0250-f9d2-421e-a061-8566c55c1e39)
Cucumber:
![image](https://github.com/user-attachments/assets/637cfc81-de3e-4449-b39c-7809bfc92f72)

## Link of the Website
https://www.naaptol.com/

## Technology Stack
Java

Selenium WebDriver

Maven

TestNG

Cucumber

## Version Control and Testing tools used:
Git

GitHub

Selenium

SpringTool

## Operating System and browsers used:
Operating System: Windows

Browsers: Chrome, Firefox








