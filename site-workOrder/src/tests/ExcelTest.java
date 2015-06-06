package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import site.dao.SiteDao;
import site.entity.Site;

public class ExcelTest {

	private static String fileName = "C:\\Users\\Manfalouti\\WO.xls";

	public static void main(String[] args) throws IOException {

		try {
            
            FileInputStream file = new FileInputStream(new File(fileName ));
             
            //Get the workbook instance for XLS file 
            HSSFWorkbook workbook = new HSSFWorkbook(file);
 
            //Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
             
            //Iterate through each rows from first sheet
            Iterator<Row> rowIterator = sheet.iterator();
                        
            while(rowIterator.hasNext()) {
            	
            	//String SqlString = " INSERT INTO `site`(`SiteID`,`Classification`,`Lat`,`Lon`, `Bts`, `Type`,`Filtre`, `Az1`,`Ht1`,`Hs1`,`A1`,`Et1`,`Mt1`, `M1`, `Az2`,`Ht2`,`Hs2`,`A2`,`Et2`,`Mt2`, `M2`, `Az3`,`Ht3`,`Hs3`,`A3`,`Et3`,`Mt3`, `M3`, `Pylone`,`Mast`,`Et1800`,`Feeder900`,`Feeder1800`) VALUES (" ;
            	String SqlString = " INSERT INTO  site( SiteID ,Classification , Lat , Lon , Bts , Type , Filtre ,  Az1 , Ht1 , Hs1 , A1 , Et1 , Mt1 ,  M1 ,  Az2 , Ht2 , Hs2 , A2 , Et2 , Mt2 ,  M2 ,  Az3 , Ht3 , Hs3 , A3 , Et3 , Mt3 ,  M3 ,  Pylone , Mast , Et1800 , Feeder900 , Feeder1800)" + "(" ;            	            	          
            	Row row = rowIterator.next();
                 
                               
                //For each row, iterate through each columns
                Iterator<Cell> cellIterator  =  row.cellIterator();
                while(cellIterator.hasNext()) {
                     
                    Cell cell = cellIterator.next();
                     
                    switch(cell.getCellType()) {
                    
                         case Cell.CELL_TYPE_STRING:
                    	
                    	//SqlString += "'" + cell.getStringCellValue() +"' ,"  ;
                        	 SqlString +=    cell.getStringCellValue() +" ,"  ;
                        break;
                       
                         case Cell.CELL_TYPE_BOOLEAN:            

                        	 //SqlString +=  "'" +cell.getBooleanCellValue() + "' ,";
                        	 SqlString +=   cell.getBooleanCellValue() + " ,";
                        	
                            break;
                        case Cell.CELL_TYPE_NUMERIC:
                        	
                       	    //SqlString +=  "'" +cell.getNumericCellValue() + "' , " ;
                        	SqlString +=    cell.getNumericCellValue() + ", " ;
                       	    
                        	break;
                        case Cell.CELL_TYPE_BLANK:
                        	//SqlString += cell.getNumericCellValue() +"'" + ",";
                       	    SqlString +=  cell.getCellComment() + " ," ; 
                       	    
                        	break;
                       
                    }
                }
                
                SqlString = SqlString.substring(0, SqlString.length() - 2) + ")";
                
                System.out.println(SqlString);
                System.out.println("");
                
                SiteDao s = new SiteDao();
                s.addSite(SqlString);
   
            }
            file.close();
            FileOutputStream out = 
                new FileOutputStream(new File(fileName));
            workbook.write(out);
            out.close();
             
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
