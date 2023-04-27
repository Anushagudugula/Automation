package assignment;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Banner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		
		// Forward navigation
		for(int i =0;i<4;i++)
		{
		      driver.findElement(By.xpath("//a[@class='a-carousel-goto-nextpage']")).click();
		      Thread.sleep(1000);
		  }

		// back navigation
		for(int j=0;j<3;j++)
		{
		     driver.findElement(By.xpath("//a[@class='a-carousel-goto-prevpage']")).click();
		     Thread.sleep(1000);

	}

	}
}
