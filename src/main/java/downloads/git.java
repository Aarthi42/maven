package downloads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class git {
	public static void main(String[] args) throws IOException {
		File excelloc=new File("C:\\Users\\Rajesh\\eclipse-workspace\\gitdown\\target\\Aarthi.xlsx");
		FileInputStream stream=new FileInputStream(excelloc);
		XSSFWorkbook w=new XSSFWorkbook(stream);
		XSSFSheet s=w.getSheet("Aarthi");
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r=s.getRow(i);
			Cell c=r.getCell(1);
			System.out.println(c);
			
			
			}
		}
		
		
	}
	

