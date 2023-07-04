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
	  FileInputStream fis=new FileInputStream("./Project.xlsx");
	  Workbook book=WorkbookFactory.create(fis);
	  Sheet sheet=book.createSheet(sh);
	  Row row=sheet.createRow(r);
	  Cell cell=row.createCell(c);	
	  value=cell.toString();
	  }
	  catch(Exception e)
	  {
		  System.out.println(e);
	  }
	return value;
	  
	  
	
	
   }

}
