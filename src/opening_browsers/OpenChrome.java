package opening_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moin Ahamed\\eclipse-workspace\\testingecoders\\alljars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
