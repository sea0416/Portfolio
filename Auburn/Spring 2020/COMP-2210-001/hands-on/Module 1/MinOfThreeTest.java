import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MinOfThreeTest {

  
      
   
   @Test public void min1Test() 
   {  
      int expected = 2;
      int actual = MinOfThree.min1(2, 2, 3);
      assertEquals(expected, actual);
   }
   @Test public void min1Test2()
   {
      int expected = 2;
      int actual = MinOfThree.min1(3, 2, 4);
      assertEquals(expected, actual);
   
   } 
   @Test public void min1Test3()
   {
      int expected = 2;
      int actual = MinOfThree.min1(4, 3, 2);
      assertEquals(expected, actual);
   
   } 
   @Test public void min1Test4()
   {
      int expected = 2;
      int actual = MinOfThree.min1(2, 4, 3);
      assertEquals(expected, actual);
   
   
   }

 /*  
 
   @Test public void min1Test2()
   {
      try {
      
         MinOfThree.min1(2, 2, 3);
         Assert.fail("Did not throw IllegalArgumentException.");
      }
      catch (IllegalArgumentException e)
      {
         Assert.assertTrue(true);
      }
      catch (Exception e)
      {
         Assert.fail("Threw it.");
      } 
   }
   */
   
   @Test public void min2Test()
   {
      int expected = 1;
      int actual = MinOfThree.min2(1, 2, 3);
      assertEquals(expected, actual);
   }
}
