package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver" );
		WebDriver w=new ChromeDriver();
		w.get("https:www.toolsqa.com/automation-practice-form/");
		WebElement m = w.findElement(By.id("selenium_commands"));
		Select s=new Select(m);
		boolean mu = s.isMultiple();
		System.out.println(mu);
		System.out.println("Get multiple options");
		List<WebElement>opt=s.getOptions();
		for (WebElement we : opt) {
			String text = we.getText();
			System.out.println(text);
			if(text.equals("Browser Commands")||text.equals("Wait Commands"))
			{
				s.selectByVisibleText(text);
			}
			
			
		}
		System.out.println();
		System.out.println("Get all selected options");
		List<WebElement>allsel=s.getAllSelectedOptions();
		for (WebElement x : allsel) {
			System.out.println(x.getText());
			
		}
		System.out.println();
		System.out.println("Get first selected option");
		WebElement fsl = s.getFirstSelectedOption();
		System.out.println(fsl.getText());
		s.deselectByIndex(0);
		//w.quit();
		

	}

}
