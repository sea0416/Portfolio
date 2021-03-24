public class ItemsList
{
   private InventoryItem[] inventory;
   private int count;

   public ItemsList()
   {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   public void addItem (InventoryItem itemIn)
   {
      inventory [count] = itemIn;
      count++;
   
   }
   
   public double calculateTotal (double electronicsSurcharge)
   {
      double total = 0;
      for (int i = 0; i < count; i++)
      {
      }
      return total;
   }
   
   public String toString()
   {
      String output = "All inventory:\n\n";
      for (int i = 0; i < count; i++)
      {
         output += output + "\n";
      }
      return output;
   }
}