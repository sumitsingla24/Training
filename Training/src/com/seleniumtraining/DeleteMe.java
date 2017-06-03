package com.seleniumtraining;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class DeleteMe {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.ie.driver", "C:\\Eclipse\\JarFiles\\IEDriverServer.exe");
   	 	driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		WebElement elementTextBox = driver.findElement(By.xpath(".//input[@name='q']"));
		elementTextBox.sendKeys("date time" + Keys.ENTER);
		Thread.sleep(2000);
		WebElement timeLabel = driver.findElement(By.xpath(".//div[@class='vk_bk vk_ans']"));
		System.out.println(timeLabel.getText());
		WebElement dateLabel = driver.findElement(By.xpath(".//span[@class='_Hq']"));
		System.out.println(dateLabel.getText());
		String[] timesplit = (String[])timeLabel.getText().split(":");
		String[] datesplit = (String[])dateLabel.getText().split(" ");
		// Create object of SimpleDateFormat class and decide the format
		 DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm");
		 //Comments Changed
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println("Current date and time is " +date1);
		 String[] systedatetimesplit = (String[])date1.toString().split(" ");
		 System.out.println("timesplit " +timesplit[0]);
		 System.out.println("datesplit " +datesplit[0]);
		 System.out.println("systemdatesplit " +systedatetimesplit[0]);
		 driver.close();
		driver.quit();

	}

}
