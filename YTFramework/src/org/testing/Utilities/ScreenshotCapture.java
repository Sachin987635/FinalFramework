package org.testing.Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testing.Base.Base;

public class ScreenshotCapture extends Base{
	public static void TakingSS(String Filename) throws IOException {
		File SS=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SS, new File(Filename));
	}
}
