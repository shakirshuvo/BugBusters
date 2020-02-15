package keywordDriven;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class KeywordSearchPage extends CommonAPI {

        public static String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
            DataReader dr = new DataReader();
            String path = System.getProperty ("user.dir") + "C:\\Users\\jakii\\Documents\\BugBusters\\HomeDepot\\Excel-File\\fortheproject.xlsx";
            String[] data = dr.fileReader2 (path, 0);
            return data;
        }
    }

