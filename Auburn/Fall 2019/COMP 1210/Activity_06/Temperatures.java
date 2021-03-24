
import java.util.ArrayList;
/**
  * A program to show Icecream cone.
  *
  * Activity 6
  * @author Haegang Yang
  * @version 10/7/2019
  */

public class Temperatures
{
   
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
 /**
* 
* @param temperaturesIn same as temperatures
*/

   public Temperatures(ArrayList<Integer> temperaturesIn)
   {
      temperatures = temperaturesIn;
   }

 /**
* 
* @return an integer
*/

   public int getLowTemp()
   {
   
      if (temperatures.isEmpty())
      {
         return 0;
      }
   
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++)
      {
         if (temperatures.get(i) < low)
         {
            low = temperatures.get(i);
         }
      }
      return low;
   }

 /**
* 
* @return an integer
*/

// if there is error, see this again
   public int getHighTemp()
   {
      if (temperatures.isEmpty())
      {
         return 0;
      }
   
      int high = temperatures.get(0);
      for (Integer temp : temperatures)
      {
         if (temp > high)
         {
            high = temp;
         }
         
      }
      return high;
   }

 /**
* @param lowIn an integer
* @return integer
*/

   public int lowerMinimum(int lowIn)
   {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

/**
* @param highIn an integer
* @return integer
*/

   public int higherMaximum(int highIn)
   {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }

/**
* 
* @return String
*/

   public String toString()
   {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
}