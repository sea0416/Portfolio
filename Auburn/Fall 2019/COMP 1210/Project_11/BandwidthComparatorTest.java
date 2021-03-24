 
import org.junit.Assert;


import org.junit.Test;

/**
  * A program to show Wireless Network.
  *
  * Project 10
  * @author Haegang Yang
  * @version 11/18/2019
  */

public class BandwidthComparatorTest {
/**
*test for compare().
*
*/

   @Test public void compare() 
   {
      BandwidthComparator obj = new BandwidthComparator();
      WiFi myobj1 = new WiFi("name1", 1.0, 2.0, 3.0);
      WiFi myobj2 = new WiFi("name2", 2.0, 3.0, 3.0);
      Assert.assertEquals(-1, obj.compare(myobj1, myobj2));
      WiFi myobj3 = new WiFi("name1", 2.0, 2.0, 3.0);
      WiFi myobj4 = new WiFi("name2", 1.0, 3.0, 3.0);
      Assert.assertEquals(1, obj.compare(myobj3, myobj4));
      WiFi myobj5 = new WiFi("name1", 1.0, 2.0, 3.0);
      WiFi myobj6 = new WiFi("name2", 1.0, 3.0, 3.0);
      Assert.assertEquals(0, obj.compare(myobj5, myobj6));
   }
}
