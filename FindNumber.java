import java.util.*;
public class FindNumber
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int a = input.nextInt();
        if(a<=0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int k = 1;
       
        for(int i = 1; i<=a; i++){
            i=i++;
            k = k*i;
            
            while(k==a){
                System.out.println(i);
                
                System.exit(0);
                
            }
            
            
        }
                System.out.println("Sorry. The given number is not a perfect factorial");
                
                
            
       
 }
}