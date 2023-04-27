package assignment;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		
		//driver.findElement(By.xpath("//button[@aria-label='Open the date view']")).click();
		
//WebElement nextLink = driver.findElement(By.xpath("//div[@id='datetimepicker_dateview']//div[@class='k-header']//a[contains(@class,'k-nav-next')]"));
		driver.findElement(By.xpath("//*[@class='k-icon k-i-calendar k-button-icon']")).click();
		Thread.sleep(2000);
driver.findElement(By.xpath("//*[@class='k-button-text']")).click();
	}
}
	
	
	