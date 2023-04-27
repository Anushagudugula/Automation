package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class UserActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\geckodriver.exe");
		
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/fashion-ssd-april23-trendy-store");
//		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
//		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		WebElement Fashion=driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[3]"));
		act.moveToElement(Fashion).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Formal Shirts")).click();
		
		
		
		
		

		
	}
}
		


