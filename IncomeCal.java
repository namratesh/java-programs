import java.util.*;
public class IncomeCal
{
     static Scanner input = new Scanner(System.in);
     public static void main(String[] args)
     {
         
         System.out.println("Enter no of hours worked in a day");
         
         int h = input.nextInt();
         
         if(h<0 || h>=24){
             System.out.println("Unable to calculate the earnings");
         }
         else
         { int income = 36500*h;
             System.out.println("Total income in a year:" + income);
         }
     }
}