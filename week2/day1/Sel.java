package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/.");
		
		System.out.println("launched FB application");
		
		//driver.close();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		

		WebElement crmbtn = driver.findElement(By.linkText("CRM/SFA"));
		crmbtn.click();
      
		WebElement createlead = driver.findElement(By.linkText("Create Lead"));
		createlead.click();
		
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("Tours & Travels");
		
		WebElement f_name = driver.findElement(By.id("createLeadForm_firstName"));
		f_name.sendKeys("Tharun");
		
		WebElement l_name = driver.findElement(By.id("createLeadForm_lastName"));
		l_name.sendKeys("Kumar");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		WebElement marketing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		
		Select sourcedd = new Select(source);
		sourcedd.selectByValue("LEAD_EMPLOYEE");
		System.out.println("the selected dd value of source");
	
		Select industrydd = new Select(marketing);
		industrydd.selectByValue("CATRQ_AUTOMOBILE");
		System.out.println("the selected dd value of marketing");
		
		Select dropdownowner = new Select(ownership);
		//sourcedd.selectByValue("OWN_CCORP");
		dropdownowner.selectByVisibleText("Corporation");
		System.out.println("the value selected for ownership dropdown");
		
		WebElement createlad = driver.findElement(By.name("submitButton"));
		createlad.click();
		
		System.out.println("Title is" + driver.getTitle());
		
		String viewlead = driver.getTitle();
		
		if(viewlead.equals("View Lead | opentaps CRM")){
			System.out.println("Title is matched");
		}
		else{
			System.out.println("Title is not matched");
		}
		
		driver.quit();
			
	}

}
