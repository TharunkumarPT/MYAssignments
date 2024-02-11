package pages;

import org.openqa.selenium.By;

import BaseClassMethods.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {

		public CreateLead createLeadDetails() {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
			return this;
	}
		
		public VerifyLead clickCreateLead() {
			driver.findElement(By.name("submitButton")).click();			
			return new VerifyLead();
			
		}
		
		

}
