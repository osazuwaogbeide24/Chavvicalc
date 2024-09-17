package chavvicalc;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Hello world!
 *
 */
public class Chavvicalculator 
{
    private static float A= 0.0f;
    private static float B= 0.0f;
    private static DecimalFormat decf3 = new DecimalFormat("0.000");
    public static void main( String[] args )
    {

        Scanner scan = new Scanner(System.in);
    Character command = '_';

    // loop until user quits
    while (command != 'q') {
      printingmenu();
      command = menuGetCommand(scan);

      executeCommand(scan, command);
    }

    scan.close();
  }
    
  private static Character menuGetCommand(Scanner scan) {
    Character command = '_';

    String rawInput = scan.nextLine();

    if (rawInput.length() > 0) {
      rawInput = rawInput.toLowerCase();
      command = rawInput.charAt(0);
    }

    return command;
  }
  private static Boolean executeCommand(Scanner scan, Character command) {
    Boolean success = true;

    switch (command) {
      case 'q':
        System.out.println("Thank you for using Chavvi Calc");
        break;
      default:
        System.out.println("ERROR: Unknown commmand");
        success = false;
    }

    return success;
  }
    private static void printingmenu() {
        System.out.println("----------------------------------------------\n");
        System.out.println("Chavvi Calc\n");
        System.out.println("----------------------------------------------\n");
        System.out.printf("A=%.3f\t\tB=%.3f\n", A,B);
        System.out.println("----------------------------------------------\n");
        System.out.println("a\tEnter a value for A");
        System.out.println("b\tEnter a value for B");
        System.out.println("+\tAdd");
        System.out.println("-\tSubtarct");
        System.out.println("*\tMultiply");
        System.out.println("/\tDivide");
        System.out.println("c\tClear");
        System.out.println("q\tQuit");
    }
}
