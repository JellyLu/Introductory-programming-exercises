import tools.ConsoleTool;
import tools.Draw;

/**
 * Created by yjlu@thoughtworks.com on 7/21/16.
 */
public class MainClass {
    public static void drawAVerticalLine() {
        ConsoleTool.log("please input number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        Draw.drawAVerticalLine(n);
    }

    public static void main(String args[]) {
       MainClass.drawAVerticalLine();
    }
}
