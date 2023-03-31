package opening_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urldefect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moin Ahamed\\eclipse-workspace\\testingecoders\\alljars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5000/defect");
		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String src = driver.getPageSource();
		System.out.println(src);
		String title = driver.getTitle();
		System.out.println(title);
		String expectedtitle = "http://127.0.0.1:5000/defect";
		if(expectedtitle .equals(url)) {
			System.out.println("url matched test case passes");
		}
		else {
			System.out.println("url did not match , Test case failed");
		}
		
	}

}
