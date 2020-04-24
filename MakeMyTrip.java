package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[4]/div")).getAttribute("class");
		
		//RoundTrip
		
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[1]/ul/li[2]/span")).click();
		System.out.print(driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[1]/ul/li[2]/span")).isSelected());
		
		//From search
		
		driver.findElement(By.id("fromCity")).click();
		
		//clear the edit box
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Mumb");
		Thread.sleep(1000);
		
		//Auto enter the option mumbai
		
		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
//		Thread.sleep(2000);
		
		//TOCitySearch
		
		//click the edit box
		
//		driver.findElement(By.id("toCity")).click();
		
		//clear the edit box

		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys("sing");
		Thread.sleep(1000);
//		
//		//Arrow Down
//		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys(Keys.ARROW_DOWN);	
////		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input")).sendKeys(Keys.ENTER);
//		
		//click
		
//		driver.findElement(By.id("react-autowhatever-1-section-0-item-0")).click();
		
		//Date
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[7]/div")).click();
		Thread.sleep(1000);
		//Return Date
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[5]/div")).click();
		Thread.sleep(1000);
		
		//Travelers
		
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[5]")).click();
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div/ul[1]/li[2]")).click();
//		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/div/ul[1]/li[2]"), "2");
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[5]/div[1]/button")).click();
		
		//Search
		driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/p/a")).click();
		System.out.println("Result:" +driver.findElement(By.xpath("//*[@id=\'fullpage-error\']/div/p[2]")).getText());
	}

}
