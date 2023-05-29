package frame2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test24 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub//Open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		//Thread.sleep(5000);
		driver.findElement(By.id("accept-choices")).click();
		WebElement e=driver.findElement(By.id("menuOverlay"));
		//driver.switchTo().frame(e); 
		
	}
}
