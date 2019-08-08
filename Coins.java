import java.util.*;
public class Coins
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the age:");
        int age = input.nextInt();
        if (age<=0){
            System.out.println("Invalid Age");
            
        }
        else{
            System.out.println("Meenu gets " + age*age*age + " coins");
        }
    }
}