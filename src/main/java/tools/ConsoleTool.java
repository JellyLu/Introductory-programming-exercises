package tools;

import java.util.Scanner;

/**
 * Created by yjlu@thoughtworks.com on 7/21/16.
 */
public class ConsoleTool {

    public static void printOnConsole(String outPutString) {
        System.out.println(outPutString);
    }

    public static String inputFromConsole() {
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }

    public static void printInputInvalidError() {
        System.out.println("Input invalid!");
    }
}
