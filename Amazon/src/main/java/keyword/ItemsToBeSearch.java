package keyword;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearch extends CommonAPI {

    public static String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        DataReader dr = new DataReader();
        String path = System.getProperty("user.dir") + "C:\\Project\\BugBusters\\Amazon\\data\\keywords.xls";
        String[] data = dr.fileReader2(path, 0);
        return data;
    }
}

