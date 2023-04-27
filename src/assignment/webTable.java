package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.gecko.driver","F:\\selenium practice\\selenium\\Drivers\\geckodriver.exe");
		
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);

       
		driver.get("https://www.dezlearn.com/webtable-example/");
		WebElement head=driver.findElement(By.xpath("//table[@class='tg']"));
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		System.out.println("the rows count is "+rows.size());
		
		for (WebElement web : rows) {
			System.out.println(web.getText());
			
		}
		
		List<WebElement> head1=driver.findElements(By.tagName("th"));
		System.out.println("the head1 count is" +head1.size());
		
		for (WebElement webElement : head1) {
			System.out.println(webElement.getText());
			
		}
		
	 }

	}


