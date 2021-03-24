public class PracticeOfExam
{
   private Node front;
   private int size;

   public boolean remove(T element)
   {
      Node n = front;
      Node prev = null;
   
      while ((n != null) && (!n.element.equals(element)))
      {
         prev = n;
         n = n.next;
      }
      if (n == null)
         return false;
   
      if (n == front)
         front = front.next;
      
      else
      
         prev.next = n.next;
      size--;
      return true;
   }
}