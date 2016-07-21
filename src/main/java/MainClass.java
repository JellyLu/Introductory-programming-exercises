import sun.applet.Main;
import tools.ConsoleTool;
import tools.Draw;

/**
 * Created by yjlu@thoughtworks.com on 7/21/16.
 */
public class MainClass {
    public static void drawAHorizontialLine() {
        ConsoleTool.log("please input a number: ");
        int n = Integer.parseInt(ConsoleTool.inputFromConsole());
        Draw.drawAHorizontialLine(n);
    }

    public static void main(String args[]) {
       MainClass.drawAHorizontialLine();
    }
}

