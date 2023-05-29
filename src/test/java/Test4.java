import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver=new ChromeDriver();
        driver.get("https://www.google.co.uk/");

	}

}
