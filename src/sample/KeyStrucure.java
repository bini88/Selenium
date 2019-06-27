package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class KeyStrucure {

	public static void main(String[] args) throws  InterruptedException, AWTException{
		System.setProperty("webdriver.chrome.driver","driver/chromedriver");
		WebDriver w=new ChromeDriver();
		
		w.get("https://www.facebook.com/");
		 WebElement e = w.findElement(By.id("email"));
		e.sendKeys("K");
		Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_A);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_A);
		//r.keyPress(KeyEvent.VK_COPY);
		//r.keyPress(KeyEvent.VK_C);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_COPY);
		w.findElement(By.id("pass")).click();
		//r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_PASTE);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_PASTE);
	}

}
