package Week4.marathon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {



	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.tatacliq.com/");

		System.out.println("Launched TataCliq India website");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.findElement(By.id("wzrk-cancel")).click();
		//div[text()='Brands
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions act = new Actions(driver);
		act.moveToElement(brands).perform();

		WebElement watchAndAccessories = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(watchAndAccessories).perform();
		
		
		WebElement firstFeature = driver.findElement(By.xpath("//div[text()='Casio']"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(firstFeature).click(firstFeature).perform();
		
		
		
		/*
		 * Actions act = new Actions(driver); act.moveToElement(brands).perform();
		 * act.moveToElement(watchAndAccessories).perform();
		 * act.moveToElement(firstFeature).click();
		 */

		WebElement newArrivals = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));

		Select dropDown = new Select(newArrivals);
		dropDown.selectByValue("isProductNew");

		WebElement forMens = driver.findElement(By.xpath("//div[text()='Men']"));
		forMens.click();

		List<WebElement> listofAllWatchPrices = driver.findElements(By.tagName("a"));
		WebElement webElement = listofAllWatchPrices.get(0);
		
		List<WebElement> watchesPresent = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']//h3"));
				
		
		for( int i=0;i<= watchesPresent.size();i++) 
		{
			Thread.sleep(2000);
			System.out.println("The Price of all the watches are" + watchesPresent.get(i).getText());
			
		}
		driver.executeScript("arguments[0].click();", webElement);
		
	}

}
