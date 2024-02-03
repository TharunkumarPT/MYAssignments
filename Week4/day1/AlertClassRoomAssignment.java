package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassRoomAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.leafground.com/alert.xhtml");

		System.out.println("Launched Testleaf Alert Website");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement searchbox = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		searchbox.click();
		Thread.sleep(3000);
		//span[text()='Show'])[5]"));
		
		Alert confirmAlert = driver.switchTo().alert();
		
		confirmAlert.sendKeys("Dismissing");
		Thread.sleep(3000);
		
		confirmAlert.dismiss();
		
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println("Alert is cancelled :"+ text);
	}
}
