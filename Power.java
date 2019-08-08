import java.util.*;
public class Power
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        System.out.println("Enter the digit");
        
        int n = input.nextInt();
        int d = input.nextInt();
        long res = 1;
        if (n<0 || d<0){
            System.out.println("Invalid Input");
            
        }
        else{
        for(;d !=0; --d){
            res = res*n;
        }
        System.out.println(res);}
    }
}