/**
  * A program to find evens and odds.
  *
  * Activity 7
  * @author Haegang Yang
  * @version 10/14/2019
  */

public class Scores
{
   private int[] numbers;
   /**
   * This is a constructor.
* @param numbersIn the array of numbers
* 
*/

   public Scores(int[] numbersIn)
   {
      numbers = numbersIn;
   }
/**
* 
* @return a list of evens
*/

   public int[] findEvens()
   {
      int numbersEvens = 0;
   
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {
            numbersEvens++;
         
         }
      }
      int[] evens = new int[numbersEvens];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 0)
         {    
            evens[count] = numbers[i];
            count++;         }
      
      
      
      }
      return evens;
   }
   /**
* 
* @return a list of odds
*/


   public int[] findOdds()
   {
      int numbersOdds = 0;
   
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 1)
         {     
            numbersOdds++;
         
         }
      }
      int[] odds = new int[numbersOdds];
   
      int count = 0;
      for (int i = 0; i < numbers.length; i++)
      {
         if (numbers[i] % 2 == 1)
         {     
            odds[count] = numbers[i];
            count++;         }
      
      
      
      }
      return odds;
   
   }
   /**
* 
* @return an average of numbers
*/


   public double calculateAverage()
   {
      int sum = 0;
   
      for (int i = 0; i < numbers.length; i++)
      {
         sum += numbers[i];
      }
      
   
      return sum / (double) numbers.length;
   }

/**
* 
* @return a list of the numbers
*/

   public String toString()
   {
      String result = "";
      for (int i = 0; i < numbers.length; i++)
      {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
/**
* 
* @return a list of the numbers in reverse
*/

   public String toStringInReverse()
   {
      String result = "";
      for (int i = numbers.length - 1; i >= 0; i--)
      {
         result += numbers[i] + "\t";
      }
   
      return result;
   }
}