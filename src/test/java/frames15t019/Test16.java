package frames15t019;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test16 {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("http://www.gmail.com"); //base url
				Thread.sleep(5000);
				//1. locate an element in page source
			WebElement e=	driver.findElement(By.name("hiddenPassword"));

			if(e.isDisplayed()) {
				e.click();
			}
			else {
				System.out.println("element found in page source but not visible in page");
			}
	}

}
