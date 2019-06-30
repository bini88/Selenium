package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollud {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver");
		WebDriver w=new ChromeDriver();
		//w.get("https://www.toolsqa.com/");
		//WebElement dw=w.findElement(By.xpath("//span[text()='Recent Articles']"));
		////WebElement up=w.findElement(By.xpath("//span[contains(text(),'Benefit')]"));
		//JavascriptExecutor js=(JavascriptExecutor)w;
		//js.executeScript("arguments[0].scrollIntoView(true)",dw);
		//Thread.sleep(5000);
		//js.executeScript("arguments[0].scrollIntoView(false)",up);
		w.get("http://www.greenstechnologys.com");
		WebElement element = w.findElement(By.xpath("//h2[contains(text(),'Greens Technologys')]"));
		String e=element.getText();
		System.out.println(e);
		
	}

}
