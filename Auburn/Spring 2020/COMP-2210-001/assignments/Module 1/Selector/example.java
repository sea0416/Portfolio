public class example
{
   public static <T> int search(T[] a, T target)
   {
      int i = 0;
      while ((i < a.length) && (a[i] != target))
      {
         i++;
      }
      if (i < a.length)
      {
         return i;
      }
      else
      {
         return -1;
      }
   }
}
