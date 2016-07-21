package tools;

/**
 * Created by yjlu@thoughtworks.com on 7/21/16.
 */
public class Draw {
    public static void printOneAsterisk() {
        ConsoleTool.logln("*");
    }

    public static void drawAHorizontialLine(int n) {
        if (n < 0) {
            ConsoleTool.printInputInvalidError();
            return;
        }
        for (int i = 0; i < n; i++) {
            ConsoleTool.log("*");
            if (i == n - 1 ) {
                ConsoleTool.log("\n");
            }
        }
    }

    public static void drawAVerticalLine(int n) {
        if (n < 0) {
            ConsoleTool.printInputInvalidError();
        }
        for (int i = 0; i < n; i++) {
            ConsoleTool.logln("*");
        }
    }
}

