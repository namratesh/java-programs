import java.util.*;
public class CumulativeSum{
    public static void  main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = input.nextInt();
        int sum = 0;
        if(n<=0 || n>20){
            System.out.println("Invalid Range");
            System.exit(0);
        }
        System.out.println("Enter the elements");
        int arr [] = new int[n];
        for(int i = 0; i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i =0; i<n; i++){
            
            int a= arr[i]+sum;
            sum = a;
            System.out.print(a + " ");
        }
    }
}