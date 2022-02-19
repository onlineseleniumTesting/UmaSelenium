package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natesh.Chetty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://freecrm.com/");
		
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("The current url is-"+driver.getCurrentUrl());
		System.out.println(title);
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println(driver.getPageSource());
		driver.findElement(By.id("email")).sendKeys("uma@gmail.com");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
		driver.quit();

	}

}
