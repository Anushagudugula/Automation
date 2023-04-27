package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\selenium practice\\PracticeSelenium\\Drivers\\geckodriver.exe");

		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);


		driver.get("https:/www.monster.com/");
		String Parentwindow=driver.getWindowHandle();
		System.out.println("Before switching title is="+driver.getTitle());

		driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_primaryBtn__text']")).click();
		driver.findElement(By.xpath("//div[@id='googleSignIn']")).click();

		Thread.sleep(2000);

		        ArrayList<String> allWindows=new ArrayList(driver.getWindowHandles());
				System.out.println(allWindows.size());
				
				 driver.switchTo().window(allWindows.get(1));
//				 for(int i=0;i<=allWindows.size();i++)
//				 {
//					 driver.switchTo().window(allWindows.get(i));
//				 }
				
				 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anushagudugual@gmail.com");
				 driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
				 
				 driver.switchTo().window(Parentwindow);
				 
				 driver.findElement(By.id("fullName")).sendKeys("Anusha");
				 
//		Set<String> childWindow = driver.getWindowHandles();
//		Thread.sleep(2000);
//		for(String allid:childWindow)
//		{
//			if(!Parentwindow.equals(childWindow))
//			{
//				driver.switchTo().window(allid);
//			}
//		}
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anushagudugual@gmail.com");
//		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
//		driver.switchTo().window(Parentwindow);
//		driver.findElement(By.id("fullName")).sendKeys("Anusha");
	}
}