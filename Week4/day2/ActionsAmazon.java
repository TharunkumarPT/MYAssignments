package Week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		System.out.println("Launched amazon - Actions class");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions action = new Actions(driver);
		WebElement findElement = driver.findElement(By.linkText("Conditions of Use & Sale"));
		
		action.scrollToElement(findElement).perform();
		System.out.println("The Text is :" + findElement.getText());
		
		findElement.click();
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotAs, new File("./Screenshot/TryScreenshot.png"));
		
		
		//driver.close();
		
	}
}
