import java.util.Scanner;
/** 
 * Course: COMP1210 - Section 011 
 *
 * @author Shanti Upadhyay
 * @version Date Due: Friday, September 21
 */
public class IcosahedronApp
{
/**
 * Takes user input to fill parts of icosahedron
 *
 * @param args args
 */
   public static void main(String []args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter label, color, and edge length "
         + "for an icosahedron.");
      
      // expected output
      System.out.print(" \tlabel: ");
      String label = scan.nextLine();
      
      System.out.print(" \tcolor: ");
      String color = scan.nextLine();
      
      System.out.print(" \tedge: ");
      double edge = Double.parseDouble(scan.nextLine());
      
      if (edge <= 0)
      {
         System.out.println("Error: edge must be greater than 0.");
      }
      else
      {
         Icosahedron makeup = new Icosahedron(label, color, edge);
         System.out.println(" \n " + makeup);
      }
      
      
      
   }
}      