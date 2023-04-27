package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowa {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Firefox.driver","F:\\selenium practice\\selenium\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement web=driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		web.sendKeys("mobiles");
		web.submit();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@id='productRating_LSTMOBGK8WZYEJ3G5AAMF47BF_MOBGK8WZYEJ3G5AA_']")).click();


		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);

		//String P = driver.getWindowHandle();
		Thread.sleep(2000);
		ArrayList<String> a=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(a.size());
		for(int i=0;i<a.size();i++)
		{
			for(String g:a)
			{
				driver.switchTo().window(g);
			}
			System.out.println(a.get(i));
			
		}
		
	String s=driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
	System.out.println(s);
        driver.quit();
	}
}
