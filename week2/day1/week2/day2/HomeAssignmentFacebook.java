package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignmentFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		System.out.println("launched FB application");
		
		WebElement fbemail = driver.findElement(By.xpath("//input[@name='email']"));
		fbemail.sendKeys("testleaf.2023@gmail.com");
		
		WebElement fbpass = driver.findElement(By.xpath("//input[@name='pass']"));
		fbpass.sendKeys("Tuna@321");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		WebElement forgotpass = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		forgotpass.click();
		
		WebElement verifyemail = driver.findElement(By.xpath("//input[@name='email']"));
		verifyemail.sendKeys("testleaf.2023@gmail.com");
		
		WebElement forgotsearch = driver.findElement(By.xpath("//button[contains(text(),'Search')]"));
		forgotsearch.click();
		
				

	}

}
