import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
 /**
  * A program to show Wireless Network.
  *
  * Project 10
  * @author Haegang Yang
  * @version 11/18/2019
  */

public class WirelessNetworkList
{
   private WirelessNetwork[] object;
   private String[] invalid;
/**
*
*This is a constructor.
*
*
*/
   public WirelessNetworkList()
   {
      object = new WirelessNetwork[0];
      invalid = new String[0];
   }
   /**
*
*@return an array
*
*
*/
   public WirelessNetwork[] getWirelessNetworksArray()
   {
      return object;
   }
   /**
*
*
*@return an array
*
*/
   public String[] getInvalidRecordsArray()
   {
      return invalid;
   }
   /**
*
*@param myobj to declare the array
*
*
*/
   public void addWirelessNetwork(WirelessNetwork myobj)
   {
      object = Arrays.copyOf(object, object.length + 1);
      object[object.length - 1] = myobj; 
   }
   /**
*
*@param stringobj to declare the array
*
*
*/
   public void addInvalidRecord(String stringobj)
   {
      invalid = Arrays.copyOf(invalid, invalid.length + 1);
      invalid[invalid.length - 1] = stringobj;
   }
   /**
*
*
*@param filename to find file
*@throws FileNotFoundException if there is no file
*/
   public void readFile(String filename)
      throws FileNotFoundException
   {
      Scanner scan = new Scanner(new File(filename));
      
      String line = "";
      while (scan.hasNext())
      {
         try {
            line = scan.nextLine();
            Scanner scan1 = new Scanner(line);
            scan1.useDelimiter(",");
         
            String category = scan1.next();
            String name = scan1.next();
            Double bandwidth = Double.parseDouble(scan1.next());
            WirelessNetwork obj = null;
         
            if (category.equals("W"))
            {
               double cost = Double.parseDouble(scan1.next());
               double modemCost = Double.parseDouble(scan1.next());
               obj = new WiFi(name, bandwidth, cost, modemCost);
            }
            
            else if (category.equals("C"))
            {
               double cost = Double.parseDouble(scan1.next());
               double time = Double.parseDouble(scan1.next());
               double datalim = Double.parseDouble(scan1.next());
               obj = new Cellular(name, bandwidth, cost, time, datalim);
            }
            
            else if (category.equals("L"))
            {
               double cost = Double.parseDouble(scan1.next());
               double time = Double.parseDouble(scan1.next());
               double datalim = Double.parseDouble(scan1.next());
               obj = new LTE(name, bandwidth, cost, time, datalim);
            }
            
            else if (category.equals("F"))
            {
               double cost = Double.parseDouble(scan1.next());
               double time = Double.parseDouble(scan1.next());
               double datalim = Double.parseDouble(scan1.next());
               obj = new FiveG(name, bandwidth, cost, time, datalim);
            } else {
               throw new InvalidCategoryException(category);
            }
         
            this.addWirelessNetwork(obj);
         } catch (InvalidCategoryException a)
         {
            addInvalidRecord(line + "\n" + a);
         }
         catch (NumberFormatException b)
         {
            addInvalidRecord(line + "\n" + b);
         }
         catch (NoSuchElementException c)
         {
            addInvalidRecord(line + "\n" + c + ": For missing input data");
         }
              
      }
      
   
        
      
   
   }
   
   /**
*
*
*@return a String
*
*/

   public String generateReport()
   {
      String report = "-------------------------------\n"
         + "Monthly Wireless Network Report\n"
         + "-------------------------------\n";
      for (WirelessNetwork myobj: object)
      {
         report += myobj.toString() + "\n\n";
      }
      return report;    
   }
   
   /**
*
*
*@return an String
*
*/
   public String generateReportByName()
   {
      String report = "-----------------------------------------\n"
         + "Monthly Wireless Network Report (by Name)\n"
         + "-----------------------------------------\n";
      Arrays.sort(getWirelessNetworksArray());
         
      for (WirelessNetwork myobj: object)
      {
         report += myobj.toString() + "\n\n";
      }
      return report;
   
   }
   /**
*
*
*@return an String
*
*/
   public String generateReportByBandwidth()
   {
      String report = "----------------------------------------------\n"
         + "Monthly Wireless Network Report (by Bandwidth)\n"
         + "----------------------------------------------\n";
      Arrays.sort(getWirelessNetworksArray(), new BandwidthComparator());
         
      for (WirelessNetwork myobj: object)
      {
         report += myobj.toString() + "\n\n";
      }
      return report;
   
   }
    /**
*
*
*@return an String
*
*/
   public String generateReportByMonthlyCost()
   {
      String report = "-------------------------------------------------\n"
         + "Monthly Wireless Network Report (by Monthly Cost)\n"
         + "-------------------------------------------------\n";
      Arrays.sort(getWirelessNetworksArray(), new MonthlyCostComparator());
         
      for (WirelessNetwork myobj: object)
      {
         report += myobj.toString() + "\n\n";
      }
      return report;
   
   }
   /**
*
*
*@return an String
*
*/

   
   public String generateInvalidRecordsReport()
   {
      String report = "----------------------\n"
         + "Invalid Records Report\n"
         + "----------------------\n";
   
      for (String myobj: invalid)
      {
         report +=  myobj + "\n\n";
      }
      return report;
   }

   
   
   
   

   
}
