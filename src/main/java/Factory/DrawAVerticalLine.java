package Factory;

import tools.Generator;

import java.util.ArrayList;

/**
 * Created by yjlu@thoughtworks.com on 7/23/16.
 */
public class DrawAVerticalLine implements Drawer {
    public String[] generateData(int n) {
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            strings.add("*");
        }

        return Generator.convertArrayListToStringList(strings);
    }

    public String formatDataToString(String[] strings) throws Exception {
        if (strings.length == 0) {
            throw new Exception("strings is empty!");
        }
        String s = "";
        for (int i = 0, len = strings.length; i < len; i++) {
            s +=  strings[i] + "\n";
        }
        return s;
    }
}
