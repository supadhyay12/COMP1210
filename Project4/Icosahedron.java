import java.text.DecimalFormat;
/** 
 * Course: COMP1210 - Section 011 
 *
 * @author Shanti Upadhyay
 * @version Date Due: Friday, September 21
 */
public class Icosahedron 
{
   // instance variables
   private String label = "";
   private String color = "";
   private double edge = 0;
   private double surfaceArea = 0;
   private double volume = 0;
 
/**
 * constructor.
 * @param labelIn labelIn
 * @param colorIn colorIn
 * @param edgeIn  colorIn
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
 * label mutator.
 * @param labelNew labelNew
 * @return label 
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
 * label accessor
 * @return label
 */
   public String getLabel() 
   {
      return label;
   }   
 
/**
 * color mutator
 * @param colorNew colorNew
 * @return color
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
 * color accessor
 * @return color 
 */
   public String getColor() 
   {
      return color;
   }
   
/**
 * edge mutator
 * @param edgeNew edgeNew
 * @return boolean
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
 * edge accessor
 * @return edge
 */
   public double getEdge() 
   {
      return edge;
   }
   /**
    * surface area method
    * @return surfaceArea
    */
   public double surfaceArea() 
   {
      return surfaceArea;
   }
   /**
    * volume method
    * @return volume
    */
   public double volume() 
   {
      return volume;
   }
   /**
    * 
    * @return surface area to volume ratio
    */
   public double surfaceToVolumeRatio() 
   {
      return (surfaceArea / volume);
   }   
   
   /**
    * 
    * @return string
    */
   public String toString()
   {
      DecimalFormat format = new DecimalFormat("#,##0.0#####");
      return ("Icosahedron \"" + label + "\" is \"" + color
         + "\" with 30 edges of length " + format.format(edge) + " units.")
         + "\n\tsurface area = " + format.format(surfaceArea)
         + " square units"
         + "\n\tvolume = " + format.format(volume) + " cubic units"
         + "\n\tsurface/volume ratio = "
         + format.format(surfaceArea / volume);
   }
   
   
} 