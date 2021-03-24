import java.util.Arrays;

/**
* Defines a library of selection methods
* on arrays of ints.
*
* @author   YOUR NAME (YOU@auburn.edu)
* @author   Dean Hendrix (dh@auburn.edu)
* @version  TODAY
*
*/
public final class Selector {

   /**
    * Can't instantiate this class.
    *
    * D O   N O T   C H A N G E   T H I S   C O N S T R U C T O R
    *
    */
   private Selector() { }


   /**
    * Selects the minimum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    */
   public static int min(int[] a) {
      if (a == null || a.length == 0)
      {
         throw new IllegalArgumentException();
      }
      else
      {
         int min = a[0];
         for (int i = 0; i < a.length; i++)
         {
            if (a[i] <= min)
            {
               min = a[i];
               
            }
           
         }
         return min;     
      }
      
   
      
   
   }


   /**
    * Selects the maximum value from the array a. This method
    * throws IllegalArgumentException if a is null or has zero
    * length. The array a is not changed by this method.
    */
   public static int max(int[] a) {
      if (a == null || a.length == 0)
      {
         throw new IllegalArgumentException();
      }
      else
      {
         int max = a[0];
         for (int i = 0; i < a.length; i++)
         {
            if (a[i] >= max)
            { max = a[i];
               
            }
           
         }
         return max;     
      }
      
   
      
   
   }

   


   /**
    * Selects the kth minimum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth minimum value. Note that there is no kth
    * minimum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    */
   public static int kmin(int[] a, int k) {
   
      if (a == null || a.length == 0 || k > a.length || k < 1)
      {
         throw new IllegalArgumentException();
      }
      else
      {
         int[] kmina = Arrays.copyOf(a, a.length);
         Arrays.sort(kmina);
      
         int[] kminb = new int[0];
         kminb = Arrays.copyOf(kminb, 1);
         kminb[0] = kmina[0];
         for (int i = 1; i < a.length; i++)
         {
            if (kmina[i] != kmina[i - 1])
            {
               kminb = Arrays.copyOf(kminb, kminb.length + 1);
               kminb[kminb.length - 1] = kmina[i];
            }
         }
         if (k > kminb.length)
         {
            throw new IllegalArgumentException();
         }
         else
         {
            return kminb[k - 1];
         }
      }
         
      
   
   
      
      
   }
   


   /**
    * Selects the kth maximum value from the array a. This method
    * throws IllegalArgumentException if a is null, has zero length,
    * or if there is no kth maximum value. Note that there is no kth
    * maximum value if k < 1, k > a.length, or if k is larger than
    * the number of distinct values in the array. The array a is not
    * changed by this method.
    */
   public static int kmax(int[] a, int k) {
         
   
      if (a == null || a.length == 0 || k > a.length || k < 1)
      {
         throw new IllegalArgumentException();
      }
      else
      {
         int[] kmaxa =Arrays.copyOf(a, a.length);
         Arrays.sort(kmaxa);
      
         int[] kmaxb = new int[0];
         kmaxb = Arrays.copyOf(kmaxb, 1);
         kmaxb[0] = kmaxa[0];
         for (int i = 1; i < a.length; i++)
         {
            if (kmaxa[i] != kmaxa[i - 1])
            {
               kmaxb = Arrays.copyOf(kmaxb, kmaxb.length + 1);
               kmaxb[kmaxb.length - 1] = kmaxa[i];
            }
         }
         if (k > kmaxb.length)
         {
            throw new IllegalArgumentException();
         }
         else
         {
            return kmaxb[kmaxb.length - k];
         }
      }
      
   
   
     
      
   }



   /**
    * Returns an array containing all the values in a in the
    * range [low..high]; that is, all the values that are greater
    * than or equal to low and less than or equal to high,
    * including duplicate values. The length of the returned array
    * is the same as the number of values in the range [low..high].
    * If there are no qualifying values, this method returns a
    * zero-length array. Note that low and high do not have
    * to be actual values in a. This method throws an
    * IllegalArgumentException if a is null or has zero length.
    * The array a is not changed by this method.
    */
   public static int[] range(int[] a, int low, int high) 
   {
      int[] range = new int[0];
      if (a == null || a.length == 0)
      {
         throw new IllegalArgumentException();
      }
      else
      {
      
         for (int i = 0; i < a.length; i++)
         {
            if ( low <= a[i] && a[i] <= high)
            {
               range = Arrays.copyOf(range, range.length + 1);
               range[range.length - 1] = a[i];      
            }
         }
         return range;
      }
        
      
   }


   /**
    * Returns the smallest value in a that is greater than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    */
   public static int ceiling(int[] a, int key) 
   {
      int[] ceiling = new int[0];
      if (a == null || a.length == 0)
      {
         throw new IllegalArgumentException();
      }
      else
      {
         for (int i = 0; i < a.length; i++)
         {
            if (key <= a[i])
            {
               ceiling = Arrays.copyOf(ceiling, ceiling.length + 1);
               ceiling[ceiling.length - 1] = a[i];      
            }
         
         }
         int min = min(ceiling);
         return min;        
      }
      
      
   }


   /**
    * Returns the largest value in a that is less than or equal to
    * the given key. This method throws an IllegalArgumentException if
    * a is null or has zero length, or if there is no qualifying
    * value. Note that key does not have to be an actual value in a.
    * The array a is not changed by this method.
    */
   public static int floor(int[] a, int key) {
      int[] floor = new int[0];
      if (a == null || a.length == 0)
      {
         throw new IllegalArgumentException();
      }
      else
      {
         for (int i = 0; i < a.length; i++)
         {
            if (key >= a[i])
            {
               floor = Arrays.copyOf(floor, floor.length + 1);
               floor[floor.length - 1] = a[i];      
            }
         
         }
        
         int max = max(floor);
        
        
         return max;
      }
   
    
   }
}
