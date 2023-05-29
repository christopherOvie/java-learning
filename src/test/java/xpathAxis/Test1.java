package xpathAxis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://money.rediff.com/gainers"); //base url
		Thread.sleep(4000);
		//self
		String text=driver.findElement(By.xpath("//a[contains(text(),'Mallcom (India) L')]/self::a")).getText();
		System.out.println(text);
		
		//parent
		String text1=driver.findElement(By.xpath("//a[contains(text(),'Mallcom (India) L')]/parent::td")).getText();
		System.out.println(text1);
		
		//anccestors	
		String text2=driver.findElement(By.xpath("//a[contains(text(),'Mallcom (India) L')]/ancestor::tr")).getText();
		System.out.println(text2);

	}

}
