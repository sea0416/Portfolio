import java.util.Scanner;

  /**
  * A program displays someone's name, age, and gender.
  *
  * Activity 2
  * @ author Haegang Yang
  * @ version 09/03/2019
  */
  
public class AgeStatistics 
{
 /**
 * Prints name, age, gender, and .
 * @param args Command line arguments
 */
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      //Prompt the user for their name:
      System.out.print("Enter your name:  ");
      name = userInput.nextLine();
      //Prompt the user for their age:
      System.out.print("Enter your age in years:  ");
      ageInYears = userInput.nextInt();
   
         //Prompt the user for their gender:
      System.out.print("Enter your gender (1 for female and 0 for male):   ");
      gender = userInput.nextInt();
      //convert age:
      System.out.println("\tYour age in minutes is "
         + (int) ageInYears * 525600 + " minutes.");
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      // display max heart rate
      if (gender == 1)
      {
         System.out.println("Your max heart rate is "
            + (double) (209 - 0.7 * ageInYears) + " beats per minute.");
      }
      else 
      {
         System.out.println("Your max heart rate is "
            + (double) (214 - 0.8 * ageInYears) + " beats per minute.");
      }
           
      
   
   }
}