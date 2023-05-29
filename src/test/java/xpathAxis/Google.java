package xpathAxis;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	RemoteWebDriver driver;
	
	public void setUp(String br) {
		
		
		if(br.matches("Chrome")) {
			System.out.println("sssssssssssssss");
		}
	}
	public void openURL(String url) {
	driver.get(url);
	}
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
	//	RemoteWebDriver driver=new ChromeDriver();
		
		Google google= new Google();
		google.setUp("Chrome");
		google.openURL("https://www.google.com/");
		
		

	}

}
