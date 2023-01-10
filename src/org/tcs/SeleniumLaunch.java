package org.tcs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLaunch {
	public static WebDriver driver;
	public static void screenshot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\SIBI\\eclipse-workspace\\Selenium\\screenshot\\"+name+".jpg");
		FileUtils.copyFile(src, des);
	}

	
	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SIBI\\eclipse-workspace\\Selenium\\drivers\\chromedriver v-94.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		screenshot("fblandingPage");
		
		
		
	}
}
