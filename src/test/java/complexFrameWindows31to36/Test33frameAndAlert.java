package complexFrameWindows31to36;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test33frameAndAlert {

	public static void main(String[] args) throws InterruptedException {
		//Open chrome browser
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get( "https://www.javatpoint.com/oprweb/test.jsp?filename=javascript-alert1");
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[@aria-label='Consent']")).click();
				
				driver.switchTo().frame(0);
				
				driver.findElement(By.xpath("//input[@value='Click me']")).click();
				
			String text=	driver.switchTo().alert().getText();
			System.out.println("text is :"+text);
			
			driver.switchTo().alert().accept();
			//back to page
			
			driver.switchTo().defaultContent();
	}

}
