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
    System.out.printf("Enter a command:");
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
      case 'a':
        System.out.printf("Enter a number:\t");
        String xnc =scan.nextLine();
        try {
            A=Float.parseFloat(xnc);
        }
        catch(NumberFormatException e){
            System.out.println("ERROR: The value entered is not a floating point number");
  
        }
        break;
        case 'b':
        System.out.printf("Enter a number:\t");
        String xnA =scan.nextLine();
        try {
            B=Float.parseFloat(xnA);
        }
        catch(NumberFormatException e){
            System.out.println("ERROR: The value entered is not a floating point number");
  
        }
        break;
      case '+':
        A+=B;
        break;
      case '-':
        A-=B;
        break;
      case '*':
        A*=B;
        break;

      case '/':
        if(B!=0){
            A/=B;

        }
        else {
            System.out.println("ERROR: Dividing by zero is invalid");
        }
        break;
      case 'c':
        A=0.0f;
        B=0.0f;
        break;   
      
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
        System.out.println("----------------------------------------------\n");
    }
}
