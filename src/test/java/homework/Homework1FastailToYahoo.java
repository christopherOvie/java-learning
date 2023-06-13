package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Homework1FastailToYahoo {

	public static void main(String[] args) throws InterruptedException {
		
		//open chrome browser
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
		driver.findElement(By.id("v275-to-input")).sendKeys("tkogl1970");
		driver.findElement(By.id("v275-subject-input")).sendKeys("exxxx");
		
		
		
	}

}
