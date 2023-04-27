package assignment;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class UserActions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\PracticeSelenium\\Drivers\\chromeDriver.exe");
		
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
	    WebDriver driver=new ChromeDriver(o);
		
		driver.get("https://www.meesho.com/");
		Actions act=new Actions(driver);
		WebElement WomenWesten=driver.findElement(By.xpath("//div[@class='NavBarDesktop__Subtitle-sc-xsryom-0 izctWK']"));
		act.moveToElement(WomenWesten).build().perform();
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,7000)");
		
		driver.get("https://demoqa.com/droppable");
		
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions Act=new Actions(driver);
		Act.dragAndDrop(drag, drop).build().perform();
        Thread.sleep(5000);
        
       /* driver.findElement(By.xpath("//a[@id='droppableExample-tab-revertable']")).click();
        WebElement drag1=driver.findElement(By.xpath("//div[@id='revertable']"));
		WebElement drop1=driver.findElement(By.xpath("//div[@id='notRevertable']"));
	    Act.dragAndDrop(drag1, drop1).build().perform();
        Thread.sleep(5000);*/
        
	}

}
