package keyword;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class SearchByName extends CommonAPI {
    DataReader dr = new DataReader();

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException, IOException {
        String path = System.getProperty("user.dir")+"/Users/marjanaaktar/Develop/BugBusters/Facebook/ExcelFile/Book1.xls";
        String [] data = dr.fileReader2(path,0);
        return data;
    }
}
