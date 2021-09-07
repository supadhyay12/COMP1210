import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * IcosahedronListApp - uses IcosahedronList and Icosahedron classes.
 * @author: Shanti Upadhyay
 */
public class IcosahedronListApp 
{
/**
 * Reads file with icosahedron data, creates IcosahedronList
 * prints IcosahedronList
 * prints summary of IcosahedronList.
 *
 * @param args - is not used.
 * @throws FileNotFoundException required by Scanner for File
 */
   public static void main(String[] args) throws FileNotFoundException
   {
      ArrayList<Icosahedron> aList1 = new ArrayList<Icosahedron>();
      
      System.out.print("Enter file name: ");
      Scanner userInput = new Scanner(System.in);
      String filename = userInput.nextLine();
      
      Scanner scanFile = new Scanner(new File(filename));
      
      String listName = scanFile.nextLine();

      while (scanFile.hasNext())
      {
         Icosahedron newIcos = new Icosahedron(scanFile.next(), scanFile.next(),
                 Double.parseDouble(scanFile.next()));
         aList1.add(newIcos);
      }
      
      IcosahedronList newIcosList = new IcosahedronList(listName, aList1);
      System.out.println("\n" + newIcosList);
      System.out.println("\n" + newIcosList.summaryInfo());
   }
}