package org.testing.TestScripts;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Utilities.ScreenshotCapture;
import org.testing.pages.Homepage;
import org.testing.pages.Login;
//Sachindemo40@gmail.com,Sachin123@,testinguser9876355@gmail.com,skfirstemail@gmail.com,Test123@
import org.testng.annotations.*;

public class TC1 extends Base{
	@Test
	public void TrendingClick() throws InterruptedException, IOException {
		//Write Here Login Page
		Login login=new Login(driver,pr);
		login.signin("skfirstemail@gmail.com", "Test123@");
		Homepage home=new Homepage(driver,pr);
		home.Trendingclick();
	}
}
