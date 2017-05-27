package com.seleniumtraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Lecture2_WebElements {

	public static WebDriver driver;
	public static WebDriverWait driverWait;
	public static Logger Log = Logger.getLogger(Lecture2_WebElements.class.getName());
	
	@BeforeTest(groups = {"high"})
	public static void launchApplication()  {
		
		launchBrowser("Chrome","http://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS); // implicit wait for find element wait for 10 sec to find element
		Reporter.log("Application Lauched successfully | ");
		byte[] searchitem1 = Base64.encodeBase64("Hello".getBytes());
		System.out.println(new String(searchitem1));
		byte[] searchitem2 = Base64.decodeBase64("SGVsbG8=");
		System.out.println(new String(searchitem2));
	}
	
	@Test(priority = 0, groups = {"high"})
	public static void searchItem() throws InterruptedException   {
		WebElement elementDropDown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		matchDropDownValue(elementDropDown, "Amazon Fashion");
		selectDropDownValue(elementDropDown, "Amazon Fashion");
		
		WebElement elementTextBox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		enterTextValue(elementTextBox,"Toys");
		Thread.sleep(2000);
		WebElement autosuggest = driver.findElement(By.xpath("//span[contains(@class,'a-color-tertiary')][contains(text(),'Baby')]"));
		clickWebElement(autosuggest);
		//Assert.fail();
		
	}
	
public static void listAllAttributes(Element element) {
        
        System.out.println("List attributes for node: " + element.getNodeName());
         
        // get a map containing the attributes of this node
        NamedNodeMap attributes = element.getAttributes();
 
        // get the number of nodes in this map
        int numAttrs = attributes.getLength();

        for (int i = 0; i < numAttrs; i++) {
            Attr attr = (Attr) attributes.item(i);
    

            String attrName = attr.getNodeName();
            String attrValue = attr.getNodeValue();
            System.out.println("Found attribute: " + attrName + " with value: " + attrValue);
        }
}
	public static WebElement expandRootElement(WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
                .executeScript("return arguments[0].parentNode",element);
		//return webelement
		return ele;
	}
	
	@Test(priority = 1, dependsOnMethods = {"searchItem"} )
	public static void clickSearch() throws ParserConfigurationException, FileNotFoundException, SAXException, IOException  {
	WebElement searchButton = driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
	WebElement shadowRoot1 = expandRootElement(searchButton);
	System.out.println(shadowRoot1.getTagName());
	String pageSource = driver.getPageSource();
	//System.out.println(pageSource);
	
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    dbf.setValidating(false);
    dbf.setExpandEntityReferences(false);
    DocumentBuilder db = dbf.newDocumentBuilder();
    //Document doc = db.parse(new FileInputStream(new File("in.xml")));
    Document doc = db.parse(new InputSource( new StringReader(pageSource)));
    
/*    // Write the parsed document to an xml file
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();
    DOMSource source = new DOMSource(doc);

    StreamResult result =  new StreamResult(new File("my-file.xml"));
    transformer.transform(source, result);*/
    
    NodeList entries = doc.getElementsByTagName(shadowRoot1.getTagName());
     
    int num = entries.getLength();
     
    for (int i=0; i<num; i++) {
        Element node = (Element) entries.item(i);
        listAllAttributes(node);
    }
	clickWebElement(searchButton);
	}
	
	@Test(priority = 3, groups = {"high"})
	public static void browserNavigation()  {
		browserNagivation("back");
		browserNagivation("forward");
		browserNagivation("refresh");  //using action class
		Log.info("Page Operations Completed back, forward, refresh");
		
		String browserTitle = getTitle();
		Log.info(browserTitle);
		matchTitle(browserTitle); //using AssertEquals
	}
	
	@Test(priority = 5)
	public static void dragAndDrop() throws InterruptedException  {
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		
		WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
		
		
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDrop(draggable, droppable).perform();
	}
	
	@Test(priority = 6)
	public static void Resizable() throws InterruptedException, ParserConfigurationException, SAXException, IOException  {
	driver.get("http://jqueryui.com/resources/demos/resizable/default.html");
	WebElement resize = driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
	WebElement shadowRoot1 = expandRootElement(resize);
	System.out.println(shadowRoot1.getTagName());
	String pageSource = driver.getPageSource();
	//System.out.println(pageSource);
	
	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    dbf.setValidating(false);
    dbf.setExpandEntityReferences(false);
    DocumentBuilder db = dbf.newDocumentBuilder();
    //Document doc = db.parse(new FileInputStream(new File("in.xml")));
    Document doc = db.parse(new InputSource( new StringReader(pageSource)));
    
/*    // Write the parsed document to an xml file
    TransformerFactory transformerFactory = TransformerFactory.newInstance();
    Transformer transformer = transformerFactory.newTransformer();
    DOMSource source = new DOMSource(doc);

    StreamResult result =  new StreamResult(new File("my-file.xml"));
    transformer.transform(source, result);*/
    
    NodeList entries = doc.getElementsByTagName(shadowRoot1.getTagName());
     
    int num = entries.getLength();
     
    for (int i=0; i<num; i++) {
        Element node = (Element) entries.item(i);
        listAllAttributes(node);
    }
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	action.dragAndDropBy(resize, 400, 200).perform();
	Thread.sleep(3000);
}
	
	@Test(priority = 7)
	public static void Slider() throws InterruptedException  {
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");
		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.dragAndDropBy(slider, 90, 0).perform();
		Thread.sleep(3000);
	}
	
	@AfterSuite
	public static void closeBrowser(){
		getDriver().close();
		getDriver().quit();
		Reporter.log("Application closed successfully | ");
	}
	
	@AfterMethod(alwaysRun = true)
	//take screenshot
	 public static void getscreenshot() throws Exception 
     {
             File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          //The below method will save the screen shot in d drive with name "screenshot.png"
             FileUtils.copyFile(scrFile, new File("C:/Eclipse/AutomationTraining/Training/src/com/seleniumtraining/Screenshots/"+System.currentTimeMillis()+".png"));
     }
	 
	//return WebDriver
	public static WebDriver getDriver(){
		return driver;
	}
	
	
	//Launch Browser
	public static void launchBrowser (String browserName, String url){
	
		switch (browserName) {
		case "FireFox":
			System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\JarFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			driverWait = new WebDriverWait(driver,10);	
			break;
		
		case "IE":
			System.setProperty("webdriver.ie.driver", "C:\\Eclipse\\JarFiles\\IEDriverServer.exe");
       	 	driver=new InternetExplorerDriver();
			try {
				driverWait = new WebDriverWait(driver,10);	
			} catch (Exception e) {
				Log.debug(e.toString());
			}
       	 	break;
		
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\JarFiles\\chromedriver.exe");
       	 	driver=new ChromeDriver();
			try {
				driverWait = new WebDriverWait(driver,10);	
			} catch (Exception e) {
				Log.debug(e.toString());
			}
       	 	break;
		
		default:
			System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\JarFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			try {
				driverWait = new WebDriverWait(driver,10);	
			} catch (Exception e) {
				Log.debug(e.toString());
			}
			break;
		}
		
		//driver.manage().deleteAllCookies()
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	//Browser Navigation
	public static void browserNagivation (String operation){
		
		switch (operation) {
		case "refresh":
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform(); //using Action Class for Page Refresh
			break;
		
		case "forward":
			driver.navigate().forward();
			break;
		
		case "back":
			driver.navigate().back();
			break;
			}
	}
	
	//Get Browser Title
		public static String getTitle(){
			
			return(driver.getTitle());
		}
		
	//Match Browser Title
	public static void matchTitle(String title){
		String browserTitle = driver.getTitle();
		Assert.assertEquals(title, browserTitle);
	}
	//Enter Text in Text Box
		public static void enterTextValue(WebElement wb, String textValue){
			try {
				driverWait.until(ExpectedConditions.visibilityOf(wb));
				wb.clear();
				wb.sendKeys(textValue);
			
			} catch (TimeoutException e) {						//This tells that the execution is failed because the command did not complete in enough time.
				Log.debug(e.toString());
			} catch (NoSuchElementException e) {				//FindBy method cant find the element.
				Log.debug(e.toString());
			} catch (StaleElementReferenceException e) {		//This tells that element is no longer appearing on the DOM page.
				Log.debug(e.toString());
			} catch (ElementNotVisibleException e) {			//Thrown to indicate that although an element is present on the DOM, it is not visible, and so is not able to be interacted with
				Log.debug(e.toString());
			}
		}
	
		//Click Web Element
		public static void clickWebElement(WebElement wb){
			try {
				driverWait.until(ExpectedConditions.visibilityOf(wb));
				
				wb.click();	
			} catch (TimeoutException e) {	
				Assert.assertEquals(true, wb.isDisplayed());
				 Log.debug(e.toString());
				
			} catch (NoSuchElementException e) {				//FindBy method cant find the element.
				Log.debug(e.toString());
			} catch (StaleElementReferenceException e) {		//This tells that element is no longer appearing on the DOM page.
				Log.debug(e.toString());
			} catch (ElementNotVisibleException e) {			//Thrown to indicate that although an element is present on the DOM, it is not visible, and so is not able to be interacted with
				Log.debug(e.toString());
			}
			
		}
		
		
		//Select Value from drop down
		public static void selectDropDownValue(WebElement wb, String textValue){
			try {
				//driverWait.until(ExpectedConditions.textToBePresentInElementValue(wb,textValue));
				Select dropDownElement = new Select(wb);
				dropDownElement.selectByVisibleText(textValue);
				
			} catch (TimeoutException e) {						//This tells that the execution is failed because the command did not complete in enough time.
				Log.debug(e.toString());
			} catch (NoSuchElementException e) {				//FindBy method cant find the element.
				Log.debug(e.toString());
			} catch (StaleElementReferenceException e) {		//This tells that element is no longer appearing on the DOM page.
				Log.debug(e.toString());
			} catch (ElementNotVisibleException e) {			//Thrown to indicate that although an element is present on the DOM, it is not visible, and so is not able to be interacted with
				Log.debug(e.toString());
			} 
			
		}
		
	//Match value with dropdown values
	public static void matchDropDownValue (WebElement wb, String textValue){

		try {
			//driverWait.until(ExpectedConditions.elementToBeClickable(wb));

			Select DropDownElement = new Select(wb);								// Instantiate Select class with the drop-down webelement
			List<WebElement> DropDownList = DropDownElement.getOptions();			// Retrieve all drop-down values and store in actual list
			
			if (!DropDownList.isEmpty()){											//if(DropDownElement.getOptions().size() > 1)
				for (WebElement we: DropDownList) {
					
					if (we.getText().equals(textValue)){
						Assert.assertTrue(true, we.getText() + " is present in the dropdown");
						Log.info("DropDown Value "+we.getText()+" Detected");
					}
				}	
			}
			
			
		} catch (TimeoutException e) {						//This tells that the execution is failed because the command did not complete in enough time.
			Log.debug(e.toString());
		} catch (NoSuchElementException e) {				//FindBy method cant find the element.
			Log.debug(e.toString());
		} catch (StaleElementReferenceException e) {		//This tells that element is no longer appearing on the DOM page.
			Log.debug(e.toString());
		} catch (ElementNotVisibleException e) {			//Thrown to indicate that although an element is present on the DOM, it is not visible, and so is not able to be interacted with
			Log.debug(e.toString());
		} 	
		
	}

}
