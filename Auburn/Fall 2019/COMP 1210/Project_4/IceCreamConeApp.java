import java.util.Scanner;
   /**
  * A program to show Icecream cone.
  *
  * Project 4
  * @author Haegang Yang
  * @version 09/18/2019
  */

public class IceCreamConeApp
{


 /**
 * Prints the result based on the formula.
 * @param args Command line arguments
 */

   public static void main(String[] args)
   {
      
      System.out.println("Enter label, radius, and height" 
         + " for an ice cream cone.");
      System.out.print("\tlabel: ");
      Scanner userInput = new Scanner(System.in);
      String label = userInput.nextLine();
      System.out.print("\tradius: ");
      String radius = userInput.nextLine();
      double a3 = Double.parseDouble(radius);
   
      if (a3 <= 0)
      {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }
    
      System.out.print("\theight: ");
   
      String a5 = userInput.nextLine();
      double a6 = Double.parseDouble(a5);
      if (a6 <= 0)
      {
         System.out.println("Error: height must be greater than 0.");
         return;
      }
   
      IceCreamCone myObj = new IceCreamCone(label, a3, a6);
      System.out.println("\n" + myObj);
   }
}
         
         
         
                 
   


