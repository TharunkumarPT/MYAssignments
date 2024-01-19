package week2.day2.HomeAssignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHomeAss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/radio.xhtml");

		System.out.println("launched Leafground Radio Button application");
		
		Thread.sleep(5000);
		//radio Button
		WebElement favBrowser = driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']"));
		favBrowser.click();
		
		//default selected radio button
		WebElement defaultBrowserSelected = driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']"));
		defaultBrowserSelected.isSelected();
		
		//unselectable
		WebElement unSelected = driver.findElement(By.xpath("//label[@for='j_idt87:city2:2']"));
		unSelected.click();
		//unSelected.click();
		System.out.println("The radio button is: "+ unSelected.isSelected());
		
		//age group
		WebElement age = driver.findElement(By.xpath("//label[text()='41-60 Years']"));
		age.click();
		System.out.println("The age is" + age);
		
		boolean aa = driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).isSelected();
		return;
		
		

		
		
		
	}

}
