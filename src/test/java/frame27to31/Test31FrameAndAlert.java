package frame27to31;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test31FrameAndAlert {

	public static void main(String[] args) throws InterruptedException {
		//open browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver	driver=new ChromeDriver();
				//Launch site
				driver.get(
				 "https://www.javatpoint.com/oprweb/test.jsp?filename=javascript-alert1");
			
				driver.findElement(By.xpath("//div[@class='fc-footer-buttons']/button[@aria-label='Consent']")).click();
				driver.switchTo().frame("iframewrapper");
				driver.findElement(By.xpath("//input[@value='Click me']")).click();
				
			String text=driver.switchTo().alert().getText();
			System.out.println(text);
			
			driver.switchTo().alert().dismiss();
			driver.switchTo().defaultContent();
			
			driver.close();

	}

}
