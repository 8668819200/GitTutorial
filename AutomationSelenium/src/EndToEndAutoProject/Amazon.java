package EndToEndAutoProject;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement dropdown = driver.findElement(By.xpath("//span[@class=\'nav-line-2 \']"));
		Actions Mouse = new Actions(driver);
		dropdown.click();
		Thread.sleep(3000);
		
		//WebElement Sign = driver.findElement(By.xpath("(//span[text()=\'Sign in\'])[2]"));
		//Sign.click();
		//Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input[@type=\'email\']"));
		username.click();
		username.sendKeys("8668819200");
		Thread.sleep(2000);
		
		WebElement Continue = driver.findElement(By.xpath("//input[@id=\'continue\']"));
		Continue.click();
		Thread.sleep(2000);
		
		WebElement Password = driver.findElement(By.xpath("//input[@type=\'password\']"));
		Password.sendKeys("Ruchika@123");
		Thread.sleep(2000);
		
		WebElement SignUp = driver.findElement(By.xpath("//input[@id=\'signInSubmit\']"));
		SignUp.click();
		Thread.sleep(2000);
		
		WebElement All = driver.findElement(By.xpath("//i[@class=\'hm-icon nav-sprite\']"));
		All.click();
		Thread.sleep(2000);
		
		WebElement AudioBook = driver.findElement(By.xpath("//div[text()=\'Audible Audiobooks\']"));
		AudioBook.click();
		Thread.sleep(2000);
		
		WebElement AllAudioBooks = driver.findElement(By.xpath("//a[text()=\'All Audiobooks\']"));
		AllAudioBooks.click();
		Thread.sleep(2000);
		
		WebElement Book = driver.findElement(By.xpath("(//img[@alt=\'The Psychology of Money: Timeless Lessons on Wealth, Greed, and Happiness\'])[2]"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", Book);
		Thread.sleep(3000);
		Book.click();
		Thread.sleep(2000);
		
		Set<String> set1 = driver.getWindowHandles();
		ArrayList <String> al = new ArrayList(set1);
		driver.switchTo().window(al.get(1));
		Thread.sleep(2000);
		
		
		WebElement Listen = driver.findElement(By.xpath("//input[@data-test=\'sampleAudioListen\']"));
		Listen.click();
		Thread.sleep(3000);
		
		WebElement pause = driver.findElement(By.xpath("(//input[@type=\'submit\'])[6]"));
		pause.click();
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
