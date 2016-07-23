package tools;

import java.util.Scanner;

/**
 * Created by yjlu@thoughtworks.com on 7/21/16.
 */
public class ConsoleTool {

    public static void logln(String outPutString) {
        System.out.println(outPutString);
    }

    public static void log(String outPutString) {
        System.out.print(outPutString);
    }

    public static String inputFromConsole() {
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }

    public static void printInputInvalidError() {
        System.out.println("Input invalid!");
    }

    public static void logBlank() {
        System.out.print(" ");
    }

    public static int inputANumber(String methodName) {
        ConsoleTool.log( methodName + " - please input number: ");
        return Integer.parseInt(ConsoleTool.inputFromConsole());
    }
}
