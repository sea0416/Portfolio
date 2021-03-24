public class Test17 {
   public static void main(String[] args) {
      int[] x = {1, 2, 3, 4};
      x = new int[2];
      int[] y = x;
      
      for (int i = 0; i < y.length; i++)
         System.out.print(y[i] + " ");
   }
}