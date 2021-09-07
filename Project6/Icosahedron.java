import java.text.DecimalFormat;
/**
 * Demonstrates Icosahedron class.
 * @author: Shanti Upadhyay
 */
public class Icosahedron {
   private String label = "";
   private String color = "";
   private double edge = 0;
   private double surfaceArea = 0;
   private double volume = 0;
   
   /**
    * Icosahedron Constructor. Sets variables so they can be altered.
    * @param labelIn labelIn
    * @param colorIn colorIn
    * @param edgeIn  edgeIn
    */
   public Icosahedron(String labelIn, String colorIn, double edgeIn) 
   {
      setLabel(labelIn);
      setColor(colorIn);
      setEdge(edgeIn);
      surfaceArea = (5 * Math.sqrt(3) * Math.pow(edge, 2));
      volume = ((5 * (3 + Math.sqrt(5)) / 12) * Math.pow(edge, 3));
   }
   
   /**
    * Label accessor(getter).
    * @return label label
    */
   public String getLabel() 
   {
      return label;
   }
   
   /**
    * Color accessor(getter).
    * @return color color
    */
   public String getColor() 
   {
      return color;
   }
   
   /**
    * Edge accessor(getter).
    * @return edge edge
    */
   public double getEdge() 
   {
      return edge;
   }
   
   /**
    * Label mutator(setter).
    * @param labelNew labelNew
    * @return label label
    */
   public boolean setLabel(String labelNew) 
   {
      if (labelNew != null) 
      {
         label = labelNew.trim();
         return true;
      }
      return false;
   }
   
   /**
    * Color mutator(setter).
    * @param colorNew colorNew
    * @return color color
    */
   public boolean setColor(String colorNew) 
   {
      if (colorNew != null) 
      {
         color = colorNew;
         return true;
      }
      return false;
   }
   
   /**
    * Edge mutator(setter).
    * @param edgeNew edgeNew.
    * @return boolean true or false
    */
   public boolean setEdge(double edgeNew) 
   {
      if (edgeNew > 0) 
      {
         edge = edgeNew;
         return true;
      }
      return false;
   }
   
   /**
    * SA accessor(getter).
    * @return surfaceArea surfaceArea
    */
   public double surfaceArea() 
   {
      return surfaceArea;
   }
   
   /**
    * Volume accessor(getter).
    * @return volume
    */
   public double volume() 
   {
      return volume;
   }
   
   /**
    * Ratio accessor(getter).
    * @return surfaceArea/volume
    */
   public double surfaceToVolumeRatio() 
   {
      return (surfaceArea / volume);
   }
   
   /**
    * toString method.
    * @return string string
    */
   public String toString() {
      DecimalFormat format = new DecimalFormat("#,##0.0#####");
      return ("Icosahedron \"" + label + "\" is \"" + color
              + "\" with 30 edges of length " + format.format(edge) + " units.")
              + ("\n\tsurface area = " + format.format(surfaceArea)
              + " square units")
              + ("\n\tvolume = " + format.format(volume) + " cubic units")
              + ("\n\tsurface/volume ratio = "
              +  format.format(surfaceArea / volume));
   }
}