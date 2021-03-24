/**
  * A program to show an Item list.
  *
  * Activity 10
  * @author Haegang Yang
  * @version 10/11/2019
  */

public class InventoryListApp
{
/**
*
*@param args command line argument
*/
   public static void main(String[] args)
   {
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      //What kind of method that I have to put here
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      System.out.println(myItems.toString());
      System.out.println("Total: " + myItems.calculateTotal(2.0));
      
      
      
      
      
   
   
   }
}