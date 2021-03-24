import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
   
/**
  * A program to show Icecream cone.
  *
  * Project 8
  * @author Haegang Yang
  * @version 10/31/2019
  */

public class IceCreamConeList2
{
   private String icecreamconelist;

   private IceCreamCone[] icecreamcone;
   private int icecreamconeint = 0;
   
  /**
* constructor for objects.
* @param icecreamobStr for object
* @param icecreamconeobj for array
* @param icecreamconeintpar for integer value
*
*/ 
   public IceCreamConeList2(String icecreamobStr, 
      IceCreamCone[] icecreamconeobj, int icecreamconeintpar)
   {
      icecreamconelist = icecreamobStr;
      icecreamcone = icecreamconeobj;
      icecreamconeint = icecreamconeintpar;
   }
/**
* 
* @return a name of list
*/
   public String getName()
   {
      return icecreamconelist;
   }
/**
* 
* @return the number of objects
*/
   public int numberOfIceCreamCones()
   {
      return icecreamconeint;
   }
   /**
* 
* @return double total surface area
*/
   public double totalSurfaceArea()
   {
      int index = 0;
      double sum = 0;
      while (index < numberOfIceCreamCones())
      {
         sum += icecreamcone[index].surfaceArea();
         index++;
      }
      return sum;
   }
    /**
* 
* @return double total volume
*/
   public double totalVolume()
   {
      int index = 0;
      double sum = 0;
      while (index < numberOfIceCreamCones())
      {
         sum += icecreamcone[index].volume();
         index++;
      }
      return sum;
   }
    /**
* 
* @return double average
*/
   public double averageSurfaceArea()
   {
      int index = 0;
      double average = 0;
      double sum = 0;
      while (index < numberOfIceCreamCones())
      {
         sum += icecreamcone[index].surfaceArea();
         average = sum / numberOfIceCreamCones();
         index++;
      }
         
      return average; 
   }
    /**
* 
* @return the number of objects
*/

   public double averageVolume()
   {
      int index = 0;
      double average = 0;
      double sum = 0;
      while (index < numberOfIceCreamCones())
      {
         sum += icecreamcone[index].volume();
         average = sum / numberOfIceCreamCones();
         index++;
      }
         
      return average; 
   }
   /**
* 
* @return String output
   */

   public String toString()
   {
      int index = 0;
      String output = icecreamconelist + "\n";
      while (index < numberOfIceCreamCones())
      {
         output += "\n" + icecreamcone[index].toString();
        
         index++;
      }
      return output;
   }
   /**
* 
* @return the summary
*/
   public String summaryInfo()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " 
         + icecreamconelist + " -----"
         + "\nNumber of IceCreamCone Objects: "
         + numberOfIceCreamCones() + "\nTotal Surface Area: "
         + df.format(totalSurfaceArea()) + "\nTotal Volume: "
         + df.format(totalVolume()) + "\nAverage Surface Area: "
         + df.format(averageSurfaceArea()) + "\nAverage Volume: "
         + df.format(averageVolume());
      return output;
   }
   
   /**
* 
* @return getting the list
*/

   public IceCreamCone[] getList()
   {
      return icecreamcone;
   }
   
   /**
* @param fileName the name of file
* @return reading file
* @throws FileNotFoundException IceCreamConeList throws it if there is no file
*/

   public IceCreamConeList2 readFile(String fileName)
      throws FileNotFoundException
   {
      Scanner b = new Scanner(new File(fileName));
      IceCreamCone[] myList = new IceCreamCone[100];
   
      icecreamconeint = 0;
      String listname = b.nextLine();
      while (b.hasNext())
      {
         
         String label = b.nextLine();
         double radius = Double.parseDouble(b.nextLine());
         double height = Double.parseDouble(b.nextLine());
         IceCreamCone t = new IceCreamCone(label, radius, height);
         myList[icecreamconeint] = t;
         icecreamconeint++;
      }
      IceCreamConeList2 myobj = new IceCreamConeList2(listname, myList, 
         icecreamconeint);
      return myobj;
   }      
/**
* @param label the labelIn
* @param radius radiusIn
* @param height the heightIn
*/

   public void addIceCreamCone(String label, double radius, 
      double height)
   {
      IceCreamCone myObj1 = new IceCreamCone(label, radius, height);
      icecreamcone[icecreamconeint] = myObj1;
      icecreamconeint++;
   }
   
   /**
* @param label the input
* @return the finding of object
* @thrwos IceCreamConeList2 NullPointerException for exception
*/

   public IceCreamCone findIceCreamCone(String label)
   {
      IceCreamCone findItem = null;
      for (int i = 0; i < icecreamconeint; i++) {
         if (icecreamcone[i].getLabel().replaceAll("\\s+", "").equalsIgnoreCase(
            label.replaceAll("\\s+", "")))
         {
            findItem = icecreamcone[i];
            return findItem;
               /*
         for (IceCreamCone icecreamconetmp: icecreamcone)
         {
         String sLabel = icecreamconetmp.getLabel();
         if (sLabel.replaceAll("\\s+", "").equalsIgnoreCase(
            label.replaceAll("\\s+", "")))
         {
            return icecreamconetmp;
         }
         */
         }
      }
      return null;
   }
   
   /**
* @param label the input
* @return the removing of object
*/

   public IceCreamCone deleteIceCreamCone(String label)
   {
      IceCreamCone deleteItem = null;
      for (int i = 0; i < icecreamconeint; i++) {
         if (icecreamcone[i].getLabel().equalsIgnoreCase(label)) {
            deleteItem = icecreamcone[i];
            for (int j = i; j < icecreamconeint - 1; j++) {
               icecreamcone[j] = icecreamcone[j + 1];
            }
            icecreamcone[icecreamconeint - 1] = null; 
            //IceCreamCone myobj = new 
            // overwrite duplicate at end
            icecreamconeint--;
            
            break;
         }
      }
   //I dont know what to return
      return deleteItem;
   }
   
   /**
* @param label the label
* @param radius the radius
* @param height the height
* @return the result of edit
*/

   public boolean editIceCreamCone(String label, double radius, double height)
   {
      IceCreamCone editItem = null;
      
      for (int i = 0; i < icecreamconeint; i++)
      {
      
         if (icecreamcone[i].getLabel().equalsIgnoreCase(label)) {
            editItem = icecreamcone[i];
            editItem.setRadius(radius);
            editItem.setHeight(height);
            return true;
         
         
         }
         /*for (IceCreamCone icecreamconetmp: icecreamcone)
         {
         String sLabel = icecreamconetmp.getLabel();
         String a = sLabel.toLowerCase();
         if (a.equals(label.toLowerCase()))
         {
            icecreamconetmp.setRadius(radius);
            icecreamconetmp.setHeight(height);
            return true;
            */
         
         
         
      }
         
      return false;
         
      
   }
   
   /**
* 
* @return the shortest Radius
*/

   public IceCreamCone findIceCreamConeWithShortestRadius()
   {
      IceCreamCone myObj = null;
      if (icecreamconeint <= 0) {
         return null;
      }
      
      double shortest = icecreamcone[0].getRadius();
      myObj = icecreamcone[0];
      int index = 0;
      while (index < icecreamconeint) {
         if (shortest > icecreamcone[index].getRadius()) {
            shortest = icecreamcone[index].getRadius();
            myObj = icecreamcone[index];
         }
         index++;  
      }   
      
      return myObj;
   
   }
   
    /**
* 
* @return the longest Radius
*/

   public IceCreamCone findIceCreamConeWithLongestRadius() {
      IceCreamCone myObj = null;
      if (icecreamconeint <= 0) {
         return null;
      }
      double longest = icecreamcone[0].getRadius();
      myObj = icecreamcone[0];
      int index = 0;
      while (index < icecreamconeint) {
         if (longest < icecreamcone[index].getRadius()) {
            longest = icecreamcone[index].getRadius();
            myObj = icecreamcone[index];
         }
         index++;  
      }   
      
         
      
      return myObj;
   }

   
    /**
* 
* @return the smallest volume
*/

   public IceCreamCone findIceCreamConeWithSmallestVolume()
   {
      IceCreamCone myObj = null;
      if (icecreamconeint <= 0) {
         return null;
      }
      
      double smallest = icecreamcone[0].volume();
      myObj = icecreamcone[0];
      int index = 0;
      while (index < icecreamconeint) {
         if (smallest > icecreamcone[index].volume()) {
            smallest = icecreamcone[index].volume();
            myObj = icecreamcone[index];
         }
         index++;  
      }   
      
      return myObj;
   
   }
     /**
* 
* @return the largest volume
*/

   public IceCreamCone findIceCreamConeWithLargestVolume() {
      IceCreamCone myObj = null;
      if (icecreamconeint <= 0) {
         return null;
      }
      double largest = icecreamcone[0].volume();
      myObj = icecreamcone[0];
      int index = 0;
      while (index < icecreamconeint) {
         if (largest < icecreamcone[index].volume()) {
            largest = icecreamcone[index].volume();
            myObj = icecreamcone[index];
         }
         index++;  
      }   
      
         
      
      return myObj;
   }


   
}
