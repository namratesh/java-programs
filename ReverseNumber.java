import java.util.*;
public class ReverseNumber
{
  static scanner input = new scanner(system.in);
public static void main(String{} Args)
{
system.out.println("Enter The Number:") ;
int n = input.nextInt();
int rev = 0;



if (n==0){
    system.out println(Output is :0");
}
else if (n<0){
    sytem.out.println("Number should be positive ");
}
else{while (n>0)
{
    int digit = n%10;
    rev = rev*10+digit;
    n= n/10;
    
}
sytem.out.println("output is :"=rev);
}
}
    
}