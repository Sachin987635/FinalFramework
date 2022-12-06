package org.testing.TestScripts;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testing.Base.Base;
import org.testing.pages.Login;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Test
public class TestAssertions extends Base {
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	System.out.println();
	    	Scanner scan = new Scanner(System.in);
	        int i = scan.nextInt();
	        double db=scan.nextDouble();
	        String s=new String();
	        s = scan.nextLine();  
	        // Write your code here.

	        System.out.println("String: " + s);
	        System.out.println("Double: " + db);
	        System.out.println("Int: " + i);
	     
}
}