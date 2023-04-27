package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framespractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.softwaretestinghelp.com/");

List<WebElement> ele=driver.findElements(By.tagName("iframe"));
int numberofTags=ele.size();
System.out.println("No.of iframes in this page "+numberofTags);
System.out.println("Switching to the frame");
driver.switchTo().frame("aswift_1");

driver.switchTo().defaultContent();
	}

}
