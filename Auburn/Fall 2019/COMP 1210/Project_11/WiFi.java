/**
  * A program to show Icecream cone.
  *
  * Project 9
  * @author Haegang Yang
  * @version 11/04/2019
  */

public class WiFi extends WirelessNetwork
{
   private double modemCost;
   /**
* 
* @param nameIn name
* @param bandwidthIn band width
* @param costIn cost
* @param modemCostIn modem cost
*
*/


   public WiFi(String nameIn, double bandwidthIn, 
      double costIn, double modemCostIn)
   {
      super(nameIn, bandwidthIn, costIn);
      modemCost = modemCostIn;
   }
   /**
   *
   * @return modemCost to get modem cost
   */

   public double getModemCost()
   {
      return modemCost;
   }
   /**
   *
   * @param modemCostIn modem cost
   */

   public void setModemCost(double modemCostIn)
   {
      modemCost = modemCostIn;
   }
   /**
   *
   * @return monthly cost by adding them
   */

   public double monthlyCost()
   {
      return modemCost + monthlyfixedcost;
   }
   
   
}