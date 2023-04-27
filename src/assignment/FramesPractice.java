package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		int total_frames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames in application is "+total_frames);
		
		
		driver.switchTo().frame(1);
		String s = driver.findElement(By.xpath("//a[@title='class in org.openqa.selenium.remote']")).getText();
		System.out.println(s);
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		String d = driver.findElement(By.xpath("//a[@target='packageFrame']")).getText();
		System.out.println(d);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		String f = driver.findElement(By.linkText("org.openqa.selenium.bidi.browsingcontext")).getText();
		System.out.println(f);

	driver.quit();
	
	}

}               
