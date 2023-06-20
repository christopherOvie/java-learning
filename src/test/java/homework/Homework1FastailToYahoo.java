package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework1FastailToYahoo {

	public static void main(String[] args) throws InterruptedException {
		
		//open chrome browser  //task test latest mail, subject
		//.edgedriver().setup();
		//RemoteWebDriver driver=new EdgeDriver();
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		//Launch site
		driver.get("https://www.fastmail.com/");
		//do login
		driver.findElement(By.xpath("//strong[text()='Log in']/parent::a")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("tkogl1970@fastmail.com");
		driver.findElement(By.name("password")).sendKeys("Father70!?");
		
		driver.findElement(By.xpath("//span[text()='Log in']/parent::button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a.s-new-message")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("v275-to-input")).sendKeys("tkogl1970@yahoo.com");
		Thread.sleep(5000);
		driver.findElement(By.id("v275-subject-input")).sendKeys("exxxx");
		
		Thread.sleep(5000);
		   
		//driver.findElement(By.xpath("//button[@id='v290']")).click();
		

		//driver.findElement(By.cssSelector("#v291 span[class='label']")).sendKeys("C:\\Foundation School Brochure.docx");
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\odibo ovie\\Desktop\\boy.jpeg");
		Thread.sleep(2000);
		
		driver.findElement(By.id("defanged1")).sendKeys("Hi students,\nHow is your assignment?\nFeel free to share your knowledge");
		
		driver.findElement(By.cssSelector("#v155")).click();
		
		
		//Take new window/Tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> s=driver.getWindowHandles(); 
		List<String> a=new ArrayList<String>(s); 
		//switch to that new window
		driver.switchTo().window(a.get(1));
		//Launch fast mail site
		driver.get("http://www.yahoomail.com");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.id("login-username")).sendKeys("tkogl1970");
		
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-passwd")).sendKeys("Father70!?");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(5000);
		String textTitle
		=driver.findElement(By.xpath("// ul[contains(@role,'list')]/li[3]//*[contains(text(),'exxxx')]")).getText();
		System.out.println(textTitle);
		
		String messageText=
		driver.findElement(By.xpath("// ul[contains(@role,'list')]/li[3]//div[contains(text(),' How is your assignment? Feel free to share your knowledge')]")).getText();
		System.out.println(messageText);
		
	}

}
