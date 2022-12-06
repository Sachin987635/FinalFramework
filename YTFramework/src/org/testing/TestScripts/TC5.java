package org.testing.TestScripts;
//https://www.youtube.com/watch?v=b-XYy_nq2ic
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testing.Base.Base;
import org.testng.annotations.Test;

public class TC5 extends Base{
	@Test
	public void Subscribe() throws InterruptedException {
		driver.findElement(By.xpath(pr.getProperty("SigninBtn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("Username"))).sendKeys("skfirstemail@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(pr.getProperty("Password"))).sendKeys("Test123@");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(pr.getProperty("PlayVideo"))).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("window.scrollBy(0,500)","");
		driver.findElement(By.xpath(pr.getProperty("Subscribe"))).click();
	}
}
