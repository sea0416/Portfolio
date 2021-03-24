/**
  * A program to show Wireless Network.
  *
  * Project 11
  * @author Haegang Yang
  * @version 12/02/2019
  */

public class InvalidCategoryException extends Exception
{
/**
* @param categoryIn category for extend
*/
   public InvalidCategoryException(String categoryIn)
   {
      super("For category: " + categoryIn);
   }
}