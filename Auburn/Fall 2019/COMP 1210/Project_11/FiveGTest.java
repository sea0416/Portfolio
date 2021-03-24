import org.junit.Assert;

import org.junit.Test;

  /**
  * A program to show Icecream cone.
  *
  * Project 9
  * @author Haegang Yang
  * @version 11/04/2019
  */

public class FiveGTest {

 /**
*
*/

   @Test public void monthlyCostTest()
   {
      FiveG n4 = new FiveG("My Phone", 20.0, 30.00, 600, 2.0);
      Assert.assertEquals(30.00, n4.monthlyCost(), 0.01);
      FiveG n5 = new FiveG("My Phone", 8000.0, 50.00, 1200, 10.0);
      Assert.assertEquals(17900.0, n5.monthlyCost(), 0.01);
   }
}
