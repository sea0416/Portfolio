/**
  * A program to show Icecream cone.
  *
  * Activity 9
  * @author Haegang Yang
  * @version 11/04/2019
  */

public class InventoryItem
{
   protected String name;
   protected double price;
   private static double taxRate = 0;

/**
* 
* @param nameIn name
* @param priceIn price
*/

   public InventoryItem(String nameIn, double priceIn)
   {
      name = nameIn;
      price = priceIn;
   }

/**
* 
* @return name String
* 
*/

   public String getName() 
   {
      return name;
   }
/**
* 
* @return calculateCost double
* 
*/

   public double calculateCost() 
   {
      return price * (1 + taxRate);
   }
/**
* 
* @param taxRateIn tax rate
* 
*/

   public static void setTaxRate(double taxRateIn)
   {
      taxRate = taxRateIn;
   }
/**
* 
* @return to string
*/

   public String toString() 
   {
      return name + ": $" +  calculateCost();
   }







}
