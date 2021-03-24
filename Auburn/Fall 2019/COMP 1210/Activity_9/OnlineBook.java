/**
  * A program to show Icecream cone.
  *
  * Activity 9
  * @author Haegang Yang
  * @version 11/04/2019
  *
*/
public class OnlineBook extends OnlineTextItem 
{
   protected String author;
  /**
* 
* @param nameIn name
* @param priceIn price
* 
*/

   public OnlineBook(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   
   }
   /**
* 
* 
* @return a String
*/

   public String toString()
   {
      return name + " - " + author + ": $"
         + price; 
   }
   /**
* 
* 
* @param authorIn a String
   */

   public void setAuthor(String authorIn)
   {
      author = authorIn;
   }
}