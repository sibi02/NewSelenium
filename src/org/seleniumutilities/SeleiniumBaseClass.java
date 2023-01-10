  package org.seleniumutilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;


public class SeleiniumBaseClass {
	public static  WebDriver driver;
	
	public static void Seleniumchromelaunch() {
		System.setProperty("webdriver.chrome.driver", "E:\\3.Java_Software\\drivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("Incognito");
		option.addArguments("disable-infobars");
		driver = new ChromeDriver(option);
	}
	
	public static void seleniumFirefoxlaunch() {
		System.setProperty("webdriver.gecko.driver", "E:\\3.Java_Software\\drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	public static void seleniumClick(WebElement reference) {
		reference.click();
	}
	
	public static void seleniumLoadurl(String url) {
		driver.get(url);
	}
	
	public static void seleniumTitle() {
		String s = driver.getTitle();
		System.out.println(s);
	}
	
	public static void seleniumclose() {
		driver.close();
	}
	
	public static void seleniumMax() {
		driver.manage().window().maximize();
	}
	
	public static void seleniumtxtUser(WebElement reference, String user) {
		reference.sendKeys(user);
	}
	
	public static void seleniumTxtpass(String pass) {
		WebElement a = driver.findElement(By.id("pass"));
		a.sendKeys(pass);
	}
	
	public static void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public static void alertDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	public static void alertsndkeys(String keys) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(keys);
	}
	
	public static void alerttxtget() {
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
	}
	
	public static void seleniumJavaSpTxtuser(WebElement reff, String user) {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		String s = "arguments[0].setAttribute('value','sender')";
		js.executeScript(s.replace("sender", user), reff);
	}
	
	public static void seleniumJavaBtn(WebElement reff) {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", reff);
	}
	
	
	public static void seleniumJavaScrollTop(WebElement reff) {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", reff);
	}
	
	public static void seleniumJavaScrollDown(WebElement reff) {
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false);", reff);
	}
	
	public static String retrivedatabase(String querypara) {
		
		
		//1.Load the driver
		Connection con=null;
		String value = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.Connect to database
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
			
			//3.Write a sql query
//			String query = querypara;
			
			//4.prepare the statement 
			PreparedStatement ps = con.prepareStatement(querypara);
			
			//5.execute query
			ResultSet rs = ps.executeQuery(); 
			
			//6.iterate
			
			while (rs.next()) {
				
				 value = rs.getString("first_name");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exceptionw
				e.printStackTrace();
			}
		}
		
		return value;
		
	}
	private final int TIMEOUT_FOR_PAGE_LOAD =5;
	
//	public boolean waitPageLoad() {
//		JavascriptExecutor js = (JavascriptExecutor) this.driver;
//		String pageLoadStatus="";
//		boolean pagewasLoaded = false;
//		long startTime = System.currentTimeMillis();
//		do {
//			try {
//				pageLoadStatus = this.returnDocumentStatus();
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//			if (pageLoadStatus.equals("complete")|| pageLoadStatus.equals("interactive")) {
//				pagewasLoaded = true;
//			}
//		}while (!pageLoaded && !this.isTimeout(statrtTime,TIMEOUT_FOR_PAGE_LOAD));
//		
//		return pageLoaded;
//	}
//	
	public String returnDocumentStatus() {
		JavascriptExecutor js = (JavascriptExecutor)this.driver;
		return (String)js.executeScript("return document.readyState");
	}
	
	public void ConnonActions() { 
		ChromeOptions co = new ChromeOptions();
		co.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, PageLoadStrategy.NONE);
		driver = new ChromeDriver(co);
	}
	
}


