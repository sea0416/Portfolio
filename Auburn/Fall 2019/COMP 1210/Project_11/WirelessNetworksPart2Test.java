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

public class WirelessNetworksPart2Test {

/**
* test for main method.
*@throws FileNotFoundException WirelessNetworkList
*/
   @Test public void main1()
      throws FileNotFoundException
   {
      WirelessNetworksPart2 myobj = new WirelessNetworksPart2();
      String[] args1 = {}; 
      myobj.main(args1);
      Assert.assertEquals(FiveG.COST_FACTOR, 5, 0);
   }
   /**
   * test for main method.
*@throws FileNotFoundException WirelessNetworkList
*/

   @Test public void main2()
      throws FileNotFoundException
   {
   
      WirelessNetworksPart2 myobj = new WirelessNetworksPart2();
      String[] args2 = {"wireless_network_data1.csv"};
      myobj.main(args2);
      Assert.assertEquals(FiveG.COST_FACTOR, 5.0, 0.0001);

   }
         

   

  
   
}
