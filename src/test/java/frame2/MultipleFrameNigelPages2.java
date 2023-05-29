package frame2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleFrameNigelPages2 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm"); 
				Thread.sleep(5000);
				driver.switchTo().frame(0);
				driver.findElement(By.xpath("//a[contains(text(), ' Background')]")).click();
		
				driver.switchTo().defaultContent();
				//Click on Close button
				driver.switchTo().frame(1);
				driver.findElement(By.xpath("//input[@name='update']")).click();

				
				driver.switchTo().defaultContent(); //back to page
		
				driver.switchTo().frame(2);
				driver.findElement(By.xpath("(//a[normalize-space()='TRY CODING'])[1]")).click();
				driver.switchTo().defaultContent(); //back to page
				Thread.sleep(5000);
}
}
