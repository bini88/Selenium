package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCRq3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver");
		WebDriver w=new ChromeDriver();
		System.out.println("hello");
		w.get("https://www.toolsqa.com/");
		WebElement up = w.findElement(By.xpath("//span [contains(text(),'Benefit')]"));
		JavascriptExecutor js=(JavascriptExecutor)w;
		js.executeScript("arguments[0].scrollIntoView(false)",up );
	}

}
