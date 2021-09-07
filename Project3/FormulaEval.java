import java.util.Scanner;
import java.text.DecimalFormat;
/** 
 * Course: COMP1210 - Section 011 
 *
 * @author Shanti Upadhyay
 * @version Date Due: Friday, September 14
 */
public class FormulaEval
{
  /**
   * Takes user input to evaluate formula given.
   *
   * @param args Command line arguments (not used).
   */
   public static void main(String []args)
   {
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter a value for x: ");
      double xVal = userInput.nextDouble();
      
      // formula
      double result = ((1000 * xVal) + Math.sqrt(Math.abs(3.95 * 
      Math.pow(xVal, 5)) - Math.pow(xVal, 3) + 1) / 
      (1.6 * Math.pow(xVal, 2) + 2.7 * xVal + 3.8));
         
      System.out.println("Result: " + result);
      
      // converts from double to String 
      String resultShort = Double.toString(result);
      
      // finds index of decimal
      int dotIndex = resultShort.indexOf(".");
      
      // converts length of resultShort to an int for printing right side
      int length = resultShort.length();
      
      // Left side of decimal point
      System.out.println("# of characters to the left of decimal point: "
          + dotIndex);
          
      // right side of decimal point
      System.out.println("# of characters to the right of decimal point: "
         + (length - 1 - dotIndex));
         
      // prints formatted result
      DecimalFormat endResult = new DecimalFormat("#,##0.0####");
      System.out.println("Formatted Result: " + endResult.format(result));
      
      
      
      
      
      
      
      
      
      
   }
}