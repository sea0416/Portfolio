import java.util.Comparator;
 /**
  * A program to show Wireless Network.
  *
  * Project 10
  * @author Haegang Yang
  * @version 11/18/2019
  */
public class MonthlyCostComparator implements Comparator<WirelessNetwork>
{
/**
*
*@param n1 Wireless Network variable for compare and sorting
*@param n2 Wireless Network variable for compare and sorting
*@return integer for comparing and order
*/
   public int compare(WirelessNetwork n1, WirelessNetwork n2) {
      if (n1.monthlyCost() < n2.monthlyCost()) {
         return 1;
      }
      else if (n1.monthlyCost() > n2.monthlyCost()) {
         return -1;
      }
      else {
         return 0;
      }
   }

}
