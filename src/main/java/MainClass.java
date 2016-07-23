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
        int n = ConsoleTool.inputANumber("Draw A Horizontial Line");
        DrawAHorizontalLine drawer = new DrawAHorizontalLine();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawAVerticalLine() throws Exception {
        int n = ConsoleTool.inputANumber("Draw A Vertical Line");
        DrawAVerticalLine drawer = new DrawAVerticalLine();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawARightTriangle() throws Exception {
        int n = ConsoleTool.inputANumber("Draw A Right Triangle");
        DrawARightTriangle drawer = new DrawARightTriangle();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawIsoscelesTriangle() throws Exception {
        int n = ConsoleTool.inputANumber("Draw Isosceles Triangle");
        DrawAIsoscelesLine drawer = new DrawAIsoscelesLine();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawDiamond() throws Exception {
        int n = ConsoleTool.inputANumber("Draw Diamond");
        DrawDiamond drawer = new DrawDiamond();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void drawADiamondWithName() throws Exception {
        int n = ConsoleTool.inputANumber("Draw A Diamond With Name");
        DrawADiamondWithName drawer = new DrawADiamondWithName();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }

    public static void generatePrimeFactors() {
        int n = ConsoleTool.inputANumber("Generate Prime Factors");
        ArrayList<Integer> list = new Generator().generatePrimeFactors(n);
        for (int i = 0, len = list.size(); i < len; i++) {
            ConsoleTool.log(String.format("%d ", list.get(i)));
        }

    }

    public static void fizzBuzz() throws Exception {
        int n = ConsoleTool.inputANumber("Fizz Buzz");
        FizzBuzz drawer = new FizzBuzz();
        String[] data = drawer.generateData(n);
        ConsoleTool.log(drawer.formatDataToString(data));
    }
}


