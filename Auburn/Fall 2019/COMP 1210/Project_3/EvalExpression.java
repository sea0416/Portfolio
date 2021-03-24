import java.util.Scanner;
import java.text.DecimalFormat;
   
  /**
  * A program displays a formula.
  *
  * Project 3
  * @ author Haegang Yang
  * @ version 09/11/2019
  */

public class EvalExpression
{
 /**
 * Prints the result based on the formula.
 * @param args Command line arguments
 */
   public static void main(String[] args)
   {
      System.out.print("Enter a value for x: ");
      Scanner userInput = new Scanner(System.in);
      double x = userInput.nextDouble();
      double result = ((12.4 * Math.pow(x, 6) - 1.2 * Math.pow(x, 3) 
         + Math.sqrt(Math.abs(2.6 * Math.pow(x, 5) - 6.8 * x + 7)))) 
         / (double) (Math.pow(x, 4) + 9);
      System.out.println("Result: " + result);
      // This does change the result to a string.
      // but it will return a string instead of modifying the result.
      // 13.75 a.indexOf(".") -> returns 2. 2 is 
      //the number of chars to the left of decimal point
      // 
      String a = Double.toString(result);  
      System.out.println("# of characters to left of decimal point: "
         + a.indexOf(".")); 
      System.out.println("# of characters to right of decimal point: "
         + (a.length() - a.indexOf(".") - 1));
      double fmtrslt;
      fmtrslt = result;
      DecimalFormat fmt1 = new DecimalFormat("#,##0.0###");  
      System.out.println("Formatted Result: " + fmt1.format(fmtrslt));
      
      
   
   }
}