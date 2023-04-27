package assignment;

import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowsM {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.instagram.com/accounts/login/");
		

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		Thread.sleep(2000);

		ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
		int windowsList=list.size();
		System.out.println("the totla windows are :"+windowsList);
		
		driver.switchTo().window(list.get(2));
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(list.get(4));
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(list.get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_3']")).click();
		
	Actions Act=new Actions(driver);
	WebElement Cameras=driver.findElement(By.xpath("//a[@aria-label='Cameras']"));
	Act.moveToElement(Cameras).build().perform();
	Thread.sleep(2000);
	}
	

}
