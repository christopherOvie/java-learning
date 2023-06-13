package frames15t019;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test20 {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("https://live.internetmultimediaonline.org/login/?msg=87312f88744d85efb550c69bbfec75bc&fr=L2xpdmVzdHJlYW0="); //base url
				Thread.sleep(5000);
				//https://github.com/kaarthikrajacv/weather_latest
				//locate an element in page source and then fill that element
				driver.findElement(By.id("username")).sendKeys("asdfdfzx675");
				driver.findElement(By.xpath("password2")).sendKeys("fgfgggg");
				
				Thread.sleep(5000);
				//driver.findElement(By.xpath("//div[text()=\"Couldn’t find your Google Account\"]"));
				

	}

}
