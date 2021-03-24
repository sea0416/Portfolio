/**
  * A program to show Icecream cone.
  *
  * Activity 9
  * @author Haegang Yang
  * @version 11/04/2019
  *
  */

public class ElectronicsItem extends InventoryItem 
{

   protected double weight;
      /**
*
* @param SHIPPING_COST a double
*/

   public static final double SHIPPING_COST = 1.5;
   /**
* 
* @param nameIn name
* @param priceIn price
* @param weightIn weight
*/

   public ElectronicsItem(String nameIn, double priceIn,
      double weightIn)
   {
      super(nameIn, priceIn);
      weight = weightIn;
   }
     /**
* 
* @return a double
* 
* 
*/

   public double calculateCost() 
   {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}