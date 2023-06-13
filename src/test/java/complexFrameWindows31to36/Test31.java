package complexFrameWindows31to36;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test31 {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Launch site
				driver.get("https://chercher.tech/practice/frames");
				Thread.sleep(3000);
				driver.switchTo().frame(0);     //1st frame in page
				driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("prter test");
					Thread.sleep(3000);
					
					driver.switchTo().frame(0);    //1st inner frame
					
					driver.findElement(By.id("a")).click();
					Thread.sleep(3000);
					driver.switchTo().parentFrame();  // //back to outer frame(1st frame in page)
					driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).clear();//clear content of parent frame
					Thread.sleep(3000);
					
					driver.switchTo().defaultContent();// go back to original page

	}

}
