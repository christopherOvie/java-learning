package practice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test9 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com"); //base url

		//get current url of the page
		
	String url=	driver.getCurrentUrl();
	
	if(url.startsWith("https")) {

	System.out.println("secured site");	
	}
	else {
		System.out.println("unsecured site");
	}
	}

}
