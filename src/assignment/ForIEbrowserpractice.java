package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ForIEbrowserpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.IE.driver","F:\\selenium practice\\selenium\\Drivers\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://demoqa.com/auto-complete");
		//driver.findElement(By.xpath("//div[@class='auto-complete__control css-yk16xz-control']")).sendKeys("dhfgdjHjk");
		

	}

}
