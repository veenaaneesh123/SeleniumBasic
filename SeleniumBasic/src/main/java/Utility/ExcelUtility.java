package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;

	public static String readIntData(int i,int j)throws IOException
		{
			String value = null ;
			f=new FileInputStream("C:\\Users\\Aneesh\\Documents\\Excelcondition\\Excelcase.xlsx");
			w=new XSSFWorkbook(f);
			s=w.getSheet("Sheet1");
			Row r=s.getRow(i);
			Cell c=r.getCell(j);
			if(c.getCellType()==0)
				{
					int a= (int) c.getNumericCellValue();
					value =  String.valueOf(a);
				}
			if(c.getCellType()==1) 
				{
					value=  c.getStringCellValue();	
				}
			return value;
		}
	
	public static void main(String [] args) throws IOException
		{
			System.out.println(ExcelUtility.readIntData(0, 1));
		}
		
	}


