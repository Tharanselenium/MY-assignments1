package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class creatingacc {
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
		//Click on Accounts
		driver.findElement(By.linkText("Accounts")).click();
		//Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		//Enter Account Name
		driver.findElement(By.id("accountName")).sendKeys("tv1");
		//Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Click Industry
		driver.findElement(By.name("industryEnumId")).click();
		//Define a WebElement
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select ind = new Select(industry);
		ind.selectByValue("IND_SOFTWARE");
		//Click on Ownership
		driver.findElement(By.name("ownershipEnumId")).click();
		//Define WebElement for ownership
		WebElement Ownership = driver.findElement(By.name("ownershipEnumId"));
		Select own = new Select(Ownership);
		own.selectByVisibleText("S-Corporation");
		//Click on Source
		driver.findElement(By.name("dataSourceId")).click();
		//Define WebElement for DataSoureID
		WebElement DataSource = driver.findElement(By.name("dataSourceId"));
		Select source = new Select(DataSource);
		source.selectByValue("LEAD_EMPLOYEE");
		//Click on Marketing Campign
		driver.findElement(By.name("marketingCampaignId"));
		//Define WebElement For Marketing
		WebElement Mktcampign = driver.findElement(By.name("marketingCampaignId"));
		Select marketing = new Select(Mktcampign);
		marketing.selectByIndex(6);
		//Click on State
		driver.findElement(By.id("generalStateProvinceGeoId")).click();
		//Define Webelement for State
		WebElement StateP = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state = new Select(StateP);
		state.selectByValue("TX");
		//Click on Create button
		driver.findElement(By.className("smallSubmit")).click();
		//print Account Name
		String AccountName = driver.findElement(By.xpath("//span[text()='Account Name']/ancestor::tr/td[2]/span")).getText();
		System.out.println(AccountName);
		driver.quit();
    
    
    


	
	

}
}