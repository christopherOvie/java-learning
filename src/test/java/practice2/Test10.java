package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {

	
//	public static String getPageTitle(WebDriver driver) {
//		return null;
//		
//	}
	
//https://github.com/vinayaktitti2015/playwright-march-2023
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com"); //base url
		
		
	//System.out.println(Test10.getPageTitle(driver));
		

	}

}
