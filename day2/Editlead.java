package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Editlead {
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
		//Click on Create leads
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("testleaf");
		//Enter First Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Syed");
		//Enter Last Name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Javed");
		//Enter first Name Local
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Syed");
		//Enter Department
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Product");
		//Enter Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is the Description");
		//Enter Email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("syedjaved499@gmail.com");
		//Click On State
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).click();
		WebElement StatePro = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(StatePro);
		state.selectByVisibleText("New York");
		//Click on Create Button
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		//Click on Editr Button
		driver.findElement(By.linkText("Edit")).click();
		//Clear Description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Enter Important Note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is the Important Notes");
		//Click on Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//Print Title
		System.out.println(driver.getTitle());
		//Quit Browser
		driver.quit();

	}

}
