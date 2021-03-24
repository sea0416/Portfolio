import org.junit.Assert;
import java.io.FileNotFoundException;
import org.junit.Test;

/**
  * A program to show Wireless Network.
  *
  * Project 10
  * @author Haegang Yang
  * @version 11/18/2019
  */

public class WirelessNetworkListTest {


   


   /** 
   * test for getWirelessNetworksArraytest().
   */
   @Test public void getWirelessNetworksArraytest() {
      WirelessNetworkList obj = new WirelessNetworkList();
      WirelessNetwork[] object = new WirelessNetwork[0];
      Assert.assertArrayEquals(obj.getWirelessNetworksArray(), object);
   }
   
   /**
   * test for getInvalidRecordsArraytest().
   */
   @Test public void getInvalidRecordsArraytest()
   {
      WirelessNetworkList obj = new WirelessNetworkList();
      String[] object = new String[0];
      Assert.assertArrayEquals(obj.getWirelessNetworksArray(), object);
   }
   
   /**
   * test for addWirelessNetworktest().
   */
   @Test public void addWirelessNetworktest()
   {
      WiFi myobj1 = new WiFi("name1", 1.0, 2.0, 3.0);
      WiFi myobj2 = new WiFi("name1", 1.0, 2.0, 3.0);
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.addWirelessNetwork(myobj1);
      obj.addWirelessNetwork(myobj2);
      WirelessNetwork[] object = new WirelessNetwork[2];
      object[0] = myobj1;
      object[1] = myobj2;
      Assert.assertArrayEquals(obj.getWirelessNetworksArray(), object);
   }
   
   /**
   * test for addInvalidRecordtest().
   */
   @Test public void addInvalidRecordtest()
   {
      String invalid1 = "name3";
      String invalid2 = "name4";
      WiFi myobj2 = new WiFi("name1", 1.0, 2.0, 3.0);
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.addInvalidRecord(invalid1);
      obj.addInvalidRecord(invalid2);
      String[] object = new String[2];
      object[0] = invalid1;
      object[1] = invalid2;
      Assert.assertArrayEquals(obj.getInvalidRecordsArray(), object);
   }
   
   /**
   * test for readFiletest().
   *@throws FileNotFoundException WirelessNetworkList
   */
   @Test public void readFiletest()
      throws FileNotFoundException
     
   {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      Assert.assertTrue(obj.getWirelessNetworksArray() != null);
   }
   
   /**
   * test for readFiletest().
   *@throws FileNotFoundException WirelessNetworkList
   */
   @Test public void readFile2test()
      throws FileNotFoundException
     
   {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data2.exceptions.csv");
      Assert.assertTrue(obj.getWirelessNetworksArray().length == 4);
   }
   
   /**
   * test for generateReporttest().
   * @throws FileNotFoundException WirelessNetworkList
   */
   @Test public void generateReporttest() 
      throws FileNotFoundException 
   {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      String object = "-------------------------------\n"
         + "Monthly Wireless Network Report\n"
         + "-------------------------------\n"
         + "My Wifi (class WiFi) Cost: $45.00\n"
         + "Bandwidth: 450.0 Mbps\n\n"
         + "My Note (class Cellular) Cost: $20.00\n"
         + "Bandwidth: 5.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 1.0 GB\n"
         + "Data Used: 0.75 GB\n\n"
         + "My iPad (class LTE) Cost: $38.00\n"
         + "Bandwidth: 20.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 2.0 GB\n"
         + "Data Used: 3.0 GB\n\n"
         + "My Phone (class FiveG) Cost: $80.00\n"
         + "Bandwidth: 80.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 10.0 GB\n"
         + "Data Used: 12.0 GB\n\n";
      Assert.assertEquals(obj.generateReport(), object);
   }
   /**
   * test for generateReportByNametest().
   *@throws FileNotFoundException WirelessNetworkList
   */
   @Test public void generateReportByNametest() 
      throws FileNotFoundException 
   {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      String object = "-----------------------------------------\n"
         + "Monthly Wireless Network Report (by Name)\n"
         + "-----------------------------------------\n"
         + "My iPad (class LTE) Cost: $38.00\n"
         + "Bandwidth: 20.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 2.0 GB\n"
         + "Data Used: 3.0 GB\n\n"
         + "My Note (class Cellular) Cost: $20.00\n"
         + "Bandwidth: 5.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 1.0 GB\n"
         + "Data Used: 0.75 GB\n\n"
         + "My Phone (class FiveG) Cost: $80.00\n"
         + "Bandwidth: 80.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 10.0 GB\n"
         + "Data Used: 12.0 GB\n\n"
         + "My Wifi (class WiFi) Cost: $45.00\n"
         + "Bandwidth: 450.0 Mbps\n\n";
      Assert.assertEquals(obj.generateReportByName(), object);
   }
      
      
      /**
      * test for generateReportByBandwidth().
      *@throws FileNotFoundException WirelessNetworkList
      */
   @Test public void generateReportByBandwidth() 
      throws FileNotFoundException 
   {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      String object = "----------------------------------------------\n"
         + "Monthly Wireless Network Report (by Bandwidth)\n"
         + "----------------------------------------------\n"
         + "My Note (class Cellular) Cost: $20.00\n"
         + "Bandwidth: 5.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 1.0 GB\n"
         + "Data Used: 0.75 GB\n\n"
         + "My iPad (class LTE) Cost: $38.00\n"
         + "Bandwidth: 20.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 2.0 GB\n"
         + "Data Used: 3.0 GB\n\n"
         + "My Phone (class FiveG) Cost: $80.00\n"
         + "Bandwidth: 80.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 10.0 GB\n"
         + "Data Used: 12.0 GB\n\n"
         + "My Wifi (class WiFi) Cost: $45.00\n"
         + "Bandwidth: 450.0 Mbps\n\n";
       
      Assert.assertEquals(obj.generateReportByBandwidth(), object);
   }
   
   /**
   * test for generateReportByMonthlyCost().
      *@throws FileNotFoundException WirelessNetworkList
      */
   @Test public void generateReportByMonthlyCosttest() 
      throws FileNotFoundException 
   {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      String object = "-------------------------------------------------\n"
         + "Monthly Wireless Network Report (by Monthly Cost)\n"
         + "-------------------------------------------------\n"
         + "My Phone (class FiveG) Cost: $80.00\n"
         + "Bandwidth: 80.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 10.0 GB\n"
         + "Data Used: 12.0 GB\n\n"
         + "My Wifi (class WiFi) Cost: $45.00\n"
         + "Bandwidth: 450.0 Mbps\n\n"
         + "My iPad (class LTE) Cost: $38.00\n"
         + "Bandwidth: 20.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 2.0 GB\n"
         + "Data Used: 3.0 GB\n\n"
         + "My Note (class Cellular) Cost: $20.00\n"
         + "Bandwidth: 5.0 Mbps\n"
         + "Time: 1200.0 seconds\n"
         + "Data Limit: 1.0 GB\n"
         + "Data Used: 0.75 GB\n\n";
      Assert.assertEquals(obj.generateReportByMonthlyCost(), object);
   }
   /**
   * test for generateInvalidRecordsReport().
      *@throws FileNotFoundException WirelessNetworkList
      */
   @Test public void generateInvalidRecordsReporttest() 
      throws FileNotFoundException 
   {
      WirelessNetworkList obj = new WirelessNetworkList();
      obj.readFile("wireless_network_data1.csv");
      String object = "----------------------\n"
         + "Invalid Records Report\n"
         + "----------------------\n"
         + "X,Bad Data,0,0,0,0,0,0,0\n"
         + "InvalidCategoryException: For category: X\n\n";
      Assert.assertEquals(obj.generateInvalidRecordsReport(), object);
   }


}
