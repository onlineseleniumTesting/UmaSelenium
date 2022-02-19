package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Natesh.Chetty\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://freecrm.com/");
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
//		
//		driver.findElement(By.linkText("Login")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.name("email")).sendKeys("Uma");
		//driver.findElement(By.className("search_query")).sendKeys("test");
		driver.findElement(By.partialLinkText("Contact")).click();
		//driver.findElement(By.xpath("/html/body/div/div/header/div[3]/div/div/div[2]/form/input[4]")).sendKeys("test xpath");
		
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("test relative");
		//driver.findElement(By.xpath("//label[text()='Email address']//following::input[@id='email']")).sendKeys("uma@gmail.com");
		Thread.sleep(4000);
		WebElement we = driver.findElement(By.id("id_contact"));
		List<WebElement> opt = we.findElements(By.tagName("option"));
		System.out.println(opt.size());
		
		for(WebElement op:opt) {
			System.out.println(op.getText());
		}
		
		
		
		
	}

}
