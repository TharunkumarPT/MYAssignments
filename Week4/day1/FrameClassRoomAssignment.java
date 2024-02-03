package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClassRoomAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");

		System.out.println("Launched Frame W3 Website");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Using id/name
		driver.switchTo().frame("iframeResult");
		
		//Using WebElement
		//WebElement identifyFrame = driver.findElement(By.id("iframeResult"));
		//driver.switchTo().frame("iframeResult");
		
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement tryBtn = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryBtn.click();
		//Thread.sleep(1000);
		
		Alert confirmAlert = driver.switchTo().alert();
		
		confirmAlert.accept();
		Thread.sleep(3000);
		
		String text = driver.findElement(By.id("demo")).getText();
		if(text.contains("You pressed OK!")) {
			System.out.println("Clicked on Frame : "+ text);
		}
	}
}
