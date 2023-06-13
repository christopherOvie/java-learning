package practice2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("http://www.sentia.in"); //base url
		Thread.sleep(5000);
		//get window handle ID of active browser window/tab
	String windowHandles=	driver.getWindowHandle();
	System.out.println(windowHandles);

	}

}
