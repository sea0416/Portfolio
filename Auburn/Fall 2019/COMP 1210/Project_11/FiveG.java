/**
  * A program to show Icecream cone.
  *
  * Project 9
  * @author Haegang Yang
  * @version 11/04/2019
  */

public class FiveG extends Cellular
{
/**
*
* @param COST_FACTOR a double
*/

   public static final double COST_FACTOR = 5.0;
     /**
* 
* @param nameIn name
* @param bandwidthIn band width
* @param costIn cost
* @param timeIn time
* @param datalimitIn data limit
*/


   public FiveG(String nameIn, double bandwidthIn,
       double costIn, double timeIn, double datalimitIn)
   {
      super(nameIn, bandwidthIn, costIn, timeIn, datalimitIn);
   }
   /**
   *
   *@return monthly fixed cost to compare later
   */

   public double monthlyCost()
   {
      if (bandwidth / 8000 * time <= datalimit)
      {
         return monthlyfixedcost;
      }
      else
      {
         return monthlyfixedcost + (bandwidth / 8000 * time - datalimit)
            * FiveG.COST_FACTOR * 3;
      }
   
   }
}
