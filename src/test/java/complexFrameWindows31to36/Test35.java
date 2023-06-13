package complexFrameWindows31to36;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test35 {

	public static void main(String[] args) throws InterruptedException {
		//Open browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver(); 
				driver.manage().window().maximize();
				//Launch site using base URL
				driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
				Thread.sleep(5000); 
				driver.findElement(By.id("accept-choices")).click();
				
				//Part-1
				//click on a link
				driver.switchTo().frame("iframeResult");//use id or name
				driver.findElement(By.linkText("Visit W3Schools.com!")).click();
				Thread.sleep(5000);
				driver.switchTo().defaultContent();
				
				//Goto 2nd tab/window
				 Set<String>s=driver.getWindowHandles();
				List<String>l= new ArrayList<String>(s);
			     driver.switchTo().window(l.get(1));
				driver.findElement(By.xpath("//div[@id='mypagediv']/following-sibling::a")).click();
				
				Thread.sleep(5000);
				//part2
				//back to ist window tab
				driver.switchTo().window(l.get(0));
				Thread.sleep(5000);
				driver.findElement(By.partialLinkText("Get your")).click();
				Thread.sleep(5000);
				
				//recollect window handles once again due to new tab/window opened
					s=driver.getWindowHandles();
				      l= new ArrayList<String>(s);
				      driver.switchTo().window(l.get(2));
				      driver.findElement(By.linkText("Log in")).click();
						Thread.sleep(5000);
				
				
						//Part-3
						//Back to 1st browser window/tab
						driver.switchTo().window(l.get(0));
						driver.close();
				
				
	}

}
