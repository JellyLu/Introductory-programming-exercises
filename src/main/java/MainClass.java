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

        MainClass.drawARightTriangle();

        MainClass.drawIsoscelesTriangle();
    }

    public static void printOneAsterisk() {
        Draw.printlnOneAsterisk();
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

    public static void drawARightTriangle() {
        ConsoleTool.log("please input number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        Draw.drawARightTriangle(n);
    }

    public static void drawIsoscelesTriangle() {
        ConsoleTool.log("please input number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        Draw.drawIsoscelesTriangle(n);
    }
}


