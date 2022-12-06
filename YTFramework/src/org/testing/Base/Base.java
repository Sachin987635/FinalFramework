package org.testing.Base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static WebDriver driver;
	public Properties pr;
	@BeforeMethod
	public void init() throws InterruptedException, IOException {
		/*System.setProperty("webdriver.edge.driver", "../YTFramework/msedgedriver.exe");
		*/
		System.setProperty("webdriver.edge.driver","../YTFramework/msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		File f=new File("../YTFramework/Object.properties");
		FileReader fi=new FileReader(f);
		pr=new Properties();
		pr.load(fi);
	}
	@AfterMethod
	public void closebr() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
