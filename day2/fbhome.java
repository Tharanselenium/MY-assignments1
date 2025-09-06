package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.types.Duration;

public class fbhome {
public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		//Go to the URL
		driver.get("https://en-gb.facebook.com/");
		//Maximize
		driver.manage().window().maximize();
		//Add implicit Wait
	
		//Click on Create New Account Button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		//Enter First Name
		driver.findElement(By.name("firstname")).sendKeys("Syed");
		//Enter Last Name
		driver.findElement(By.name("lastname")).sendKeys("Javed");
		//Enter Mobile Number
		driver.findElement(By.name("reg_email__")).sendKeys("9500992943");
		//Enter Password
		driver.findElement(By.name("reg_passwd__")).sendKeys("Welcome@123");
		//Click DOB Date
		driver.findElement(By.id("day")).click();
		//Select DOB
		WebElement DaySelect = driver.findElement(By.id("day"));
		Select day = new Select(DaySelect);
		day.selectByIndex(16);
		//Click on DOB Month
		driver.findElement(By.id("month")).click();
		//Select Month
		WebElement MonthSelect = driver.findElement(By.id("month"));
		Select month = new Select(MonthSelect);
		month.selectByVisibleText("Jun");
		//Click on Year
		driver.findElement(By.id("year")).click();
		//Select Year
		WebElement YearSelect = driver.findElement(By.id("year"));
		Select year = new Select(YearSelect);
		year.selectByValue("1998");
		//Select Gender
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

	}
}
