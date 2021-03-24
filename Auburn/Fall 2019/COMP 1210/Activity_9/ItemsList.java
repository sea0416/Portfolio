/**
  * A program to show an Item list.
  *
  * Activity 10
  * @author Haegang Yang
  * @version 10/11/2019
  */

public class ItemsList
{
   private InventoryItem[] inventory;
   private int count;
/**
*
*/
   public ItemsList()
   {
      inventory = new InventoryItem[20];
      count = 0;
   }
   /**
   *
   *@param itemIn Inventory Item
   */
   public void addItem(InventoryItem itemIn)
   {
      inventory[count] = itemIn;
      count++; 
   }
   /**
   *
   *@param electronicsSurcharge double
   *@return double
   */
   public double calculateTotal(double electronicsSurcharge)
   {
      double total = 0;
      for (int i = 0; i < count; i++)
      {
         if (inventory[i] instanceof ElectronicsItem)
         {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else
         {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   /**
   *@return String
   */
   public String toString()
   {
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++)
      {
         output += inventory[i] + "\n";
      }
      return output;
   }
}