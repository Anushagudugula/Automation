package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\\\selenium practice\\\\selenium\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		/*int size = driver.findElements(By.tagName("iframe")).size();
		
		for(int i=0; i<=size; i++){
			driver.switchTo().frame(i);
			int total=driver.findElements(By.xpath("html/body/a/img")).size();
			System.out.println(total);
		    driver.switchTo().defaultContent();
	}*/
		
		//By executing a java script
			/*	JavascriptExecutor exe = (JavascriptExecutor) driver;
				Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
				System.out.println("Number of iframes on the page are " + numberOfFrames);

				//By finding all the web elements using iframe tag
				List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
				System.out.println("The total number of iframes are " + iframeElements.size());
}
}*/
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Object element = null;
		jse.executeScript("arguments[0],scrollView();",element);
		Thread.sleep(2000);
		
driver.findElement(By.xpath("//input[@name='form_fields[travel_comp_date]']")).click();

}
}