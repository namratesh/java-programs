import java.util.*;
public class Triangle
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        
        System.out.println("Enter the value for side1");
        System.out.println("Enter the value for side2");
        System.out.println("Enter the value for side3");
        
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        if(a<=0 ||b<=0 || c<=0){
            System.out.println("Invalid Input");
        }
        else if(a+b>c && a+c>b && b+c>a){
            System.out.println("Sides form a Triangle");
            
        }
        else {
            System.out.println("Sides does not form a Triangle");
        }
    }
}