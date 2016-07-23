package Factory;

import tools.ConsoleTool;
import tools.Draw;

import java.util.ArrayList;

/**
 * Created by yjlu@thoughtworks.com on 7/23/16.
 */
public class DrawAHorizontalLine implements Drawer{
    public String[] generateData(int n) {
        String string = "";
        for (int i = 0; i < n; i++) {
            string += "*";
        }
        return new String[]{string};
    }

    public String formatDataToString(String[] strings) throws Exception{
        if (strings.length == 0) {
            throw new Exception("strings is empty!");
        }
        return strings[0];
    }
}
