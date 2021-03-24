import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 /**
  * A program to show Bank Loan.
  *
  * Activity 8
  * @author Haegang Yang
  * @version 10/21/2019
  */


public class IceCreamConeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** A test that always works. 
   */

   @Test public void labelTest() {
      IceCreamCone cone = new IceCreamCone("", 20, 10);
      cone.setLabel("Yang");
      String expectedResult = "Yang";
      String actualResult = cone.getLabel();
      Assert.assertEquals(expectedResult, actualResult);
      cone.setLabel(null);
      expectedResult = "Yang";
      actualResult = cone.getLabel();
      Assert.assertEquals(expectedResult, actualResult);
     
   }
   
    /** A test that always works. 
   */

   @Test public void radiusTest()
   {
      IceCreamCone cone = new IceCreamCone("Yang", 0.0, 2.0);
      cone.setRadius(1.0);
      double expectedResult = 1.0;
      double actualResult = cone.getRadius();
      Assert.assertEquals(expectedResult, actualResult, 0.0001);
      cone.setRadius(0);
      expectedResult = 1.0;
      actualResult = cone.getRadius();
      Assert.assertEquals(expectedResult, actualResult, 0.001);
   
   }
   
    /** A test that always works. 
   */

   @Test public void heightTest()
   {
      IceCreamCone cone = new IceCreamCone("Yang", 1.0, 0.0);
      cone.setHeight(2.0);
      double expectedResult = 2.0;
      double actualResult = cone.getHeight();
      Assert.assertEquals(expectedResult, actualResult, 0.0001);
      cone.setHeight(0);
      expectedResult = 2.0;
      actualResult = cone.getHeight();
      Assert.assertEquals(expectedResult, actualResult, 0.0001);
   
      //Assert.assertTrue()
   }
   
    /** A test that always works. 
   */

   @Test public void surfaceAreaTest()
   {
      IceCreamCone cone = new IceCreamCone("Ex 1", 1.0, 2.0);
      double expectedResult = 13.308;
      double actualResult = cone.surfaceArea();
      Assert.assertEquals(expectedResult, actualResult, 0.1);
   }
   
    /** A test that always works. 
   */

   @Test public void volumeTest()
   {
      IceCreamCone cone = new IceCreamCone("Ex 1", 1.0, 2.0);
      double expectedResult = 4.1887902;
      double actualResult = cone.volume();
      Assert.assertEquals(expectedResult, actualResult, 0.0001);
   }
   
    /** A test that always works. 
   */

   @Test public void toStringTest()
   {
      IceCreamCone cone = new IceCreamCone("Ex 1", 1.0, 2.0);
      String expectedResult = "IceCreamCone \"Ex 1\" with radius = "
         + "1.0 and height = 2.0 units has: \n\tsurface area = " 
         + "13.308 square units\n\tvolume = 4.1887902"
         + " cubic units\n";
      String actualResult = cone.toString();
      Assert.assertEquals(expectedResult, actualResult);
   }
   
    /** A test that always works. 
   */

   @Test public void equalTest()
   {
      IceCreamCone cone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertFalse(cone.equals(6));
      // Compare to an object that is not an IceCreamCone object
      // Compare to an IceCreamCone object 
      //with the same label, same radius, same height
      Assert.assertTrue(cone.equals(new IceCreamCone("Ex 1", 1.0, 2.0)));
      // Compare to an IceCreamCone object with the
      // same label, same radius, different height
      Assert.assertFalse(cone.equals(new IceCreamCone("Ex 1", 1.0, 3.0)));
      // Compare to an IceCreamCone object with the
      // same label, different radius, whatever height
      Assert.assertFalse(cone.equals(new IceCreamCone("Ex 1", 3.0, 2.0)));
      // Compare to an IceCreamCone object with the 
      //different label, whatever radius, whatever height
      Assert.assertFalse(cone.equals(new IceCreamCone("ddd", 1.0, 2.0)));
   }
   
    /** A test that always works. 
   */

   @Test public void countTest()
   {
      IceCreamCone cone = new IceCreamCone("Ex 1", 1.0, 2.0);
      cone.resetCount();
      //String actualResult = cone.toString();
      Assert.assertEquals(cone.getCount(), 0);
   }
   
    /** A test that always works. 
   */

   @Test public void hashCodeTest()
   {
      IceCreamCone cone = new IceCreamCone("Ex 1", 1.0, 2.0);
      Assert.assertEquals(cone.hashCode(), 0);
   }

   
}
