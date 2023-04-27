package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practicewindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","F:\\selenium practice\\PracticeSelenium\\Drivers\\geckodriver.exe");
		
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.findElement(By.id("windowButton")).click();
		driver.findElement(By.id("messageWindowButton")).click();
		
		String MainWindow=driver.getWindowHandle();
		System.out.println("Main window handle is "+MainWindow);
		
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println("child windowhandle is "+allwindows);
		Iterator<String> allwindow=allwindows.iterator();
		
		while(allwindow.hasNext()) {
			String childwindow=allwindow.next();
			if(!MainWindow.equalsIgnoreCase(childwindow)) {
				driver.switchTo().window(childwindow);
				
				
			}
		}
		
	}

}
