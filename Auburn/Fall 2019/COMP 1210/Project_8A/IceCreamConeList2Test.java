import org.junit.Assert;
import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

 /**
  * A program to show Icecream cone.
  *
  * Project 8
  * @author Haegang Yang
  * @version 10/31/2019
  */

public class IceCreamConeList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /**
* 
* 
*/

   @Test public void getNameTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 0, 0);
      myObj[1] = new IceCreamCone("Name1", 1, 1);
      myObj[2] = new IceCreamCone("Name2", 2, 2);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      Assert.assertEquals("getListName Test", "Name", obj.getName());
   }
/**
* 
* 
*/

   @Test public void numberOfIceCreamConesTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 0, 0);
      myObj[1] = new IceCreamCone("Name1", 1, 1);
      myObj[2] = new IceCreamCone("Name2", 2, 2);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      Assert.assertEquals("numberOfIceCreamCones Test",
          3, obj.numberOfIceCreamCones());
   }
   /**
* 
* 
*/

   @Test public void totalSurfaceAreaTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      Assert.assertEquals("totalSurfaceArea Test", 
         449905, obj.totalSurfaceArea(), 0.1);
   }
   
    /**
* 
* 
*/

   @Test public void totalvolumeTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      Assert.assertEquals("totalVolume Test", 
         18295116.5, obj.totalVolume(), 0.1);
   }
 /**
* 
* 
*/

   @Test public void averageSurfaceAreaTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      Assert.assertEquals("averageSurfaceArea Test", 
         149968.3, obj.averageSurfaceArea(), 0.1);
   }
/**
* 
* 
*/

   @Test public void averageVolumeTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      Assert.assertEquals("averageVolume Test", 
         6098372.1, obj.averageVolume(), 0.1);
   }
   /**
* 
*
*/

   @Test public void toStringTest() {
      String output = "Ex 1\n\n" + "IceCreamCone \"Ex 1\" with radius = "
         + "1.0 and height = 2.0 units has: \n\tsurface area = " 
         + "13.308 square units\n\tvolume = 4.1887902"
         + " cubic units\n";
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Ex 1", 1.0, 2.0);
               
      IceCreamConeList2 obj = new IceCreamConeList2("Ex 1", myObj, 1);
      
      Assert.assertEquals("toString Test",
                           output, obj.toString());
   }
/**
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      Assert.assertEquals("toString Test", 
         6098372.1, obj.toString());
   }
*/
/**
*
*/
   @Test public void summaryInfoTest() {
      String output = "----- Summary for IceCreamConeList2Test -----\n"
         + "Number of IceCreamCone Objects: 3\n"
         + "Total Surface Area: 449,905.097\n"
         + "Total Volume: 18,295,116.588\n"
         + "Average Surface Area: 149,968.366\n"
         + "Average Volume: 6,098,372.196";
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      IceCreamConeList2 obj = new IceCreamConeList2("IceCreamConeList2Test", 
         myObj, 3);
      Assert.assertEquals("summaryInfo Test",
                           output, obj.summaryInfo());
      
                            
   }

/**
*
* 
*/
   @Test public void getList()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 0, 0);
      myObj[1] = new IceCreamCone("Name1", 1, 1);
      myObj[2] = new IceCreamCone("Name2", 2, 2);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      IceCreamCone[] tA = obj.getList();
      Assert.assertArrayEquals("getListName Test", myObj, tA);
   }
    
  /**
  *
  *@throws IOException IoException
  */                          
   @Test public void readFileTest() throws IOException {
   
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", null, 0);
      IceCreamCone[] tA = obj.getList();
       tB = obj.readFile("IceCreamCone_data_1.txt");   
      Assert.assertArrayEquals("readFile Test",
                           tA, tB);
   }
   /**
   *
   */
   @Test public void addIceCreamCone() {
   
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);         
      IceCreamCone t = new IceCreamCone("Name", 7, 7);
      obj.addIceCreamCone("Name", 7, 7);
      IceCreamCone[] tA = obj.getList();
         
      Assert.assertEquals("addIceCreamCone",
                           t, tA[3]);
   }
   /**
   *
   */
   @Test public void findIceCreamConeTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      IceCreamConeList2 obj = new IceCreamConeList2("Name0", myObj, 3);
      IceCreamCone t = new IceCreamCone("Name0", 1.0, 2.0);
      
      Assert.assertEquals("averageVolume Test", 
         myObj[0], obj.findIceCreamCone("Name0"));
   }
   /**
   *
   */      

   @Test public void deleteIceCreamCone() {
      
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);      
      IceCreamCone t = new IceCreamCone("Name1", 12.3, 25.5);
      IceCreamCone[] tA = obj.getList();
      Assert.assertEquals("pre deleteIceCreamCone Test",
                           t, tA[1]);         
   
      Assert.assertEquals("deleteIceCreamCone true Test",
                           t, obj.deleteIceCreamCone("Name1"));
   
    
   
   }
   /**
   *
   */
   @Test public void editIceCreamConeTest() {
   
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1.0, 2.0);
      myObj[1] = new IceCreamCone("Name1", 12.3, 25.5);
      myObj[2] = new IceCreamCone("Name2", 123.4, 900.0);
      
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      
      IceCreamCone t = new IceCreamCone("Name1", 12.3, 25.5);
            
      Assert.assertTrue("editIceCreamCone true Test",
                          obj.editIceCreamCone("Name1", 4, 5));
      Assert.assertFalse("editIceCreamCone false Test",
                           obj.editIceCreamCone("Name4", 9, 9));
   }
/**
*
*/
   @Test public void findIceCreamConeWithShortestRadiusTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1, 1);
      myObj[1] = new IceCreamCone("Name1", 1.5, 1.5);
      myObj[2] = new IceCreamCone("Name2", 2, 2);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      IceCreamCone t = new IceCreamCone("Name0", 1, 1);
      Assert.assertEquals("findIceCreamConeWithShortestRadius Test", 
         t, obj.findIceCreamConeWithShortestRadius());
   }

/**
*
*/
   @Test public void findIceCreamConeWithLongestRadiusTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1, 1);
      myObj[1] = new IceCreamCone("Name1", 1.5, 1.5);
      myObj[2] = new IceCreamCone("Name2", 2, 2);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      IceCreamCone t = new IceCreamCone("Name2", 2, 2);
      Assert.assertEquals("findIceCreamConeWithLongestRadius Test", 
         t, obj.findIceCreamConeWithLongestRadius());
   }

/**
*
*/
   @Test public void findIceCreamConeWithSmallestVolumeTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1, 1);
      myObj[1] = new IceCreamCone("Name1", 1.5, 1.5);
      myObj[2] = new IceCreamCone("Name2", 2, 2);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      IceCreamCone t = new IceCreamCone("Name0", 1, 1);
      Assert.assertEquals("findIceCreamConeWithSmallestVolume Test", 
         t, obj.findIceCreamConeWithSmallestVolume());
   }


   /**
*
*/
   @Test public void findIceCreamConeWithLargestVolumeTest()
   {
      IceCreamCone[] myObj = new IceCreamCone[100];
      myObj[0] = new IceCreamCone("Name0", 1, 1);
      myObj[1] = new IceCreamCone("Name1", 1.5, 1.5);
      myObj[2] = new IceCreamCone("Name2", 2, 2);
      IceCreamConeList2 obj = new IceCreamConeList2("Name", myObj, 3);
      IceCreamCone t = new IceCreamCone("Name2", 2, 2);
      Assert.assertEquals("findIceCreamConeWithLargestVolume Test", 
         t, obj.findIceCreamConeWithLargestVolume());
   }



   



}
