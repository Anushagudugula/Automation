package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Sreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions o=new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		
		driver.get("https://demoqa.com/select-menu");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("F:\\selenium practice\\selenium\\Sreenshot.jpg");
		Files.copy(src, dst);
		
	}

}
