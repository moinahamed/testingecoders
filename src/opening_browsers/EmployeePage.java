package opening_browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Moin Ahamed\\eclipse-workspace\\testingecoders\\alljars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5000/employee");
		Thread.sleep(5000);
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
		String urlofpage = driver.getCurrentUrl();
		System.out.println(urlofpage);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		String expectedtitle = "Ecoders-Employee Page";
		if(expectedtitle .equals(titleofpage)) {
			System.out.println("Title matched test case passes");
		}
		else {
			System.out.println("Title did not match , Test case failed");
		}
		driver.quit();

	}

}
