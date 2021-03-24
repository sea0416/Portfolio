import java.util.Scanner;

  /**
  * A program displays oil based on units.
  *
  * Project 2
  * @ author Haegang Yang
  * @ version 09/04/2019
  */
  
public class OilUnits
{
 /**
 * Prints Gallons, Barrels, Quarts, Ounces, and formula.
 * @param args Command line arguments
 */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      //Print formula
      System.out.print("Enter amount of oil in ounces: ");
      int enter = userInput.nextInt();
      int barrels = enter / 5376;
      int gallons = (enter - barrels * 5376) / 128;
      int quarts = (enter - gallons * 128 - barrels * 5376) / 32;
      int ounces = enter - gallons * 128 - barrels * 5376 - quarts * 32;
      // display the units
      if (enter > 1000000000)
      {
         System.out.println("Amount must not exceed 1,000,000,000.");
      }
      else 
      {
         System.out.println("Oil amount in units: ");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ounces);
         System.out.println(enter + " oz = (" + barrels + " bl * 5376 oz) + ("
            + gallons + " gal * 128 oz) + (" + quarts + " qt * 32 oz) + ("
            + ounces + " oz)");
      }
           
      
   
   }
}