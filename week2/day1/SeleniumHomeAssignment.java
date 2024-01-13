package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHomeAssignment {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/.");
		
		System.out.println("launched FB application");
		
		//driver.close();
		
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		
		
		driver.findElement(By.name("login")).click();
		
		WebElement lintexter = driver.findElement(By.linkText("Find your account and log in."));
		
		lintexter.click();
		
		System.out.println("Title is"+ driver.getTitle());
			
	}

}
