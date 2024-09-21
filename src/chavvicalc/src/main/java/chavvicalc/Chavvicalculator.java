package chavvicalc;
import java.util.Scanner;

public class Chavvicalculator 
{
    private static float intA = 0.0f;
    private static float intB = 0.0f;
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
        String xnc = scan.nextLine();
        try {
            intA = Float.parseFloat(xnc);
        }
        catch(NumberFormatException e){
            System.out.println("ERROR: The value entered is not a floating point number");
  
        }
        break;
        case 'b':
        System.out.printf("Enter a number:\t");
        String strB = scan.nextLine();
        try {
            intB = Float.parseFloat(strB);
        }
        catch(NumberFormatException e){
            System.out.println("ERROR: The value entered is not a floating point number");
  
        }
        break;
      case '+':
        intA += intB;
        break;
      case '-':
        intA -= intB;
        break;
      case '*':
        intA *= intB;
        break;

      case '/':
        if(intB != 0){
            intA /= intB;

        }
        else {
            System.out.println("ERROR: Dividing by zero is invalid");
        }
        break;
      case 'c':
        intA = 0.0f;
        intB = 0.0f;
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
        System.out.printf("A=%.3f\t\tB=%.3f\n", intA,intB);
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
