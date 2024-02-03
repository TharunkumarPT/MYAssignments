package Week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/");

		System.out.println("Launched IRCTC Window Website - GetWindowHandle");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement flights = driver.findElement(By.linkText("FLIGHTS"));
		flights.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		ArrayList<String> arr = new ArrayList<String>(windowHandles);
		driver.switchTo().window(arr.get(1));
		String childWindowTitle = driver.getTitle();
		
		System.out.println("The child window title of Flights:" + childWindowTitle);
		
		driver.switchTo().window(arr.get(0));
		String childWindowTitle1 = driver.getTitle();
		
		System.out.println("Reached Parent window title of Flights:" + childWindowTitle1);
		
		driver.close();
		
	}
}
