package config;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
    private static final int LABEL_ROW_SIZE = 1;
    XSSFSheet sheet1;
    XSSFWorkbook wb;

    public ExcelDataConfig(String excelPath) {
        try
        {
            File src=new File(excelPath);
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Object[][] getDataFromExcel() {
        int rows = getRowCount(0) - LABEL_ROW_SIZE;
        int columns = countNonEmptyColumns(0);

        Object[][] arrayObject = new Object[rows][columns];
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns;j++){
                arrayObject[i][j]=getData(0,i+LABEL_ROW_SIZE,j);
            }
        }
        return arrayObject;
    }

    public String getData(int sheetNumber, int row, int column) {
        sheet1 = wb.getSheetAt(sheetNumber);
        String data = sheet1.getRow(row).getCell(column).getStringCellValue();
        return data;
    }

    public int getRowCount(int sheetIndex) {
        int row = wb.getSheetAt(sheetIndex).getLastRowNum();
        row++;
        return row;
    }

    public int countNonEmptyColumns(int sheetIndex) {
        XSSFRow firstRow = wb.getSheetAt(sheetIndex).getRow(0);
        return firstEmptyCellPosition(firstRow);
    }

    public int firstEmptyCellPosition(XSSFRow cells) {
        int columnCount = 0;
        for (Cell cell : cells) {
            if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                break;
            }
            columnCount++;
        }
        return columnCount;
    }
}
