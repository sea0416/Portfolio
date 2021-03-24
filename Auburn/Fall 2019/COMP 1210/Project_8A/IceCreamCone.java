import java.text.DecimalFormat; 
  /**
  * A program to show Icecream cone.
  *
  * Project 8
  * @author Haegang Yang
  * @version 10/25/2019
  */

public class IceCreamCone
{

   private String label = "";
   private double radius = 0;
   private double height = 0;
   
   private static int count = 0;
/**
* constructor for objects.
* @param labelIn for label
* @param radiusIn for radius
* @param heightIn for height
*/   
   public IceCreamCone(String labelIn, double radiusIn, double heightIn)
   {
      setRadius(radiusIn);
      setHeight(heightIn);
      setLabel(labelIn);
      count++;
   }
/**
* 
* @return a label
*/   

   public String getLabel()
   {
      return label;
   }
   /**
* @param labelIn for label
* @return Command line arguments
*/   

   public boolean setLabel(String labelIn)
   {
      boolean isSet1 = false;
      if (labelIn != null)
      {
         label = labelIn.trim();
         isSet1 = true;
      }
      return isSet1;
   }
      /**
      * @return Command line argument
      */   

   public double getRadius()
   {
      return radius;
   }
     /** 
     * @param radiusIn for radius
     * @return Command line argument
     */   

   public boolean setRadius(double radiusIn)
   {
      boolean isSet2 = false;
      if (radiusIn > 0)
      {
         radius = radiusIn;
         isSet2 = true;
      }
      return isSet2;
   }
     
     /**
* 
* @return Command line argument
*
*/   
   public double getHeight()
   {
      return height;
   }
   /**
* 
* @param heightIn for height
* @return Command line argument
*
*/   
   public boolean setHeight(double heightIn)
   {
      boolean isSet3 = false;
      if (heightIn > 0)
      {
         height = heightIn;
         isSet3 = true;
      }
      return isSet3;
   }
   /**
* 
* @return Command line argument
*
*/
   public double surfaceArea()
   {
      double surface = Math.PI * radius * Math.sqrt(Math.pow(height, 2) 
         + Math.pow(radius, 2))
         + 2 * Math.PI * Math.pow(radius, 2);
      return surface;
   }
/**
* @return Command line argument
*
*/   
   public double volume()
   {
      double volume = height * Math.PI * Math.pow(radius, 2) / 3
         + 2 * Math.PI * Math.pow(radius, 3) / 3;
      return volume;
   }
      /**
* 
* @return Command line argument
*
*/   
   public String toString()
   {
      DecimalFormat df = new DecimalFormat("#,##0.0######");   
      String output = "IceCreamCone \"" + label 
         + "\" with radius = " + df.format(radius)
         + " and height = " + df.format(height)
         + " units has: \n" + "\tsurface area = " + df.format(surfaceArea())
         +  " square units\n" + "\tvolume = "
         + df.format(volume()) + " cubic units\n";
      return output;
   }
   /**
* 
* @return Command line argument
*
*/   
   public static int getCount()
   {
      return count;
   }
    /**
* 
* 
*
*/   
   public static void resetCount()
   {
      count = 0;
   }   
    /**
* @param obj object
* @return Command line argument
*
*/   
   public boolean equals(Object obj) {
      if (!(obj instanceof IceCreamCone)) {
         return false;
      }
      else {
         IceCreamCone icc = (IceCreamCone) obj;
         return (label.equalsIgnoreCase(icc.getLabel())
            && Math.abs(radius - icc.getRadius()) < .000001
            && Math.abs(height - icc.getHeight()) < .000001);
      }
   }  
    /**
* 
* @return Command line argument
*
*/
   public int hashCode()
   {
      return 0;
   }
}
