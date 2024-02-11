package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClassMethods.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {

	public HomePage welcomepg()
	{
		WebElement clickLink = driver.findElement(By.linkText("CRM/SFA"));
		clickLink.click();
		return new HomePage();
	}

}
