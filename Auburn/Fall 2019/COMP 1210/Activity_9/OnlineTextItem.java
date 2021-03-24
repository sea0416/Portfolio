/**
  * A program to show Icecream cone.
  *
  * Activity 9
  * @author Haegang Yang
  * @version 11/04/2019
  *
  */

public abstract class OnlineTextItem extends InventoryItem 
{
/**
* 
* @param nameIn name
* @param priceIn price
* 
*/

   public OnlineTextItem(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
   }

/**
* 
* 
* @return price weight
*/
   public double calculateCost()
   {
      return price;
   }
   

}