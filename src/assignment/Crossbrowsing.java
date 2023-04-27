package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Crossbrowsing {
	
	/*String path=System.getProperty("user.dir");
	System.out.println("the user dir is="+path);*/
	
public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f=new File("F:\\selenium practice\\selenium\\Data\\Data.Properties");
		FileInputStream fis=new FileInputStream(f);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browse=prop.getProperty("browser");
		System.out.print(browse);
		
		if(browse.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	}


	else if (browse.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.chrome.driver","F:\\selenium practice\\selenium\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
	}
	else {
		System.out.println("your choosen wrong browser");
			
		}
		driver.get(prop.getProperty("Url"));
	}
	
	
	
}
