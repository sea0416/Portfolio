import java.util.Scanner;   
import java.text.DecimalFormat;
import java.util.Random;
  /**
  * A program displays a formula.
  *
  * Project 3
  * @ author Haegang Yang
  * @ version 09/11/2019
  */

public class TicketDecoder
{
 /**
 * Prints Gallons, Barrels, Quarts, Ounces, and formula.
 * @param args Command line arguments
 */

   public static void main(String[] args)
   {
      System.out.print("Enter your ticket code: ");
      Scanner userInput = new Scanner(System.in);
      String a1 = userInput.nextLine();
      String a = a1.trim(); 
      //String a = Double.toString(code);
      if (a.length() >= 26)
      {
         System.out.println("\nGame: " + a.substring(25) + "   Date: "
            + a.substring(11, 13) + "/" + a.substring(13, 15) + "/" 
            + a.substring(15, 19) + "   Time: " + a.substring(7, 9) 
            + ":" + a.substring(9, 11));
         System.out.println("Section: " + a.substring(19, 21)
            + "   Row: " + a.substring(21, 23) + "   Seat: "
            + a.substring(23, 25));
         String b = a.substring(0, 5);
         String c = a.substring(5, 7); 
         DecimalFormat fmt1 = new DecimalFormat("$#,##0.00");
         DecimalFormat fmt2 = new DecimalFormat("0%");
         DecimalFormat fmt3 = new DecimalFormat("$#,##0.00#");
         double f = Double.parseDouble(b) / 100;
         double g = Double.parseDouble(c) / 100;
         double d = f * (1 - g);
         System.out.println("Price: " + fmt1.format(f) 
            + "   Discount: " + fmt2.format(g) + "   Cost: "
            + fmt3.format(d));
         int e;
         Random randomNum = new Random();
         e = randomNum.nextInt(9999999) + 1;
         System.out.println("Prize Number: " + e);
      }
      else
      {
         System.out.println("\nInvalid Ticket Code.");
         System.out.println("Ticket code must have at least 26 characters.");
      } 
   
   
   }
}