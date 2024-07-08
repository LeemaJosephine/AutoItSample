package day30;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AutoItUploadFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertpdftojpg.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("browse")).click();
		
		// Executing the AutoIT script
		
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\AutoIT_Script\\uploadFile.exe");
		
		//driver.findElement(By.xpath("//button[contains(text(),'Convert files')]")).click();
		
		WebElement convert = driver.findElement(By.xpath("//button[contains(text(),'Convert files')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",convert);
		convert.click();
		
	}

}
