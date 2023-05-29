package frame2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test21 {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
				Thread.sleep(5000);
				driver.findElement(By.id("accept-choices")).click();
				Thread.sleep(5000);
				//fill fields
				//switch to frame by using "frame id/name" or "frame index" or "as an element"
				driver.switchTo().frame("iframeResult");
				driver.findElement(By.name("fname")).clear(); //to remove existing value
				driver.findElement(By.name("fname")).sendKeys("peter");
				
				Thread.sleep(5000);
				driver.findElement(By.name("lname")).clear(); //to remove existing value
				driver.findElement(By.name("lname")).sendKeys("peter mike");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@value='Submit']")).click();
				driver.switchTo().defaultContent();

	}

}
