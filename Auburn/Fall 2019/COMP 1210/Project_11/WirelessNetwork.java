import java.text.DecimalFormat;
 /**
  * A program to show Wireless Network.
  *
  * Project 10
  * @author Haegang Yang
  * @version 11/13/2019
  */

public abstract  class WirelessNetwork implements Comparable<WirelessNetwork>
{
   protected String name;
   protected double bandwidth;
   protected double monthlyfixedcost;
   protected static int count = 0;
   
   /**
* 
* @param nameIn name
* @param bandwidthIn band width
* @param costIn cost
*/


   public WirelessNetwork(String nameIn, double bandwidthIn,
       double costIn)
   {
      name = nameIn;
      bandwidth = bandwidthIn;
      monthlyfixedcost = costIn;
      count++;
   }
   /**
   *
   * @return name to get name
   */
   public String getName()
   {
      return name;
   }
    /**
   *
   * @param nameIn name
   */

   public void setName(String nameIn)
   {
      name = nameIn;
   }
    /**
   *
   * @return bandwidth to get bandwidth
   */

   public double getBandwidth()
   {
      return bandwidth;
   }
    /**
   *
   * @param bandwidthIn band width
   */

   public void setBandwidth(double bandwidthIn)
   {
      bandwidth = bandwidthIn;
   }
    /**
   *
   * @return monthlyfixedcostto get monthly fixed cost
   */

   public double getMonthlyFixedCost()
   {
      return monthlyfixedcost;
   }
    /**
   *
   * @param costIn cost
   */

   public void setMonthlyFixedCost(double costIn)
   {
      monthlyfixedcost = costIn;
   }
    /**
   *
   * @return count to get count
   */

   public static int getCount()
   {
      return count;
   }
    /**
   *
   *  
   */

   
   public static void resetCount()
   {
      count = 0;
   }
   
   
   /**
   * @return an output
   */
   public String toString()
   {
      DecimalFormat fmt1 = new DecimalFormat("#,##0.00");
      String myobj = name + " (" + this.getClass()
         + ") Cost: $"
         + fmt1.format(monthlyCost()) + "\nBandwidth: "
         + bandwidth + " Mbps";
      return myobj;
   } 
   /**
   * @return an abstract with out body to use in another class
   */
   public abstract double monthlyCost();
   
   /**
   * @param classObj another variable to compare with name
   * @return comparison of names
   */
   public int compareTo(WirelessNetwork classObj)
   {
      return this.name.toUpperCase().compareTo(classObj.name.toUpperCase());
      //p.compareTo(o)
   }
   

}

// wirll l = new ..
// l.compareTo(m);