package week2.day2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesHomeAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://leafground.com/checkbox.xhtml");

		System.out.println("Launched Checkbox website of leafground");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// CheckBox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();


		// Notification CheckBox
		WebElement notificationCheckBox1 = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-icon-blank ui-c']/parent::div"));
		//"//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default ui-state-hover']"));
		notificationCheckBox1.click();

		// Verification of notification for check box is displayed
		WebElement notificationCheckBox = driver.findElement(By.xpath("//span[text()='Checked']"));
		notificationCheckBox.isDisplayed();
		String valueofmessage = notificationCheckBox.getText();

		boolean notification = false;

		if(valueofmessage.contains("Checked")) {
			notification=true;
			System.out.println("The notification checkbox is checked");
		}	else {
			System.out.println("The notification checkbox is not checked");
		}

		//TriStateCheckbox selection and verification
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();

		WebElement selectedTriStateCheckbox = driver.findElement(By.xpath("//span[text()='State has been changed.']"));
		String verifyvalue = selectedTriStateCheckbox.getText();
		System.out.println("the value of" + verifyvalue);
		boolean selectedtri = false;
	
		 if(verifyvalue.contains("State has been changed.")) { 
			 selectedtri = true;
		 System.out.println(selectedtri + "The Tri state changed to 1"); 
		 } 
		 else {
		 System.out.println("The Tri state changed to 2"); 
		 }
		 
		WebElement toogleButton = driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
		toogleButton.click();
		
		WebElement toogleChecked = driver.findElement(By.xpath("//span[text()='Checked']"));
		String checkedOrNotChecked = toogleChecked.getText();
		
		if(checkedOrNotChecked.contains("Checked")) {
			System.out.println("The expected Toogle message is: " + checkedOrNotChecked);
		}
		
		WebElement checkboxEnabled = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
		checkboxEnabled.isEnabled();
		
		if(checkboxEnabled.isSelected())
		{
			System.out.println("The checkbox is displayed & enabled");
		}else {
			System.out.println("The checkbox is not enabled");
		}
		
		//Multiple check boxes selected for cities
		WebElement multiSelectCities = driver.findElement(By.xpath("//ul[@data-label='Cities']"));
		multiSelectCities.click();
		
		WebElement multiCheckbox = driver.findElement(By.xpath("//span[text()='Basic']"));
		multiCheckbox.click();
		
		driver.close();

	}

}
