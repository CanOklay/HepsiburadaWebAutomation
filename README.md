#HepsiburadaWebAutomation
Used tools: Java, Maven, Testng, Extent Reports, Log4j, Docker

I used Java and Testng for my test scripts, Extent Reports for reporting, Log4j for logging and Docker for running my test remotely.

For parallel running: You should change suiteXmlFile at pom.xml below of surefire plugin or you can directly run ParallelTestWithBrowsers.xml file

You can change the browser from testng.xml files

Scripts for running project: 
mvn clean test

Note: There is a problem at login page. Even though writing the correct password I was taking an error. So you can turn the login steps to comments 
then you can run for other steps after login. Also I couldn't click the other sellers part, so I just add the product to cart and then delete it.
