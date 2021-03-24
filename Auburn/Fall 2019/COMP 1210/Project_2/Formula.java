import java.util.Scanner;

  /**
  * A program displays a formula.
  *
  * Project 2
  * @ author Haegang Yang
  * @ version 09/04/2019
  */
  
public class Formula
{
 /**
 * Prints x, y, z, and formula.
 * @param args Command line arguments
 */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      double x = 0;
      double y = 0;
      double z = 0;
      //Print formula
      System.out.println("result = (3x + 10.5) (2y + 7.5) (z + 5.5) / xyz");
      //Prompt x:
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      //Prompt y:
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      //Prompt z:
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      // display the result of formula
      if (x * y * z == 0)
      {
         System.out.println("result = 0.0");
      }
      else 
      {
         System.out.println("result = "
            + (double) (3 * x + 10.5) * (2 * y + 7.5) * (z + 5.5) / x / y / z);
      }
           
      
   
   }
}