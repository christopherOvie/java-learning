import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
	     WebDriverManager.chromedriver().setup();
	        RemoteWebDriver driver=new ChromeDriver();
	        driver.get("https://books-pwakit.appspot.com/");
	       // Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']")).getShadowRoot().findElement(By.id("input")).sendKeys("vvvv");
	        driver.switchTo().defaultContent();
	       // driver.findElement(By.xpath("//book-app[@apptitle='BOOKS']")).getShadowRoot().findElement(By.id("input")).sendKeys("abdul kalam sir");
	}

}
