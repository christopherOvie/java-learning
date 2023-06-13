package practice2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 {

	public static void main(String[] args) {
		//open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				//Launch site
				driver.get("http://www.w3schools.com"); //base url
				
				driver.findElement(By.id("accept-choices")).click();
				
				//click on a button
				driver.findElement(By.linkText("Try it Yourself")).click();
				
				//get window handle IDs of all browser windows/tabs
				
				Set <String> x=driver.getWindowHandles();
				System.out.println(x);
				//switch in 2nd tab  from set to list
				
			List<String>y=	new ArrayList<String>(x);
			driver.switchTo().window(y.get(1));
			driver.close();
			driver.switchTo().window(y.get(0));
			System.out.println(driver.switchTo().window(y.get(0)));
			
	}

}
