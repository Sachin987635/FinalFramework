package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class Login {
	WebDriver driver;
	Properties pr;
	public Login(WebDriver driver,Properties pr){
		this.driver=driver;
		this.pr=pr;
	}
	public void signin(String username, String Password) throws InterruptedException {
		WebElement login=driver.findElement(By.xpath(pr.getProperty("SigninBtn")));
		login.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("Username"))).sendKeys("skfirstemail@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(pr.getProperty("Password"))).sendKeys("Test123@");
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(2000);
	}

}
