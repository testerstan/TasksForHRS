package loaders;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Tasks {

	/*
	 * 1-What page element selectors do you know? Page webelement :
	 * ID,Name,CSS,XPath,linktext,tagName,className If it select method : we can use
	 * - SelectByIndex, selectByValue, SelectByName deselectByindex,
	 * deseslectbyvalue, deselectByVisibleText, getOptions, getAllSelectedOptions
	 * 2-Rate your JS knowledge from 0 to 10 (or another language, just indicate)
	 * Java : 7 3-Rate your Cypress/Selenium knowledge from 0 to 10 0
	 */

	// 4- Use selectors to get a list of all admins

	public void listAdmins() {
		 // Crete Select method 
		Select select = new Select(driver.findElement(By.xpath("//select[@class='users_lists']");
		//Select value by visible Text
		select.selectByIndex(0);
		select.selectByVisibleText("admin");
	//Select All webElements 
		List<WebElement> list = select.getAllSelectedOptions();
		
		for(WebElement w: list) {
			System.out.println( w.getText());	
		}
	
	}
	// Use selectors to list all users by data attribute name="user";

public void listUser () {
		
	// Create  Select method 
			Select select = new Select(driver.findElement(By.xpath("//select[@class='users_lists']");
			//Select value by visible Text
			select.selectByIndex(1);
			select.selectByVisibleText("user");
		//Select All   Selected webElements 
			List<WebElement> list = select.getAllSelectedOptions();
			
			for(WebElement w: list) {
				System.out.println( w.getText());	
			}
	}

public void GetAllColors() {
	
	// Create  Select method 
				Select select = new Select(driver.findElement(By.xpath("//select[@class='users_lists']");
				
			//Select All webElements 
				List<WebElement> list = select.getOptions();
				
				for(WebElement w: list) {
					System.out.println( w.getText());	
			}			
}
/*
 7 - What actions for elements do you know?
 Actions can be: doubleClick, clickAndHold, dragAndDrop, moveToElement, contextClick
 
8 -  How to get an element using Cypress/Selenium?
I don't have a chance to work with Cypress/Selenium

9 - How to work with select in Cypress/Selenium?
I don't have a chance to work with Cypress/Selenium
10. What actions can be applied to an element using Cypress/Selenium?
I don't have a chance to work with Cypress/Selenium
11. Does Сypress/Selenium support drag and drop?
I think yes, because its work with Selenium 
12. Does Сypress/Selenium support file uploads? How?
I think yes, because its work with Selenium,I think Just like in selenium 
Uploading files is done by using the sendKeys() method 
on the file-select input field to enter the path to the file that you want to  uploaded
 */

/*13 I didn't work with Cypress/Selenium. And Tell the Recruters which you working with 
that they should find the candidate who nows Cypress/Selenium,and automation API testing with Rest-Assured.
 And they shouldn't offer $38-40/hr for this position. 
This rate mostly for manual testers 
*/
}
