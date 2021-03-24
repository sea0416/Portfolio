import java.io.*;
public class b
{
   public static void main(String[] args)
   {
      String [] a = new String[4];
      a[0] = "a";
      a[1] = "ab";
      a[2] = "abc";
      a[3] = "bcd";
      System.out.print(a[0]);
      for (String c : a)
      {
         System.out.print(c.length( ));
      }
   }
}