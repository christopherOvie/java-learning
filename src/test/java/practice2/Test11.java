package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {
	
public WebDriver driver;
	
	public  void openURL(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeDriver driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			ChromeDriver driver = new ChromeDriver();
		}
	}
	public static void main(String[] args) {
		
	
		ChromeDriver driver = new ChromeDriver();

	}

}
