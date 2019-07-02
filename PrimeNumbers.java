import java.util.Scanner;
public class PrimeNumbers
{
    public static void main(String[]args)
    {
        int a,b,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b&&a>0&&b>0)
        {
            for(i=a;i<=b;i++)
            {  if(i!=1){
                if(i==2||i==3||i==5||i==7)
            {
                System.out.println(i);
            }
             if(i%2==0||i%3==0||i%5==0||i%7==0)
             {
                }else{ System.out.println(i);}
            }
            }
        }else
        {
        System.out.println("Provide valid input");
}
}
}