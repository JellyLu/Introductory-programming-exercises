package tools;

/**
 * Created by yjlu@thoughtworks.com on 7/21/16.
 */
public class Draw {

    public static void drawAVerticalLine(int n) {
        if (n < 0) {
            ConsoleTool.printInputInvalidError();
        }
        for (int i = 0; i < n; i++) {
            ConsoleTool.logln("*");
        }
    }
    
}
