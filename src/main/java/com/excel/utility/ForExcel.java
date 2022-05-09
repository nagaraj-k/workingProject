package com.excel.utility;

import java.util.ArrayList;

import ExcelUtility.xls_Reader;

public class ForExcel {
	static xls_Reader reader;

	public static ArrayList<Object[]>getdata()
	{
		ArrayList<Object[]> excelData= new ArrayList<Object[]>();
		
		try
		{
		reader=new xls_Reader("C:\\Users\\nagaraj\\eclipse-workspace\\testng\\src\\main\\java\\com\\testdata\\Book1.xlsx");
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		int rowCount=reader.getRowCount("testdata");
		for(int row=2;row<=rowCount;row++)
		{
			String un = reader.getCellData("testdata", "username", row);
			String pw = reader.getCellData("testdata", "password", row);
			
			Object ob[]= {un,pw};
			excelData.add(ob);
		}
		
		return excelData;
	}
}