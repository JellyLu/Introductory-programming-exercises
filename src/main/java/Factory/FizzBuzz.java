package Factory;

import tools.ConsoleTool;
import tools.Generator;

import java.util.ArrayList;

/**
 * Created by yjlu@thoughtworks.com on 7/24/16.
 */
public class FizzBuzz implements Drawer {
    public String[] generateData(int n) {
        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0 && i%5 == 0) {
                strings.add("FizzBuzz");
            } else if (i%3 == 0) {
                strings.add("Fizz");
            } else if (i%5 == 0) {
                strings.add("Buzz");
            } else {
                strings.add(String.format("%d", i));
            }
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
