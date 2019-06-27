package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement e=driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', 'bini')",e);
		Object o = js.executeScript("return arguments[0].getAttribute('value')", e);
		String s=(String)o;
		System.out.println(s);
		WebElement btn=driver.findElement(By.id("loginbutton"));
		js.executeScript("arguments[0].click()", btn);
	}

}
