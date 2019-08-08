import java.util.*;
public class LuckyNum
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the car no:");
         int n = input.nextInt();
         int rem;
         int sum = 0;
         
        if(n>9999 || n<999){
            System.out.println(n + " is not a valid car number");
        }
        else
        {
            while (n>0)
            {
                
                rem = n%10;
                sum= rem+sum;
                n = n/10;
            }
        if(sum%3 == 0 || sum%7 == 0 || sum%5 == 0){
            System.out.println("Lucky Number");
        }
        else
        {
            System.out.println("Sorry its not my lucky number");
        }
            
        }
        
    }
}