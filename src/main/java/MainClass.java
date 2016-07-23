import sun.applet.Main;
import tools.ConsoleTool;
import tools.Draw;
import tools.Generator;

import java.util.ArrayList;

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

        MainClass.drawDiamond();

        MainClass.drawADiamondWithName();

        MainClass.generatePrimeFactors();

        MainClass.fizzBuzz();
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

    public static void drawDiamond() {
        ConsoleTool.log("please input number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        Draw.drawDiamond(n);
    }

    public static void drawADiamondWithName() {
        ConsoleTool.log("please input number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        Draw.drawADiamondWithName(n);
    }

    public static void generatePrimeFactors() {
        ConsoleTool.log("please input number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        ArrayList<Integer> list = new Generator().generatePrimeFactors(n);
        for (int i = 0, len = list.size(); i < len; i++) {
            ConsoleTool.log(String.format("%d ", list.get(i)));
        }
    }

    public static void fizzBuzz() {
        Draw.fizzBuzz(100);
    }
}


