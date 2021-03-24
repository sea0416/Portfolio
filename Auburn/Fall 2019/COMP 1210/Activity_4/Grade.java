/**
  * A program to show Icecream cone.
  *
  * Activity 4B
  * @author Haegang Yang
  * @version 09/23/2019
  */

public class Grade
{
   private double exam1, exam2, finalExam;
   private double activityAvg;
   private double quizAvg;
   private double projectAvg;
   private String studentName;
   /**
   */
   public static final int EXAM_1 = 1, EXAM_2 = 2, FINAL = 3;
   private static final double EXAM_WEIGHT = 0.15,
      FINAL_WEIGHT = 0.30, ACT_WEIGHT = 0.05,
      QUIZ_WEIGHT = 0.10, PROJ_WEIGHT = 0.25;
  /**
  *
  * constructor for object.
  *
  * @param studentNameIn for student name
  */

   public Grade(String studentNameIn)
   {
      studentName = studentNameIn;
   }
/**
* 
* @param activityAvgIn for activity
* @param quizAvgIn for quiz
*
*/ 
   public void setLabAverages(double activityAvgIn, double quizAvgIn)
   {
      activityAvg = activityAvgIn;
      quizAvg = quizAvgIn;
   }
/**
* 
* @param projectAvgIn for projectAvg
* 
*
*/ 
   public void setProjectAvg(double projectAvgIn)
   {
      projectAvg = projectAvgIn;
   }
   /**
* 
* @param examType for exam type
* @param examScoreIn for score
*
*/ 

   public void setExamScore(int examType, double examScoreIn)
   {
      if (examType == EXAM_1)
      {
         exam1 = examScoreIn;
      }
      else if (examType == EXAM_2)
      {
         exam2 = examScoreIn;
      }
      else if (examType == FINAL)
      {
         finalExam = examScoreIn;
      }
   }
   /**
* 
* @return some initial score
* 
*
*/ 
   public double calculateGrade()
   {
      double grade = exam1 * EXAM_WEIGHT + exam2 * EXAM_WEIGHT
         + finalExam * FINAL_WEIGHT
         + activityAvg * ACT_WEIGHT
         + quizAvg * QUIZ_WEIGHT
         + projectAvg * PROJ_WEIGHT;
      return grade;
   }
   /**
* 
* @return some String
* 
*
*/ 

   public String toString()
   {
      return "Name: " + studentName + "\n"
         + "Course Grade: " + calculateGrade();
   }
}