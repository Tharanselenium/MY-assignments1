package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Checkingxpathloc {
	public static void main(String[] args) {
		
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	//enter the username
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[1]")).sendKeys("demosalesmanager");

	//enter the password
	driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
	//click on login
	driver.findElement(By.className("decorativeSubmit")).click();
	//click crmsfa
	driver.findElement(By.partialLinkText("CRM")).click();
	//click leads
	driver.findElement(By.linkText("Leads")).click();
	//createlead
	driver.findElement(By.linkText("Create Lead")).click();
	//company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	//firstname
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vikram");
	//lastname
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
	//locate the source DD
	WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	//instantiate the select class
	Select select=new Select(sourceDD);
	select.selectByIndex(4);
	//industryDD
	WebElement camp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select sel=new Select(camp);
	sel.selectByVisibleText("Automobile");
	WebElement owner=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select sel1=new Select(owner);
	sel1.selectByValue("OWN_CCORP");
	driver.findElement(By.name("submitButton")).click();
	String title=driver.getTitle();
	System.out.println(title);

}}
