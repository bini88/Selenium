package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver");
		WebDriver w=new ChromeDriver();
		w.get("https://www.facebook.com/");
	w.findElement(By.id("email")).sendKeys("bini.rout44@gmail.com");
	Thread.sleep(5000);
	w.findElement(By.name("pass")).sendKeys("bini");
	}

}
