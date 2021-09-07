import java.util.Scanner;
/** 
 * Course: COMP1210 - Section 011 
 *
 * @author Shanti Upadhyay
 * @version Date Due: Friday, September 7
 */
public class MidpointOfLineSegment
{
   /**
   * Takes user input to calculate midpoint of 2 endpoints.
   *
   * @param args Command line arguments (not used).
   */
    
   public static void main(String []args)
   {
      Scanner userInput = new Scanner(System.in);
      double x1 = 0;
      double x2 = 0;
      double y1 = 0;
      double y2 = 0;
      double xMid = 0;
      double yMid = 0;
   
   //Prompt user for endpoint 1 coordinates
      System.out.println("Enter the coordinates for endpoint 1:");
      System.out.print("\tx1 = ");
      x1 = userInput.nextDouble();
      System.out.print("\ty1 = ");
      y1 = userInput.nextDouble();
   
   //Prompt user for endpoint 2 coordinates
      System.out.println("Enter the coordinates for endpoint 2:");
      System.out.print("\tx2 = ");
      x2 = userInput.nextDouble();
      System.out.print("\ty2 = ");
      y2 = userInput.nextDouble();
   
   //Calculating Midpoint
      xMid = (x1 + x2) / 2;
      yMid = (y1 + y2) / 2;
      System.out.print("For endpoints (" + x1 + ", " + y1 + ") and (" + x2 +
         ", " + y2 + "), " + "the midpoint is (" + xMid + ", " + yMid + ")");
 
   }
}