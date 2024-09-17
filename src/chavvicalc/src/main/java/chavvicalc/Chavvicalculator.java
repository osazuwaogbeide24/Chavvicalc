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

        System.out.println( "Hello World!" );
        printingmenu();
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
