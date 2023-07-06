package generic_script;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_generic {
public static String getData(String sh, int r, int c)
   {

	  String value=null;
	  
	  try {
	  FileInputStream fis=new FileInputStream("./Project.xlsx");//path is specified
	  Workbook book=WorkbookFactory.create(fis);//workbook is created
	  Sheet sheet=book.createSheet(sh);//created sheet
	  Row row=sheet.createRow(r);//row is created
	  Cell cell=row.createCell(c);	//cell is created
	  	  value=cell.toString();//to store the value in specified cell
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	return value;
	  
	  
	
	
   }

}
