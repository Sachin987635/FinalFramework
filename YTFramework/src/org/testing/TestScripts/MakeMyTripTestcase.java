package org.testing.TestScripts;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testing.Utilities.ScreenshotCapture;
import org.testng.annotations.Test;

public class MakeMyTripTestcase {
	@Test
	public void init() throws IOException {
		System.setProperty("webdriver.edge.driver", "../YTFramework/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
	}
}
