package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/");
		
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
		dateBox.sendKeys("151098");
		dateBox.sendKeys(Keys.TAB);
		 dateBox.sendKeys("0245PM");
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
		 
	}

}
