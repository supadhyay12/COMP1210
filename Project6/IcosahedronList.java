import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Demonstrates how to make an arraylist with Icosahedron.
 * @author: Shanti Upadhyay
 */
public class IcosahedronList
{
   private String listName = "";
   private ArrayList<Icosahedron> aList1 = new ArrayList<Icosahedron>();
   
   /**
    * IcosahedronList constructor.
    * @param listNameIn listNameIn
    * @param aList1In aList1In
    */
   public IcosahedronList(String listNameIn, ArrayList<Icosahedron> aList1In)
   {
      listName = listNameIn;
      aList1 = aList1In;
   }
   
   /**
    * Name accessor(getter).
    * @return listName listName
    */
   public String getName()
   {
      return listName;
   }
   
   /**
    * @return aList1.size
    */
   public int numberOfIcosahedrons()
   {
      return aList1.size();
   }
   
   /**
    * @return totalSA totalSA
    */
   public double totalSurfaceArea()
   {
      double totalSA = 0;
      int surfA = 0;
      while (surfA < aList1.size())
      {
         totalSA += aList1.get(surfA).surfaceArea();
      }
      return totalSA;
   }
   
   /**
    * @return totalVol totalVol
    */
   public double totalVolume()
   {
      double totalVol = 0;
      int vol = 0;
      while (vol < aList1.size())
      {
         totalVol += aList1.get(vol).volume();
         vol++;
      }
      return totalVol;
   }
   
   /**
    * @return avgSA avgSA
    */
   public double averageSurfaceArea()
   {
      double avgSA = 0;
      if (aList1.size() != 0)
      {
         int surfA = 0;
         while (surfA < aList1.size())
         {
            avgSA += aList1.get(surfA).surfaceArea();
            surfA++;
         }
         avgSA = (avgSA / surfA);
      }
      return avgSA;
   }
   
   /**
    * @return averageVol averageVol
    */
   public double averageVolume()
   {
      double avgVol = 0;
      if (aList1.size() != 0)
      {
         int vol = 0;
         while (vol < aList1.size())
         {
            avgVol += aList1.get(vol).volume();
            vol++;
         }
         avgVol = (avgVol / vol);
      }
      return avgVol;
   }
   
   /**
    * @return avgSurfToVol avgSurfToVol
    */
   public double averageSurfaceToVolumeRatio()
   {
      double avgSurfToVol = 0;
      if (aList1.size() != 0 )
      {
         int surfToVol = 0;
         while (surfToVol < aList1.size())
         {
            avgSurfToVol += aList1.get(surfToVol).surfaceToVolumeRatio();
            surfToVol++;
         }
         avgSurfToVol = (avgSurfToVol / surfToVol);
      }
      return avgSurfToVol;
         
   }
   /**
    * toString method.
    * @return output output
    */
   public String toString()
   {
      String output = listName;
      if (aList1.size() != 0)
      {
         int toStr = 0;
         while (toStr < aList1.size())
         {
            output += "\n\n" + aList1.get(toStr);
         }
      }
      return output;
   }
   
   /**
    * @return output output
    */
   public String summaryInfo()
   {
      DecimalFormat format = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----";
      
      output += "\nNumber of Icosahedrons: " + numberOfIcosahedrons();
      output += "\nTotal Surface Area: "
              + format.format(totalSurfaceArea());
      output += "\nTotal Volume: "
              + format.format(totalVolume());
      output += "\nAverage Surface Area: "
              + format.format(averageSurfaceArea());
      output += "\nAverage Volume: "
              + format.format(averageVolume());
      output += "\nAverage Surface/Volume Ratio: "
              + format.format(averageSurfaceToVolumeRatio());
      return output;
   }
   
  /**
   *Returns the array list.
   *
   *@return aList1 aList1
   */
   public ArrayList<Icosahedron> getList()
   {
      return aList1;
   }
   
    /**
     *Returns size of list.
     *
     *@return listNew listNew
     @param fileNameIn fileNameIn
     @throws FileNotFoundException
     */
   public IcosahedronList readFile(String fileNameIn)
      throws FileNotFoundException
   {
      Scanner fileName = new Scanner(new File(fileNameIn));
      listName = fileName.nextLine();
      while (fileName.hasNext())
      {
         String labelIn = fileName.nextLine();
         String colorIn = fileName.nextLine();
         double edgeIn = Double.parseDouble(fileName.nextLine());
         Icosahedron icosNew = new Icosahedron(labelIn, colorIn, edgeIn);
         aList1.add(icosNew);
      }
      fileName.close();
      IcosahedronList listNew = new IcosahedronList(listName, aList1);
      return listNew;
   }
   
    /**
     *Adds icosahedron.
     *
     *@param label label.
     *@param color color.
     *@param edge edge.
     */
   public void addIcosahedron(String label, String color, double edge)
   {
      Icosahedron icosNew = new Icosahedron(label, color, edge);
      aList1.add(icosNew);
   }
   
    /**
     *Finds icosahedron.
     *
     *@param labelIn labelIn
     *@return foundIcosNew foundIcosNew
     */
   public Icosahedron findIcosahedron(String labelIn) 
   {
      for (Icosahedron foundIcosNew : aList1) 
      {
         if (foundIcosNew.getLabel().equalsIgnoreCase(labelIn)) 
         {
            return foundIcosNew;
         } 
      }
      return null;
   }
   
    /**
     *Deletes icosahedron.
     *
     *@return icosNew icosNew
     *@param labelIn labelIn
     */
   public Icosahedron deleteIcosahedron(String labelIn) 
   {
      for (Icosahedron foundIcosNew : aList1) 
      {
         Icosahedron icosNew =  findIcosahedron(labelIn);
         aList1.remove(icosNew);
         return icosNew;
      }
      return null;
   }
   
    /**
     *To edit an Icosahedron.
     *
     *@param label label.
     *@param color color.
     *@param edge edge.
     *@return true or false.
     */
   public boolean editIcosahedron(String label, String color, double edge) 
   {
      label = label.trim();
      color = color.trim();
      Icosahedron icosNew = findIcosahedron(label);
      if (icosNew != null) 
      {
         icosNew.setColor(color);
         icosNew.setEdge(edge);
         return true;
      }
      return false;
   }
      



}