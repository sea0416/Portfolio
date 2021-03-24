import org.junit.Assert;

import org.junit.Test;

 /**
  * A program to show Icecream cone.
  *
  * Project 9
  * @author Haegang Yang
  * @version 11/04/2019
  */

public class LTETest {
 /**
*
*/

   @Test public void monthlyCostTest()
   {
      LTE n3 = new LTE("My iPad", 20.0, 30.00, 600, 2.0);
      Assert.assertEquals(30.00, n3.monthlyCost(), 0.01);
      LTE n4 = new LTE("My Note", 8000.0, 20.00, 1200, 1.0);
      Assert.assertEquals(9612.00, n4.monthlyCost(), 0.01);
   }


}
