import java.util.*;
public class NumberRepetition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        System.out.println("Enter the key digit ");
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count = 0;
        
        int j = n;
        while (j!=0){
           
            if(j%10 == d){
                count = count+1;
            }
            j = j/10;
            
        }
        if(count>0){
        System.out.println(d + " appears " + count + " times in " + n);}
        else{
            System.out.println(d + " appears 0 times in " + n);
        }
        
    }
}