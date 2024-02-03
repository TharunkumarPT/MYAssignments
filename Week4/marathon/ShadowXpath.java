package Week4.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.sukgu.Shadow;

public class ShadowXpath {

	public static void main(String[] args) {
		
	ChromeOptions op=new ChromeOptions();
        
        op.addArguments("--disable-notifications");
     
        ChromeDriver driver=new ChromeDriver(op);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://dev209623.service-now.com/");
        
        WebElement userid = driver.findElement(By.id("user_name"));
        userid.sendKeys("admin");
        
        WebElement password = driver.findElement(By.id("user_password"));
        password.sendKeys("$Oq63s-IHcyA",Keys.ENTER);

        Shadow obj = new Shadow(driver);
        obj.setImplicitWait(20);
        obj.findElementByXPath("//div[text()='All']").click();
       
        System.out.println("The value of All is selected");
        
        //obj.findElementByXPath("//input[@id='filter']").sendKeys("Service",Keys.ENTER);
        obj.findElementByXPath("//span[text()='Service Catalog']").click();
        obj.setImplicitWait(20);
        System.out.println("The value of Service is selected");
        WebElement findElementByXPath = obj.findElementByXPath("//iframe[@id='gsft_main']");
        
        
        driver.switchTo().frame(findElementByXPath);
        
        
        WebElement mobilesClick = obj.findElementByXPath("//a[contains(text(),'Mobiles')]");        
        mobilesClick.click();
        
        obj.findElementByXPath("//strong[text()='Apple iPhone 13 pro']").click();
       // driver.close();
	}

}
