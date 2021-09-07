import java.util.ArrayList;
import java.text.DecimalFormat;
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
    * @return number number
    */
   public int numberOfIcosahedrons()
   {
      int number = 0;
      for (int i = 0; i < aList1.size(); i++) {
         number++;
      }
      return number;
   }
   
   /**
    * @return totalSurfaceArea totalSurfaceArea
    */
   public double totalSurfaceArea()
   {
      if (numberOfIcosahedrons() > 0) 
      {
         double totalSurfaceArea = 0;
         for (Icosahedron i : aList1) 
         {
            totalSurfaceArea += i.surfaceArea();
         }
         return totalSurfaceArea;
      }
      else
      {
         return 0;
      }
   }
   
   /**
    * @return totalVolume totalVolume
    */
   public double totalVolume()
   {
      if (numberOfIcosahedrons() > 0) 
      {
         double totalVolume = 0;
         for (Icosahedron i : aList1) 
         {
            totalVolume += i.volume();
         }
         return totalVolume;
      }
      else
      {
         return 0;
      }
   }
   
   /**
    * @return averageSurfaceArea averageSurfaceArea
    */
   public double averageSurfaceArea()
   {
      if (numberOfIcosahedrons() > 0)
      {
         return (totalSurfaceArea() / aList1.size());
      }
      else
      {
         return 0;
      }
   }
   
   /**
    * @return averageVolume averageVolume
    */
   public double averageVolume()
   {
      if (numberOfIcosahedrons() > 0) {
         return (totalVolume() / aList1.size());
      }
      else
      {
         return 0;
      }
   }
   
   /**
    * @return averageSurfaceToVolumeRatio
    */
   public double averageSurfaceToVolumeRatio()
   {
      double surfaceAreaToVolume = 0;
      if (numberOfIcosahedrons() > 0)
      {
         for (Icosahedron i : aList1) 
         {
            surfaceAreaToVolume += i.surfaceToVolumeRatio();
         }
      }
      else 
      {
         return 0;
      }
      return (surfaceAreaToVolume / aList1.size());
   }
   /**
    * toString method.
    * @return output output
    */
   public String toString()
   {
      String output = "";
      output += getName() + "\n";
      while (true)
      {
         for (Icosahedron i : aList1)
         {
            output += "\n" + i + "\n";
         }
         break;
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
   
   
}