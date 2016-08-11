package factory;

import tools.Generator;

import java.util.ArrayList;

/**
 * Created by yjlu@thoughtworks.com on 7/24/16.
 */
public class GeneratePrimeFactors implements Drawer {
    public String[] generateData(int n) {
        ArrayList<Integer> list = new Generator().generatePrimeFactors(n);
        String s = "";
        for (int i = 0, len = list.size(); i < len; i++) {
            s += list.get(i);
            if (i != len - 1) {
                s += " ";
            }
        }
        if (s == "") return new String[]{};
        return new String[]{s};
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
