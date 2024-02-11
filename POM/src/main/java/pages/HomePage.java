package pages;

import org.openqa.selenium.By;
import BaseClassMethods.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage leadsClick()
	{
		driver.findElement(By.linkText("Leads")).click();
		return this;
	}
	
	public CreateLead createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead();
	}
	
	
	
	}
