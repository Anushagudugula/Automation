package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class autosuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("https:/www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("sapphirus systems");
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='mkHrUc']"));
	
		//System.out.println(list.size());
		
		for (WebElement resu : list) {
			System.out.println(resu.getText());
			
		}

	}


}