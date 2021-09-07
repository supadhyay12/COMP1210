import java.util.Scanner;
/** 
 * Course: COMP1210 - Section 011 
 *
 * @author Shanti Upadhyay
 * @version Date Due: Friday, September 7
 */
public class TimeConverter
{
  /**
   * Takes user input to convert raw numbers into times.
   *
   * @param args Command line arguments (not used).
   */
   public static void main(String []args)
   {
      Scanner userInput = new Scanner(System.in);
      int rawTime = 0;
      
      //Prompts user to enter raw time measurement
      System.out.print("Enter the raw time measurement in seconds: ");
      rawTime = userInput.nextInt();
      if (rawTime < 0)
      {
         System.out.println("Measurement must be non-negative!");
      }
      else 
      {  
      //Time conversion calculations
         int days = rawTime / 86400;
         int hours = (rawTime / 3600) / 60;
         int minutes = (rawTime % 3600) / 60;
         int seconds = rawTime % 60;
            
            
      //Print info
         System.out.println();
         System.out.println("Measurement by combined days, "
            + "hours, minutes, seconds: ");
         System.out.println("\tdays: " + days);
         System.out.println("\thours: " + hours);
         System.out.println("\tminutes: " + minutes);
         System.out.println("\tseconds: " + seconds);
         System.out.println();
         System.out.println(rawTime + " seconds = " + days + " days, " + hours
            + " hours, " + minutes + " minutes, " + seconds + " seconds ");
      } 
   
   
   }
}