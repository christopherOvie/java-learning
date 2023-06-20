package eccomrce37to41;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test41 {

	public static void main(String[] args) throws InterruptedException {
		//open chrome browser
				WebDriverManager.chromedriver().setup();
				RemoteWebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				//Launch yahoo site
				driver.get("http://www.yahoomail.com");
			
				Thread.sleep(5000);
				
				//Do login
				driver.findElement(By.id("login-username")).sendKeys("tkogl1970");
				
				driver.findElement(By.id("login-signin")).click();
				Thread.sleep(5000);
				driver.findElement(By.id("login-passwd")).sendKeys("Father70!?");
				driver.findElement(By.id("login-signin")).click();
				Thread.sleep(5000);
//				driver.findElement(By.id("mail-accept-all-1")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//button[@type='submit'][@name='agree']")).click();
//				//Click on Compose
				driver.findElement(By.linkText("Compose")).click();
			Thread.sleep(5000);
				//fill fields
				driver.findElement(By.id("message-to-field")).sendKeys("tkogl1970@fastmail.com");
				driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("test mail");
				
				driver.findElement(By.xpath("//div[@aria-label='Message body']")) .sendKeys("Hi students,\nHow are you?\nI hope you are in deep sleep");
				
				//attach file(file upload)
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Foundation School Brochure.docx");
				
				
				Thread.sleep(5000);
				
				//send mail
				driver.findElement(By.xpath("//button[@title='Send this email']")).click();
				
				Thread.sleep(2000);
				String x=driver.findElement(By.xpath("//div[@role='presentation']/following-sibling::div[1]")).getText();
				System.out.println(x);
				
				//Take new window/Tab
				driver.switchTo().newWindow(WindowType.WINDOW);
				Set<String> s=driver.getWindowHandles(); 
				List<String> a=new ArrayList<String>(s); 
				//switch to that new window
				driver.switchTo().window(a.get(1));
				//Launch fast mail site
				driver.get("http://www.fastmail.com");
				Thread.sleep(5000);

				//do login
				driver.findElement(By.xpath("//strong[text()='Log in']/parent::a")).click();
				Thread.sleep(5000);
				driver.findElement(By.name("username")).sendKeys("tkogl1970@fastmail.com");
				driver.findElement(By.name("password")).sendKeys("Father70!?");
				
				driver.findElement(By.xpath("//span[text()='Log in']/parent::button")).click();
				Thread.sleep(5000);
				
				////ul[contains(@class,'Mailbox')]/li[1]//div[@class='v-MailboxItem-from']/span/span
				
				String y = driver.findElement(By.xpath("//ul[contains(@class,'Mailbox')]/li[1]//a//div//span//span")).getAttribute("title");
				
				if(y.equalsIgnoreCase("tkogl1970@fastmail.com")) {
					System.out.println("test passed");
				}
				else {
					System.out.println("test failed");
				}
				driver.findElement(By.xpath("//div[contains(@class,'MainNavToolbar')]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

}
