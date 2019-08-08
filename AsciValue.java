import java.util.*;
public class AsciValue{
     static Scanner input = new Scanner(System.in);
     public static void main(String[] args)
     
     {
         System.out.println("Enter the digits:");
         
         int first = input.nextInt();
         int second = input.nextInt();
         int third = input.nextInt();
         int fourth = input.nextInt();
         
         
         System.out.println(first + "-" + (char)first);
         System.out.println(second + "-" + (char)second);
         System.out.println(third + "-" + (char)third);
         System.out.println(fourth + "-" + (char)fourth);
        
     }
}