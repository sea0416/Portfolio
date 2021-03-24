/**
  * A program to show Icecream cone.
  *
  * Activity 9
  * @author Haegang Yang
  * @version 11/04/2019
  *
*/
public class InventoryApp
{
/**
*@param args command line  
*/
   public static void main(String[] args)
   {
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      item1.setTaxRate(0.05);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
   }
}