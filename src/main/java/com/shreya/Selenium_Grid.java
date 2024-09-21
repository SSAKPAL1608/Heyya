package com.shreya;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Selenium_Grid {
 WebDriver driver;
 String baseUrl, nodeURL; 
 
 public void Homepagecheck() throws MalformedURLException {
 baseUrl = "http://newtours.demoaut.com/";
 nodeURL = "http://192.168.1.8:4444"; 
 DesiredCapabilities capability = new DesiredCapabilities();
 capability.setBrowserName("chrome");
 driver = new RemoteWebDriver(new URL(nodeURL), capability); 
} 
@AfterTest 
public void afterTest() {
 driver.quit(); 
 }
@Test 
public void simpleTest() { 
driver.get(baseUrl);
 AssertJUnit.assertEquals("Welcome: Mercury Tours", driver.getTitle()); } 
} 