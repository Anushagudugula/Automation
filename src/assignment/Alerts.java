package assignment;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		

		List<WebElement> list=driver.findElements(By.xpath("//div[@class='col-md-6']"));
		System.out.println(list.size());

		for (WebElement l : list) {
			System.out.println(l.getText());
		}



		driver.findElement(By.xpath("//button[@id='alertButton']")).click();

		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert a1=driver.switchTo().alert();
		a1.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
	    
		driver.findElement(By.id("promtButton")).click();
		Alert e=driver.switchTo().alert();
		Thread.sleep(3000);
		e.sendKeys("anu");
		e.accept();
	    

		
	}
}





































