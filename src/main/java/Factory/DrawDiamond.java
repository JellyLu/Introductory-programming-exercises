package Factory;

import tools.Draw;
import tools.Generator;

import java.util.ArrayList;

/**
 * Created by yjlu@thoughtworks.com on 7/24/16.
 */
public class DrawDiamond implements Drawer {
    private String isoscelesLine(int blankCount, int asteriskCount) {
        String s = "";
        for (int i = 0; i < blankCount; i++) {
            s += " ";
        }
        for (int i = 0; i < asteriskCount; i++) {
            s += "*";
        }
        for (int i = 0; i < blankCount; i++) {
            s += " ";
        }
        return s;
    }

    public String[] generateData(int n) {
        ArrayList<String> strings = new ArrayList<String>();
        int len = (n-1)*2 + 1;
        for (int i = 1; i <= len; i += 2) {
            strings.add(isoscelesLine((len - i)/2, i));
        }
        for (int i = len - 2; i >= 1; i -= 2) {
            strings.add(isoscelesLine((len - i)/2, i));
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
