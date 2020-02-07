package search;

import base.CommonAPI;
import datasuply.DataSource;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class NetflixSearchPage extends CommonAPI {

    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = DataSource.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
//            typeItemName(list.get(i));
//            clickOnSearch();
//            clearInputBox();
        }
    }

}
