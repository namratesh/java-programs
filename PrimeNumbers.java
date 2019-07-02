import java.util.Scanner;

public class PrimeNumbers
{
	public static void main(String args[])
	{
		
		int s1, s2, flag=1;
		Scanner s = new Scanner(System.in);
		
		s1 = s.nextInt();
		s2 = s.nextInt();
		if((s1<s2) && (s1>0) && (s2>0))
		{
			int i = s1;
			while(i<=s2){
				flag=0;
				for(int j=2; j<i;j++){
					if((i%j==0)){
							flag=1;
							break;
							
					}
				}
				if(i==1){
					flag=1;
				}
				if(flag==0){
					System.out.print(i + " ");
				}i++;
			}
		}
		else{
			System.out.println("Provide valid input");
		}
		
}
}