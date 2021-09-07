import java.util.Scanner;
import java.text.DecimalFormat;
/** 
 * Course: COMP1210 - Section 011 
 *
 * @author Shanti Upadhyay
 * @version Date Due: Friday, September 14
 */
public class FootballTicket
{
  /**
   * Takes user input to evaluate formula given.
   *
   * @param args Command line arguments (not used).
   */
   public static void main(String []args)
   {
      Scanner userInput = new Scanner(System.in);
      
      System.out.print("Enter your ticket code: ");
      String ticketCode = userInput.nextLine();
      
      // Instance Variables
      String game;
      String date;
      String month;
      String day;
      String year;
      String time;
      String hour;
      String minutes;
      String section;
      String row;
      String seat;
      String priceString;
      String costString;
      int prizeNum = (int) (Math.random() * 9999999 + 1); // random prize
      double endingPrice = 0;
      
      
      if (ticketCode.length() >= 25)
      {
         // sectioning out categories of ticket code
         char category = ticketCode.charAt(0);
         game = ticketCode.substring(24, 37);
         date = ticketCode.substring(10, 17);
         month = ticketCode.substring(10, 12);
         day = ticketCode.substring(12, 14);
         year = ticketCode.substring(14, 18);
         time = ticketCode.substring(5, 10);
         hour = ticketCode.substring(6, 8);
         minutes = ticketCode.substring(8, 10);
         section = ticketCode.substring(22, 24);
         row = ticketCode.substring(20, 22);
         seat = ticketCode.substring(18, 20);
         priceString = ticketCode.substring(1, 4);
         costString = ticketCode.substring(1, 4);
         
         // converts price and time to doubles
         double priceDouble = Double.parseDouble(priceString);
         double costDouble = Double.parseDouble(costString);
         
         // makes readable date and time
         String printedDate = month + "/" + day + "/" + year;
         String printedTime = hour + ":" + minutes;
         
         

         if (category == ('s'))
         {
            double studentDiscount = (costDouble * 0.67);
            endingPrice = costDouble - studentDiscount;
         }
         else if (category == ('f'))
         {
            double facultyDiscount = (costDouble * 0.2);
            endingPrice = costDouble - facultyDiscount;
         }   
         else
         {
            endingPrice = costDouble;
         }
         
         //price and cost formatting
         DecimalFormat fprice = new DecimalFormat("$###.00");
         DecimalFormat fcost = new DecimalFormat("$###.00");

         
         // program output
         System.out.println();
         System.out.println("Game: " + game + "\tDate: " + printedDate
            + "\tTime: " + printedTime);
         System.out.println("Section: " + section + "\t  Row: " + row
            + "\t  Seat: " + seat);
         System.out.println("Price: " + fprice.format(priceDouble) 
         "\t  Category: " + category + "\t  Cost: " + fcost.format(endingPrice));
         System.out.println("Prize Number: " + prizeNum);
         
         
      }
      else
      {
         System.out.println();
         System.out.println("Invalid Ticket Code.");
         System.out.println("Ticket code must have at least 25 characters.");
      }
         
      
      
   
   
   
   
   
   }
}      