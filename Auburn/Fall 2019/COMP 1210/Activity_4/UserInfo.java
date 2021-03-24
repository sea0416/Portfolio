  /**
  * A program Information.
  *
  * Activity 4
  * @author Haegang Yang
  * @version 09/16/2019
  */

public class UserInfo
{
//Instance variables
//constructor
//methods
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
 /**
 *
 *@param firstNameIn Command line arguments
 *@param lastNameIn Command line arguments
 */
   public UserInfo(String firstNameIn, String lastNameIn)
   {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
     /**
   *
   *@return Command line arguments
   */
   public String toString()
   {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE)
      {
         output += "Offline";
      }
      else
      {
         output += "Online";
      }
      
      return output;
   }
   /**
   *
   *@param locationIn Command line arguments
   */
   public void setLocation(String locationIn)
   {
      location = locationIn;
   }
     /**
   *@param ageIn Command line arguments
   *@return Command line arguments
   */
   public boolean setAge(int ageIn)
   {
      boolean isSet = false;
      if (ageIn > 0)
      {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
    /**
   *
   *@return Command line arguments
   */
   public int getAge() 
   {
      return age;
   }
     /**
   *
   *@return Command line arguments
   */
   public String getLocation()
   {
      return location;
   }
   /**
   * Commandn line arguments.
      */
   public void logOff()
   {
      status = OFFLINE;
   }
    /**
   *
   * Command line arguments.
   */
   public void logOn()
   {
      status = ONLINE;
   }
   


}