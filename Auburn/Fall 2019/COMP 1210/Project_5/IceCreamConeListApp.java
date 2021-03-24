import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
  * A program to show Icecream cone.
  *
  * Project 6
  * @author Haegang Yang
  * @version 10/11/2019
  */

public class IceCreamConeListApp
{
    
   
/**
    * 
	 * Prints odds under and powers of 2 under for each number.
	 *
    * @param args - Standard commandline arguments
    * @throws FileNotFoundException oho
    */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<IceCreamCone> coneList = new ArrayList<IceCreamCone>();
      String label = "";
      double radius = 0;
      double height = 0;
      String listname = "";
      String enter;
      Scanner a = new Scanner(System.in);
      System.out.print("Enter file name: ");
      enter = a.nextLine();
      // read the name of the list from the scanner\
      // do a while loop
      Scanner b = new Scanner(new File(enter));
   
      listname = b.nextLine();
   
      while (b.hasNext())
      {
         
         label = b.nextLine();
         radius = Double.parseDouble(b.nextLine());
         height = Double.parseDouble(b.nextLine());
         IceCreamCone t = new IceCreamCone(label, radius, height);
         coneList.add(t);  
                 
      }
      
      IceCreamConeList myList = new IceCreamConeList(listname, coneList);
      
      System.out.println("\n" + myList);
   
                  
      System.out.println("\n" + myList.summaryInfo());    
      
      
               
      
   
     
   
   }
}