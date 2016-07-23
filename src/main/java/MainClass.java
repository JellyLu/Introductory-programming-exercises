import Factory.*;
import tools.ConsoleTool;
import tools.Generator;

import java.util.ArrayList;

/**
 * Created by yjlu@thoughtworks.com on 7/21/16.
 */

public class MainClass {

    public static void main(String args[]) throws Exception {
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

    public static void printOneAsterisk() throws Exception {
        DrawAHorizontalLine drawer = new DrawAHorizontalLine();
        String[] data = drawer.generateData(1);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawAHorizontialLine() throws Exception {
        int n = ConsoleTool.inputANumber();
        DrawAHorizontalLine drawer = new DrawAHorizontalLine();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawAVerticalLine() throws Exception {
        int n = ConsoleTool.inputANumber();
        DrawAVerticalLine drawer = new DrawAVerticalLine();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawARightTriangle() throws Exception {
        int n = ConsoleTool.inputANumber();
        DrawARightTriangle drawer = new DrawARightTriangle();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawIsoscelesTriangle() throws Exception {
        int n = ConsoleTool.inputANumber();
        DrawAIsoscelesLine drawer = new DrawAIsoscelesLine();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawDiamond() throws Exception {
        int n = ConsoleTool.inputANumber();
        DrawDiamond drawer = new DrawDiamond();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawADiamondWithName() throws Exception {
        int n = ConsoleTool.inputANumber();
        DrawADiamondWithName drawer = new DrawADiamondWithName();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void generatePrimeFactors() {
        ConsoleTool.log("please input number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        ArrayList<Integer> list = new Generator().generatePrimeFactors(n);
        for (int i = 0, len = list.size(); i < len; i++) {
            ConsoleTool.log(String.format("%d ", list.get(i)));
        }
    }

    public static void fizzBuzz() throws Exception {
        int n = ConsoleTool.inputANumber();
        FizzBuzz drawer = new FizzBuzz();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }
}


