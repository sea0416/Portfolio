import java.util.Comparator;
 /**
  * A program to show Wireless Network.
  *
  * Project 10
  * @author Haegang Yang
  * @version 11/18/2019
  */
public class BandwidthComparator implements Comparator<WirelessNetwork>
{
/**
*
*@param n1 WirelessNetwork variable for compare and sorting
*@param n2 WirelessNetwork variable for compare and sorting
*@return integer to compare and sorting 
*/
   public int compare(WirelessNetwork n1, WirelessNetwork n2) {
      if (n1.getBandwidth() < n2.getBandwidth()) {
         return -1;
      }
      else if (n1.getBandwidth() > n2.getBandwidth()) {
         return 1;
      }
      else {
         return 0;
      }
   }

}