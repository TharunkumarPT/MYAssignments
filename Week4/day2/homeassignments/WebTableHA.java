package Week4.day2.homeassignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHA {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://finance.yahoo.com/?guccounter=1");

		System.out.println("Launched Yahoo India website");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame=driver.findElement(By.linkText("Crypto"));
		frame.click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//a[@data-test='quoteLink']"));
		System.out.println(findElements.size());
		
			for(WebElement each:findElements) {
				System.out.println(each.getText());
			}
		
	}

}
