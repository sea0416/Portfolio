import java.io.FileNotFoundException;
 /**
  * A program to show Wireless Network.
  *
  * Project 10
  * @author Haegang Yang
  * @version 11/18/2019
  */

public class WirelessNetworksPart3
{
/**
*@throws FileNotFoundException WirelessNetworkList if there is no file
*@param args command arguements
*/
   public static void main(String[] args) 
   {
      
      WirelessNetworkList obj = new WirelessNetworkList();
      
      if (args.length == 0)
      {
         System.out.print("File name expected as command line argument.\n"
            + "Program ending.");
      }
      else
      {
         String filename = "";
         try {
            filename = args[0];
            obj.readFile(filename);
            System.out.print(obj.generateReport());
            System.out.print(obj.generateReportByName());
            System.out.print(obj.generateReportByBandwidth());
            System.out.print(obj.generateReportByMonthlyCost());
            System.out.print(obj.generateInvalidRecordsReport());
         } catch (FileNotFoundException a) 
         {
            System.out.println("*** Attempted to read file: " + filename 
               + " (No such file or directory)");
         
         }
      }
   
   }
}