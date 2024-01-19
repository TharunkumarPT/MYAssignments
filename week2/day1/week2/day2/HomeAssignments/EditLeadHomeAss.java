package week2.day2.HomeAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadHomeAss {

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
				
				WebElement createlead = driver.findElement(By.linkText("Create Lead"));
				createlead.click();
				
				WebElement companyname = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
				companyname.sendKeys("Tours & Travels");
				
				WebElement f_name = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
				f_name.sendKeys("Tharun");
				
				WebElement l_name = driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
				l_name.sendKeys("Kumar");
				
				WebElement local_f_name = driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
				local_f_name.sendKeys("Arjun");
				
				WebElement departmentname = driver.findElement(By.name("departmentName"));
				departmentname.sendKeys("Testing");
				
				WebElement description = driver.findElement(By.id("createLeadForm_description"));
				description.sendKeys("EditLead - HomeAssignment for Week2 day 2 selenium locators");
				
				WebElement emailaddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
				emailaddress.sendKeys("testleaf11@gmail.com");
				
				WebElement stateorprovince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				Select selectstate = new Select(stateorprovince);
				selectstate.selectByValue("NY");
				System.out.println("The state selected is New York");
				
				WebElement createlad = driver.findElement(By.name("submitButton"));
				createlad.click();
				
				WebElement findleads_edittrow = driver.findElement(By.linkText("Edit"));
				findleads_edittrow.click();
				
				WebElement updatedescription = driver.findElement(By.id("updateLeadForm_description"));
				updatedescription.clear();
				
				WebElement updateimpnote = driver.findElement(By.id("updateLeadForm_importantNote"));
				updateimpnote.sendKeys("Please make this as important note for updation using edit button");
				
				String viewlead = driver.getTitle();
				
				System.out.println("The title is :" + viewlead );
				
				if(viewlead.contains("opentaps CRM")){
					System.out.println("Title is matched");
				}
				else{
					System.out.println("Title is not matched");
				}
				
				driver.quit();
				
	}

}
