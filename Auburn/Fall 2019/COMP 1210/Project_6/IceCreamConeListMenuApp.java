import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**
  * A program to show Icecream cone.
  *
  * Project 6
  * @author Haegang Yang
  * @version 10/11/2019
  */

public class IceCreamConeListMenuApp
{
/**
*
* @param args command statement
* @throws FileNotFoundException 
IceCreamConeListMenuApp throws if there is no file
*
*/
   public static void main(String[] args)
      throws FileNotFoundException
   {
      Scanner a = new Scanner(System.in);
      String s1;
      double s2, s3;
      
      String listname =  "*** no list name assigned ***";
   
      ArrayList<IceCreamCone> icecreamconearray = new ArrayList<IceCreamCone>();
      
      IceCreamConeList myList = new IceCreamConeList(listname, 
         icecreamconearray);
      System.out.println("IceCreamCone List System Menu\n"
                       + "R - Read File and Create IceCreamCone List\n"
                       + "P - Print IceCreamCone List\n" 
                       + "S - Print Summary\n"
                       + "A - Add IceCreamCone\n"   
                       + "D - Delete IceCreamCone\n"   
                       + "F - Find IceCreamCone\n"
                       + "E - Edit IceCreamCone\n"
                       + "Q - Quit");
   
      String c = "";         
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         String b = a.nextLine();
         if (b.length() == 0) {
            continue;
         }
         c = b.toUpperCase();
         char codeChar = c.charAt(0);
         switch(codeChar) {
            case 'R': 
               System.out.print("\tFile Name: ");
               String fileName = a.nextLine();
            
               myList = myList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "IceCreamCone List created\n");
               break; 
                    
            case 'P': 
               System.out.println(myList);
               break;
               
            case 'S':
               System.out.println("\n\t" + myList.summaryInfo());
               break;
               
            case 'A':
               System.out.print("\tLabel: ");
               s1 = a.nextLine();
               System.out.print("\tRadius: ");
               s2 = Double.parseDouble(a.nextLine());
               System.out.print("\tHeight: ");
               s3 = Double.parseDouble(a.nextLine());               
               myList.addIceCreamCone(s1, s2, s3);
               System.out.println("\t*** IceCreamCone added ***\n");           
               break;
         
            case 'D': 
               System.out.print("\tLabel: ");
               s1 = a.nextLine();
               
               IceCreamCone icone = myList.deleteIceCreamCone(s1);
                  
               if (icone != null) {
                  System.out.println("\t\"" 
                     + icone.getLabel() + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + s1 + "\" not found\n");
               }
               break;
               
            case 'F': 
               System.out.print("\tLabel: ");
               s1 = a.nextLine();
               IceCreamCone d = myList.findIceCreamCone(s1);
               if (d != null)
               {
                  System.out.println(d);
               }
               else
               {
                  System.out.println("\t\"" + s1 + "\" not found\n");  
               }                
               break;   
               
            case 'E':
               System.out.print("\tLabel: ");
               s1 = a.nextLine();
               System.out.print("\tRadius: ");
               s2 = Double.parseDouble(a.nextLine());
               System.out.print("\tHeight: ");
               s3 = Double.parseDouble(a.nextLine());
               if (myList.findIceCreamCone(s1) != null)
               {
                  myList.editIceCreamCone(s1, s2, s3);
                  System.out.println("\t\"" + s1 + "\" successfully edited\n");
               }
               else
               {
                  System.out.println("\t\"" + s1 + "\" not found\n");
               }                
               break;   
                  
            case 'Q':
               break;
               
            default:  // no match, loop again
               System.out.println("\t*** invalid code ***\n");
               break; 
         }
         
      
      } while (!c.equalsIgnoreCase("Q"));   
      
   }

   
}