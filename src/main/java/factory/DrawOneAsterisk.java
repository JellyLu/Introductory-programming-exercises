package factory;

/**
 * Created by yjlu@thoughtworks.com on 7/23/16.
 */
public class DrawOneAsterisk implements Drawer {
    public String[] generateData(int n) {
        return new String[]{"*"};
    }

    public String formatDataToString(String[] strings) throws Exception{
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
