package tools;

/**
 * Created by yjlu@thoughtworks.com on 7/21/16.
 */
public class Draw {
    public static void printlnOneAsterisk() {
        ConsoleTool.logln("*");
    }

    public static void printOneAsterisk() {
        ConsoleTool.log("*");
    }

    public static void drawAHorizontialLine(int n) {
        if (n < 0) {
            ConsoleTool.printInputInvalidError();
            return;
        }
        for (int i = 0; i < n; i++) {
            Draw.printOneAsterisk();
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

    public static void drawARightTriangle(int n) {
        if (n < 0) {
            ConsoleTool.printInputInvalidError();
        }
        for (int i = 1; i <= n; i++) {
            Draw.drawAHorizontialLine(i);
        }
    }

    private static void drawAIsoscelesLine(int blankCount, int asteriskCount) {
        for (int i = 0; i < blankCount; i++) {
            ConsoleTool.logBlank();
        }
        for (int i = 0; i < asteriskCount; i++) {
            Draw.printOneAsterisk();
        }
        for (int i = 0; i < blankCount; i++) {
            ConsoleTool.logBlank();
        }
       ConsoleTool.logln("");
    }

    public static void drawIsoscelesTriangle(int n) {
        int len = (n-1)*2 + 1;
        for (int i = 1; i <= len; i += 2 ) {
            Draw.drawAIsoscelesLine((len - i)/2, i);
        }
    }
}

