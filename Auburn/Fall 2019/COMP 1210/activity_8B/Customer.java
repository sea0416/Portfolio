/**
  * A program for Customer.
  *
  * Activity 8B
  * @author Haegang Yang
  * @version 10/28/2019
  */

public class Customer implements Comparable<Customer>  
{
   private String name;
   private String location;
   private double balance;
 /**
* 
* @param nameIn same as name
*/

   public Customer(String nameIn) 
   {
      name = nameIn; // sets name to parameter input
      location = ""; // sets location to empty string
      balance = 0; // sets balance to 0
   }
   /**
* 
* @param locationIn same as name
*/

   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
   /**
* 
* @param city same as name
* @param state same
*/

   public void setLocation(String city, String state)
   {
      location = city + ", " + state;
   }
   /**
* 
* @param amount same as name
* 
*/

   public void changeBalance(double amount)
   {
      balance += amount;
   }
   /**
* 
* @return location same as name
*/

   public String getLocation() 
   {
      return location;
   }
   /**
* 
* @return balance same as name
*/

   public double getBalance()
   {
      return balance;
   }
   /**
* 
* @return good
*/

   public String toString()
   {
      return name + "\n"
         + location + "\n"
         + "$" + balance;
   }
   /**
* 
* @param obj same as name
* @return int
* 
*/

   public int compareTo(Customer obj)
   {
      if (Math.abs(this.balance - obj.getBalance()) < 0.00001)
      {
         return 0;
      }
      else if (this.balance < obj.getBalance())
      {
         return -1;
      }
      else
      {
         return 1;
      }
   }

}

