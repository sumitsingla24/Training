package com.seleniumtraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lecture1_locator {

	
/*In Chrome Press Esc
 *Evaluating Xpath $x("//input[@id='search']")
*/
	/*Various Xpath Syntax
	 * By ID
	 * 		//input[@id='search']
	 * 		//*[@id='search']
	 * By Name
	 * 		//input[@name='suggestion']
	 * By 2 locators
	 * 		//input[@id='search'][@name='suggestion']
	 * 		//input[@id='search' and @name='suggestion']
	 * Using Starts With
	 * 		//input[starts-with(@id,'search')]
	 * Using Contains
	 * 		//input[contains(@id,'search')]
	 * Using Preceding Sibling
	 * 		//input[@id='search']/preceding-sibling::input
	 * Using Parent Tag
	 * 		//input[@id='search']/parent::fieldset
	 * Move 2 level up
	 * 		//input[@id='search']/../..
	 * Using following sibling
	 * 		//input[@id='search']/following-sibling::select
	 * Using Span for Auto Complete suggestions
	 * 		//span[contains(@class,'autoCompleteItem__label')][contains(text(),'Bangalore, India')]
	 * Images
	 * 		//img[@alt='image alt text goes here']
	 * For Tables
	 * 		//table[@id='table1']//tr[4]/td[2]
	 * 		//table[@class='nice'])//th[text()='headertext']/
	 * For Anchor Tag
	 * 		//a[contains(@href,'href goes here')]
	 * 		//a[contains(@href,'#id1')]/@class
	 * 
	 */
	
	/*Various Locators
	 * By  ID
	 * 		<input id="email" class="required" type="text"/> --> WebElement element = driver.findElement(By.id("email"));
	 * By Name
	 * 		<input name="register" class="required" type="text"/> --> driver.findElement(By.name("register"));
	 * By linkText
	 * 		<a href="http://www.seleniumhq.org">Downloads</a> --> driver.findElement(By.linkText("Downloads"));
	 * By Partial Link Text
	 * 		<a href="seleniumhq.org">Download selenium server</a> --> driver.findElement(By.PartialLinkText("Download"));
	 * By TagName -> Select/Dropboxes/checkbox 
	 * 		Select select = new Select(driver.findElement(By.tagName("select")));
	 * 		select.selectByVisibleText("Nov");
	 * 		select.selectByValue("11");
	 * By Class Name
	 * 		driver.findElement(By.className(“sample”));
	 * 
	*/
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\JarFiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://www.amazon.in");// driver.get("http://www.amazon.in")
		
		WebElement element = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		element.sendKeys("Toys");
		
		
	}

}
