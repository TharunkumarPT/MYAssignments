package Week4.day2.homeassignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

	public static void main(String[] args) throws IOException {
	

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		System.out.println("Launched Amazon India website");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//label[text()='Search Amazon.in']/following-sibling::input")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		driver.findElement(By.xpath("//span[@class='a-price-symbol']/following-sibling::span"));
		
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File("./Screenshot/AmazonActionsHA.png"));
		
		  	    }
		
	}

