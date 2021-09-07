import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
  *Menu App for Icosahedron.
  *
  *@author Shanti Upadhyay
  *Course: COMP1210 - Section 011
  */
public class IcosahedronListMenuApp 
{
   /**
     *Main method for this class.
     *
     *@param args not used in this class
     *@throws FileNotFoundException FileNotFoundException
     */
   public static void main(String[] args) throws FileNotFoundException 
   {
      Scanner userInput = new Scanner(System.in);
      String aList1Name = "";
      ArrayList<Icosahedron> aList1In = new ArrayList<Icosahedron>();
      IcosahedronList aList1 = new IcosahedronList(aList1Name, aList1In);
      String code = "";
      
      System.out.println("Icosahedron List System Menu" 
            + "\nR - Read File and Create Icosahedron List"
            + "\nP - Print Icosahedron List"
            + "\nS - Print Summary"
            + "\nA - Add Icosahedron"
            + "\nD - Delete Icosahedron"
            + "\nF - Find Icosahedron"
            + "\nE - Edit Icosahedron"
            + "\nQ - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = userInput.nextLine();
         if (code.length() == 0) {
            continue;
         }
         code = code.toUpperCase();
         char choice = code.charAt(0);
         switch (choice) 
         {
            case 'R' :
               System.out.print("\tFile name: ");
               String fileName = new String(userInput.nextLine());
               aList1.readFile(fileName);
               System.out.println("\tFile read in and "
                  + "Icosahedron List created");
               System.out.println();
               break;
            
            case 'P' : 
               System.out.println(aList1.toString()
                  + "\n");
               break;
            
            case 'S' :
               System.out.println("\n" + aList1.summaryInfo() + "\n");
               break;
            
            case 'A' : 
               String labelIn = "";
               String colorIn = "";
               double edgeIn = 0;
               System.out.print("\tLabel: ");
               labelIn = userInput.nextLine();
               System.out.print("\tColor: ");
               colorIn = userInput.nextLine();
               System.out.print("\tEdge: ");
               edgeIn = userInput.nextDouble();
               aList1.addIcosahedron(labelIn, colorIn, edgeIn);
               System.out.println("\t*** Icosahedron added ***");
               System.out.println();
               break;
            
            case 'D' : 
               String label = "";
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               if (aList1.findIcosahedron(label) != null) {
                  aList1.deleteIcosahedron(label);
                  label = label.toUpperCase();
                  char c = label.charAt(0);
                  label = label.substring(1).toLowerCase();
                  label = c + label;
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else 
               {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'F' :
               System.out.print("\tLabel: ");
               String icosNewLabelIn = userInput.nextLine();
               if (aList1.findIcosahedron(icosNewLabelIn) != null) {
                  System.out.println(aList1.findIcosahedron(icosNewLabelIn)
                      + "\n");
               }
               else 
               {
                  System.out.println("\t\"" + icosNewLabelIn + "\" not found"
                     + "\n");
               }
               break;
               
            case 'E' : 
               System.out.print("\tLabel: ");
               String newLabel = new String(userInput.nextLine());
               System.out.print("\tColor: ");
               String newColor = new String(userInput.nextLine());
               System.out.print("\tEdge: ");
               double newEdge = userInput.nextDouble();
               if (aList1.editIcosahedron(newLabel, newColor, newEdge)) 
               {
                  aList1.editIcosahedron(newLabel, newColor, newEdge);
                  System.out.println("\t\"" + newLabel + "\"" 
                     + " successfully edited\n");
                  break;
               }
               else 
               {
                  System.out.println("\t\"" + newLabel + "\" not found\n");
               }
               break;
               
            case 'Q' :
               break;
               
            default :
               System.out.println("\t*** invalid code ***\n");
         }
      } while (!code.equalsIgnoreCase("Q"));
   }

}