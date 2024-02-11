package pages;

import org.openqa.selenium.By;

public class VerifyLead extends CreateLead {
	public static String text;
	
	public DeleteLead getCreateLead() {
		
	
	text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	if (text.contains("Testleaf")) {
		System.out.println("Lead created successfully");
	}
	else {
		System.out.println("Lead is not created");
	}
	return new DeleteLead();
	
  }
	/*
	 * public DeleteLead delete() { driver.findElement(By.
	 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	 * driver.findElement(By.linkText("Delete")).click(); return new DeleteLead(); }
	 */
}
