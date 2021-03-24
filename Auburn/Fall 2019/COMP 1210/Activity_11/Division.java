/**
  * A program to show Division.
  *
  * Activity 11
  * @author Haegang Yang
  * @version 11/18/2019
  */

public class Division
{

/**
*@return an int
*@param numerator int
*@param denominator int
*/
   public static int intDivide(int numerator, int denominator)
   {
      try
      {
         return numerator / denominator;
      }
      catch (ArithmeticException e)
      {
         return 0;
      }
   }
   
   /**
*@return an double
*@param numerator int
*@param denominator int
*/
   public static double decimalDivide(int numerator, int denominator)
   {
      if (denominator == 0)
      {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return numerator / (double) denominator;
   }
   
   

}