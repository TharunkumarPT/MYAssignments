package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClassMethods.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public LoginPage username() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		return this;
		}
	
	public LoginPage password() {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		return this;
		}
	
	public WelcomePage loginBtn() {
		WebElement password = driver.findElement(By.className("decorativeSubmit"));
		 password.click();
		return new WelcomePage();
		}
	
}
