package com.sspicejet.UniversalLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataContainer {
static FileInputStream fis;
public  String getDataFromProperty(String key) throws IOException
		{
		
			fis =new FileInputStream("C:\\Users\\Sandy\\Desktop\\DataBucket\\commondata.properties");
			Properties pobj=new Properties();
			pobj.load(fis);
			//String value=pobj.getProperty(key);
			//System.out.println("comeeee"+ pobj.getProperty(key));
			return pobj.getProperty(key);
			
		}

		public  String getDataFromExcel(String SheetName, int RowNum,int cellnum)throws IOException
		{                                  //path for project file:-  "./DataContainer/Lead.xlsx
			fis =new FileInputStream("C:\\Users\\Sandy\\Desktop\\DataBucket\\spicejetdata.xlsx");
			//FileInputStream fis =new FileInputStream("E:\\. SHITAL\\DataForDDT\\TestScriptDataExcel\\Lead.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			
			return book.getSheet(SheetName).getRow(RowNum).getCell(cellnum).getStringCellValue();
		

	}
		public  void updateCellDataInExcel(String SheetName, int RowNum,int cellnum,String newData)throws IOException
		{
		       fis =new FileInputStream("C:\\Users\\Sandy\\Desktop\\DataBucket\\spicejetdata.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			
			Cell cel= book.getSheet(SheetName).getRow(RowNum).getCell(cellnum);//for update @get@
			cel.setCellValue(newData);
			FileOutputStream fos=new FileOutputStream("");
			book.write(fos);
			fos.flush();
		
		}
		public  void addNewCellDataInExcel(String SheetName, int RowNum,int cellnum,String newData)throws IOException
		{
			fis =new FileInputStream("C:\\Users\\Sandy\\Desktop\\DataBucket\\spicejetdata.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			/*Sheet s=book.getSheet(SheetName);
			Row row=s.getRow(RowNum);
			Cell cel=row.getCell(cellnum);*/
			Cell cel= book.createSheet(SheetName).createRow(RowNum).createCell(cellnum);//for new @create@
			cel.setCellValue(newData);
			FileOutputStream fos=new FileOutputStream("");
			book.write(fos);
			fos.flush();
		
		}
		
		
	}



