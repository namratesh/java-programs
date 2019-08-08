import java.util.*;
public class IncrementCalculation
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the salary");
        System.out.println("Enter the Performance appraisal rating");
        
        int s = input.nextInt();
        double i = input.nextDouble();
        
        
        if( s<=0 || i<0 || i>5){
        System.out.println("Invalid Input");}
        
        else if(i>0 && i<=3){
            System.out.println((int)(s*1.1));
        }
        else if(i>=3.1 && i<=4){
            System.out.println((int)(s*1.25));
        }
        else if (i>=4.1 && i<=5){
            System.out.println((int) (s*1.3));
        }
        
    }
}