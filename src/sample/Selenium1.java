package sample;

//import java.awt.AWTException;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Selenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver");
		WebDriver w=new ChromeDriver();
		
		//w.get("https://www.facebook.com/");
		//w.findElement(By.id("email")).sendKeys("bini.rout44@gmail.com");
	//	Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_A);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_A);
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_C);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_C);
		//r.keyPress(KeyEvent.VK_TAB);
		//r.keyRelease(KeyEvent.VK_TAB);
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_V);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_V);
		
		//w.quit();
		w.get("http://www.greenstechnologys.com/index.html");
		WebElement element = w.findElement(By.xpath("/strong[contains(text(),'Plot No.19')]"));
		String s=element.getText();
		System.out.println(s);
	}

}
