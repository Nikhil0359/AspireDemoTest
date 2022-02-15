# AspireDemoTest
I have created below packages in src/main/java
    1.com.aspire.base
    2.com.aspire.config
    3.com.aspire.pageObjects
    4.com.aspire.util
    
I have created below packages in src/test/java
    1.com.aspire.testcases
    
I have created below xml file in src/main/resources
   testng.xml
   
In com.aspire.base package i have created one base class which has base class constructor to fetch file from config
In com.aspire.config file i have details like URL,Browser,Username and password.
In com.aspire.pageObjects i have created page objects using page factory for different pages.
com.aspire.util pacakge have class in which we can keep reusable code.

com.aspire.testcases packages have testcases for different pages.
   I have created three classes for different scenarios.
      1.LoginPageTestCase
      2.InventoryPageTestCase
      3.ManufacturingPageTestCase

How to execute all testcases:
       1.You can execute all testcase from src/main/resources using testng.xml file.
        Right click on testng.xml file and run as Testng suite.
        
       2.You can execute single testcase from com.aspire.testcases package
        Right click on any class and run as TestNG Test
