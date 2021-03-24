/**
  * A program to show Icecream cone.
  *
  * Activity 9
  * @author Haegang Yang
  * @version 11/04/2019
  *
  */
public class OnlineArticle extends OnlineTextItem 
{
   private int wordCount;
 /**
* 
* @param nameIn name
* @param priceIn price
* 
*/

   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      wordCount = 0;
   }
 /**
* 
* 
* @return word count
*/

   public int setWordCount()
   {
      return wordCount;
   }
}