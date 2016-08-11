package factory;

import tools.Generator;

import java.util.ArrayList;

/**
 * Created by yjlu@thoughtworks.com on 7/24/16.
 */
public class DrawARightTriangle implements Drawer{
    public String[] generateData(int n) {
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = "";
            for (int j = 0; j <= i; j++) {
                s += "*";
            }
            strings.add(s);
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
