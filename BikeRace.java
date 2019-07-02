
import java.util.*; 

class BikeRace
{ 


static int reverse(int n) 
{ 
	int rev = 0; 
	while (n != 0) 
	{ 
		rev = (rev * 10) + (n % 10); 
		n /= 10; 
	} 
	return rev; 
} 


static void getSum(int n) 
{ 
	n = reverse(n); 
	int mulOdd = 1, mulEven = 1, c = 1; 

	while (n != 0) 
	{ 

		
		if (c % 2 == 0) 
			mulEven *= n % 10; 
		else
			mulOdd *= n % 10; 
		n /= 10; 
		c++; 
	} 

	if(mulOdd<mulEven){
		System.out.println("Your bonus points is " + mulEven);
	}
	else if(mulOdd>mulEven){
		System.out.println("Your bonus points is " + mulOdd);
	}
	else if(mulOdd==mulEven){
		System.out.println("Your bonus points is " + mulOdd*2);
	}
} 


public static void main(String args[]) 

{ Scanner input = new Scanner(System.in);
	System.out.println("Enter the distance travelled");
	int n = input.nextInt();
	if(n>0){
	getSum(n);}
	else if(n==0){
	    System.out.println("Your bonus points is " + 0);
	}
	else{
System.out.println("Invalid Input");
System.exit(0);
	}
} 
} 
