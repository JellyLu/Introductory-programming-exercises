import sun.applet.Main;
import tools.ConsoleTool;
import tools.Draw;

/**
 * Created by yjlu@thoughtworks.com on 7/21/16.
 */

public class MainClass {

    public static void main(String args[]) {
        MainClass.printOneAsterisk();

        MainClass.drawAHorizontialLine();

        MainClass.drawAVerticalLine();
    }

    public static void printOneAsterisk() {
        Draw.printOneAsterisk();
    }

    public static void drawAHorizontialLine() {
        ConsoleTool.log("please input a number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        Draw.drawAHorizontialLine(n);
    }

    public static void drawAVerticalLine() {
        ConsoleTool.log("please input number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        Draw.drawAVerticalLine(n);
    }
}


