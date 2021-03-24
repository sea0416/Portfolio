import org.junit.Assert;
import org.junit.Test;
/**
  * A program to show Icecream cone.
  *
  * Project 9
  * @author Haegang Yang
  * @version 11/04/2019
  */


public class WiFiTest {
/**
*
*/
   @Test public void setNameTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.setName("My Wifi");
      Assert.assertEquals("My Wifi", n1.getName());
   }
   
   /**
*
*/
   @Test public void setMonthlyFixedCost()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.setMonthlyFixedCost(40.00);
      Assert.assertEquals(40.00, n1.getMonthlyFixedCost(), 0.01);
   }
   
   /**
   *
   */
   @Test public void resetCount()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.resetCount();
      Assert.assertEquals(0, n1.count);
   }
/**
*/
   @Test public void getCount()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      int expected = n1.getCount();
      Assert.assertEquals(expected, n1.getCount(), 0.01);
   }


   /**
*
*/
   @Test public void setBandwidthTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.setBandwidth(450);
      Assert.assertEquals(450, n1.getBandwidth(), 0.01);
   }


/**
*
*/
     
   @Test public void setModemCostTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      n1.setModemCost(5.00);
   
      Assert.assertEquals(5.00, n1.getModemCost(), 0.01);
     
   }
   /**
*
*/

   @Test public void monthlyCostTest()
   {
      WiFi n1 = new WiFi("My Wifi", 450, 40.00, 5.00);
      Assert.assertEquals(45.00, n1.monthlyCost(), 0.01);
   }

}
