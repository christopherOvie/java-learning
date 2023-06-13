package complexFrameWindows31to36;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test36 {

	public static void main(String[] args) throws InterruptedException {
		//Open browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver(); 
				driver.manage().window().maximize();
				//Launch site using base URL
				driver.get("https://www.flipkart.com");
				Thread.sleep(5000); 
				driver.findElement(By.xpath( "//span[text()='Login']/preceding::button[1]")).click();
				//Close banner if exists
//				try
//				{
//					driver.findElement(By.xpath( "//span[text()='Login']/preceding::button[1]")).click();
//					Thread.sleep(5000); 
//				}
//				catch(Exception ex)
//				{
//					System.out.println("No banner this time");
//				}
				//click on "beauty" link
				driver.findElement(By.xpath("//div[contains(text(),'Beauty')]")).click();
				Thread.sleep(5000); 
				
				//click on "VIEW ALL"
				driver.findElement(By.xpath("(//a[text()='VIEW ALL'])[1]")).click();
				Thread.sleep(5000);
				
				//click on cameras link
				driver.findElement(By.xpath("//div[text()='Top Mirrorless Cameras']")).click();
				Thread.sleep(5000);

	}

}
