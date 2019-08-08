import java.util.*;
public class CarDetails{
    
    static Scanner input = new Scanner(System.in);
    
        public static void main(String [] args)
    {
        System.out.println("Enter the car name:");
        System.out.println("Enter the car no:");
        System.out.println("Enter the price:");
        
        String name = input.nextLine();
        int number = input.nextInt();
        double price = input.nextDouble();
        
        System.out.println("Carname:" + name);
        System.out.println("Carno:" + number);
        System.out.println("Price:" + String.format("%.2f" ,price) + " rs only");
        
    }
}