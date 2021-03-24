/**
  * A program to show Icecream cone.
  *
  * Activity 5
  * @author Haegang Yang
  * @version 09/29/2019
  */
public class NumberOperations
{
   private int number;
   /**
   *
   * Cosntructor for object.
   * @param numberIn argument
   */
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   /**
   *
   * 
   * @return argument
   */

   public int getValue()
   {
      return number;
   }
   /**
   *
   * 
   * @return argument
   */
   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   /**
   *
   * 
   * @return argument
   */
   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      } 
      return output;
   }
   /**
   *
   * @param compareNumber for Number
   * @return argument
   */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber)
      {
         return 1;
      }
      else if (number < compareNumber)
      {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
   *
   * 
   * @return argument
   */
   public String toString()
   {
      return number + "";
   }
   
}