package frame27to31;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test28 {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(5000);
		//fill text box

		//fill text box
				driver.switchTo().frame(0); //1st frame in page
				driver.findElement(By.xpath(
					"//b[@id='topic']/following-sibling::input")).sendKeys("abdul kalam sir");
				driver.switchTo().frame(0); //1st inner frame
				driver.findElement(By.id("a")).click();
				
				driver.switchTo().parentFrame();
		
				driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).clear();
				Thread.sleep(5000);
				driver.switchTo().defaultContent(); //back to page
	}

}
