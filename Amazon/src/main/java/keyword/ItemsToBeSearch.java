package keyword;

import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearch {

    DataReader dr = new DataReader();

    public String[] getDataFromExcelFileForFeatureChoice() throws IOException {
        String path = System.getProperty("user.dir")+"C:\\Project\\BugBusters\\Amazon\\data\\SearchItems.xlsx";
        String [] data = dr.fileReader2(path, 0);
        return data;
    }
}
