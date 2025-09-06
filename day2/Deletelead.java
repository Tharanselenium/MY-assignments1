package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Deletelead {
public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver(); // Create Firefox instance
		driver.get("http://leaftaps.com/opentaps/control/main"); //call the URL
		driver.manage().window().maximize(); //Maximize the window
		//Enter User Name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		//Click Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter Phone Number
		driver.findElement(By.name("phoneNumber")).sendKeys("9500992943");
		//Click on Find Leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture Lead Id
		WebElement LeadIdElement = driver.findElement(By.xpath("//a[contains(text(),'syed javed')]/ancestor::tr/td[1]//a"));
		String LeadId = LeadIdElement.getText();
		//Click on Lead ID
		LeadIdElement.click();
		//Click on Delete
		driver.findElement(By.linkText("Delete")).click();
		//Click Find Leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Enter LeadID
		driver.findElement(By.name("id")).sendKeys(LeadId);
		//Click on FindLeads
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')])")).click();
		//Verify No Records to display
		driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).isDisplayed();
		//Close the Browser
		driver.quit();
	}


}
