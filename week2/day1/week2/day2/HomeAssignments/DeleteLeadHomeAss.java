package week2.day2.HomeAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadHomeAss {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://leaftaps.com/opentaps/.");

		System.out.println("launched Leaftaps application");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");


		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();


		WebElement crmbtn = driver.findElement(By.linkText("CRM/SFA"));
		crmbtn.click();

		WebElement leads_tab = driver.findElement(By.xpath("//a[(text()='Leads')]"));
		leads_tab.click();

		WebElement findleads = driver.findElement(By.xpath("//a[(text()='Find Leads')]"));
				//.linkText("Find Leads"));
				
		findleads.click();

		WebElement findleads_firstrow = driver.findElement(By.linkText("10104"));
		findleads_firstrow.click();

		WebElement findleads_deletetrow = driver.findElement(By.linkText("Delete"));
		findleads_deletetrow.click();
					
		WebElement findleadss = driver.findElement(By.xpath("//a[(text()='Find Leads')]"));
		findleadss.click();
	
		WebElement re_findlead = driver.findElement(By.id("ext-gen246"));
		re_findlead.click();
		re_findlead.sendKeys("10104");
		
		WebElement findleadss1 = driver.findElement(By.id("ext-gen334"));
		findleadss1.click();

		WebElement recordnotfound = driver.findElement(By.xpath("//div[text()='No records to display']"));

		if(recordnotfound.getText().contains("No records to display"))
		{
			System.out.println("No records were found");
		} else {
			System.out.println(" The concept to find records not found is wrong");
		}

		driver.quit();

	}

}
