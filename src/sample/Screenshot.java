package sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","driver/chromedriver");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
		TakesScreenshot tk=(TakesScreenshot)w;
		File src=tk.getScreenshotAs(OutputType.FILE);
		File des=new File("/Users/pro/Desktop/Selenium/screen/facebook.jpeg");
		FileUtils.copyFile(src, des);
		
	}

}
