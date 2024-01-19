package week2.day2.HomeAssignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButtonInteractionHomeAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://leafground.com/button.xhtml");

		System.out.println("launched Leafground Button application");
		
		WebElement clickAndConfirmTitle = driver.findElement(By.xpath("//span[text()='Click']"));
		clickAndConfirmTitle.click();
		
		String title = driver.getTitle();
		if(title.contains(title)) {
			System.out.println("The page title is matched: " + title);
		}
		else {
			System.out.println("The page title is not matched");
		}
		
		driver.navigate().back();
		System.out.println("The driver is navigated back. ");
		
		WebElement disabledBtn = driver.findElement(By.xpath("//span[text()='Disabled']"));
		disabledBtn.isEnabled();
		boolean val = false;
		if(disabledBtn.isDisplayed()) {
			 val = true;
		}
		
		WebElement submitBtn = driver.findElement(By.xpath("//span[text()='Submit']"));
		System.out.println("The location of submit button is: " + submitBtn.getLocation());
		
		WebElement saveBtnColor = driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following-sibling::button"));
		System.out.println("The save button colour is: " + saveBtnColor.getCssValue("style"));
		System.out.println("The save button style is: " + saveBtnColor.getCssValue("color"));
	
		
		WebElement sizeSubmit = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']/following-sibling::button"));
		System.out.println("The height & weight of Submit button is: " + sizeSubmit.getSize());
		
		driver.close();
		
	}

}
