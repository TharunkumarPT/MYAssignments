package Week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AlertsTest {

	public static void main(String[] args) {

		
		ChromeOptions op=new ChromeOptions();
        
        op.addArguments("--disable-notifications");
     
        ChromeDriver driver=new ChromeDriver(op);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.tatacliq.com/");
        
        driver.findElement(By.xpath("//button[@class='No thanks']")).click();
        
        //driver.findElement(By.xpath("//a[@class='wzrkClose']")).click();
        
        WebElement mouseover = driver.findElement(By.xpath("//div[text()='Brands']"));        
        Actions act=new Actions(driver);        
        act.moveToElement(mouseover).perform();
                
        WebElement mouseover1 = driver.findElement(By.xpath("//div[contains(text(),'Watches')]"));
        Actions act1=new Actions (driver);
        act1.moveToElement(mouseover1).perform();
            
        WebElement mouseover2 = driver.findElement(By.xpath("//div[text()='Casio']"));
        Actions act2=new Actions(driver);
        act2.moveToElement(mouseover2).perform();

	}

}
