import org.junit.Assert;


import org.junit.Test;
/**
  * A program to show Icecream cone.
  *
  * Project 9
  * @author Haegang Yang
  * @version 11/04/2019
  */


public class CellularTest {
/**
*
*/

   @Test public void setTimeTest()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.setTime(1200);
      Assert.assertEquals(1200, n2.getTime(), 0.01);
   }
   /**
*
*/

   @Test public void setDataLimitTest()  
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      n2.setDataLimit(1.0);
      Assert.assertEquals(1.0, n2.getDataLimit(), 0.01);
   }
   /**
*
*/

   @Test public void dataUsage()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
   
      Assert.assertEquals(0.75, n2.dataUsage(), 0.01);
   
   }
   /**
*
*/

   @Test public void monthlyCostTest()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      Assert.assertEquals(20.00, n2.monthlyCost(), 0.01);
      Cellular n3 = new Cellular("My Note", 8000.0, 20.00, 1200, 1.0);
      Assert.assertEquals(1219.00, n3.monthlyCost(), 0.01);
   }
   /**
*
*/

   @Test public void toStringTest()
   {
      Cellular n2 = new Cellular("My Note", 5.0, 20.00, 1200, 1.0);
      String myobj = "My Note (class Cellular) Cost: $20.00"
         + "\nBandwidth: 5.0 Mbps"
         + "\nTime: 1200.0 seconds"
         + "\nData Limit: 1.0 GB"
         + "\nData Used: 0.75 GB";
      Assert.assertEquals(myobj, n2.toString());
   }
}
