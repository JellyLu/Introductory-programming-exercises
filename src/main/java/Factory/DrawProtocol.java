package Factory;

import java.util.ArrayList;

/**
 * Created by yjlu@thoughtworks.com on 7/23/16.
 */
interface Drawer {
    public String[] generateData(int n);

    public String formatDataToString(String[] strings) throws Exception;
}
