import java.util.Scanner;
public class ArrayFactorailSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int n = sc.nextInt();
		if(n<=0){
			System.out.println("Invalid array size");
			System.exit(0);
		}
		System.out.println("Enter elements for first array:");
		int a [] = new int[n];
		for(int i =0; i<n; i++){
			a[i]=  sc.nextInt();
		}
	
		int b [] = new int[n];
		for(int i =0; i<n; i++){
		if(a[i]>0 && a[i]<=9){
			int sum = 0;
			int temp = 1;
			int fact = 1;
			for(int k =1; k<=a[i];k++){	
			fact = fact*k;
			}b[i] = fact;
			
		}
		}
	
		int sum = 0;
		for(int l =0; l<n;l++){
		sum+=b[l];}
		if(sum==0){
			System.out.println("No positive and single digit numbers found in an array");
		}
		
		
		else{System.out.println(sum);
		}
		
		
		
	}
	
	}

