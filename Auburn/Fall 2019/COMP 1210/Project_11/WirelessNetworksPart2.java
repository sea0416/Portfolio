import java.io.FileNotFoundException;
 /**
  * A program to show Wireless Network.
  *
  * Project 10
  * @author Haegang Yang
  * @version 11/18/2019
  */

public class WirelessNetworksPart2
{
/**
*@throws FileNotFoundException WirelessNetworkList
*@param args command arguements
*/
   public static void main(String[] args) throws FileNotFoundException
   {
      
      WirelessNetworkList obj = new WirelessNetworkList();
      
      if (args.length == 0)
      {
         System.out.print("File name expected as command line argument.\n"
            + "Program ending.");
      }
      else
      {
         String filename = args[0];
         obj.readFile(filename);
         System.out.print(obj.generateReport());
         System.out.print(obj.generateReportByName());
         System.out.print(obj.generateReportByBandwidth());
         System.out.print(obj.generateReportByMonthlyCost());
      }
   
   }
}