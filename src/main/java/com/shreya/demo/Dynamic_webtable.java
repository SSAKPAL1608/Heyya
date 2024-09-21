package com.shreya.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Dynamic_webtable {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		int columnCount = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/td")).size();

		for (int i = 1; i <= rowCount; i++) { // Start from 2 beacuse row starts from2
		    for (int j = 1; j <=columnCount; j++) { // Start from 1 column starts from 1
		        String actValue = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + (i + 1) + "]/td["+j+"]")).getText();
		        
		        // Print the text content of each cell
		        System.out.println("Cell Value at row " + (i + 1) + ", column " + j + ": " + actValue);
		        
		        if (actValue.equals("Germany")) {
		            // Print the text content if the cell value is "Germany"
		            System.out.println("Cell Value is 'Germany' at row " + (i + 1) + ", column " + j + ": " + actValue);
		        }
		    }
		}


	
}
}
//OP for first sysout:Cell Value at row 2, column 1: Alfreds Futterkiste
//Cell Value at row 2, column 2: Maria Anders
//Cell Value at row 2, column 3: Germany
//OP:Cell Value is 'Germany' at row 1, column 3: Germany

