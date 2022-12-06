package org.testing.Utilities;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

@Test
public class ExcelHandling {
	public void ExcelDataBasedUponRowandColumn(int row,int col) throws BiffException, IOException {
		File f=new File("../YTFramework/Jxlpracticefile2.xlsx");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		row=sh.getRows();
		col=sh.getColumns();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				Cell cs=sh.getCell(j,i);
				System.out.println(cs.getContents());
			}
		}
	}
	public void ExcelDataBasedUponRow(int row) {
		
	}
	public void ExcelDataBasedUponRange(int Start,int End) {

	}
}
