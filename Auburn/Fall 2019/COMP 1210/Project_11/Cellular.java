/**
  * A program to show Icecream cone.
  *
  * Project 9
  * @author Haegang Yang
  * @version 11/04/2019
  */

public class Cellular extends WirelessNetwork
{
   protected double time;
   protected double datalimit;
    /**
*
* @param COST_FACTOR a double
*/

   public static final double COST_FACTOR = 1.0;
   /**
* 
* @param nameIn name
* @param bandwidthIn band width
* @param costIn cost
* @param timeIn time
* @param datalimitIn data limit
*/


   public Cellular(String nameIn, double bandwidthIn, 
       double costIn, double timeIn, double datalimitIn)
   {
   
      super(nameIn, bandwidthIn, costIn);
      time = timeIn;
      datalimit = datalimitIn;
   }
   /**
   *
   * @return time to get time
   */

   public double getTime()
   {
      return time;
   }
   /**
   *
   * @param timeIn time
   */

   public void setTime(double timeIn)
   {
      time = timeIn;
   }
   /**
   *
   * @return datalimit to get data limit
   */

   public double getDataLimit()
   {
      return datalimit;
   }
   /**
   *
   * @param datalimitIn data limit
   */

   public void setDataLimit(double datalimitIn)
   {
      datalimit = datalimitIn;
   }
   /**
   *
   * @return data usage to get 
   */

   public double dataUsage()
   {
      return bandwidth / 8000 * time;
   }
   /**
   *
   * @return monthly fixed cost to compare later
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
            * Cellular.COST_FACTOR;
      }
   }
   /**
   *
   * @return a output
   */

   public String toString()
   {
      return super.toString()
         + "\nTime: " + time + " seconds"
         + "\nData Limit: " + datalimit + " GB"
         + "\nData Used: " + dataUsage() + " GB";
   }
    
}