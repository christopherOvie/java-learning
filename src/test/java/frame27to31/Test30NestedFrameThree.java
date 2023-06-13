package frame27to31;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test30NestedFrameThree {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("https://chercher.tech/practice/frames");
				//Thread.sleep(5000);
				
				//fill text box in 1st outer frame
				driver.switchTo().frame(0);
				driver.findElement(By.xpath(
					"//b[@id='topic']/following-sibling::input")).sendKeys("john micheal");
				
				//select check box in inner frame in 1st outer frame
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				//back to page directly
				
				driver.switchTo().defaultContent();
				
				//click on drop down in 2nd outer frame
				driver.switchTo().frame(1);
				
				
				driver.findElement(By.id("animals")).click();
				//back to page directly
				driver.switchTo().defaultContent();

	}

}
