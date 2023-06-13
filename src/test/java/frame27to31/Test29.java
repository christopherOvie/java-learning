package frame27to31;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test29 {
	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("https://chercher.tech/practice/frames");
				Thread.sleep(5000);
				
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("fff");
				//select check box in inner frame
				
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				
				driver.switchTo().defaultContent();
				driver.close();
	}

}
