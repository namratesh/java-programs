import java.util.Scanner;
public class ArrayAccumulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array:");
		int firstArraySize = sc.nextInt();
		if(firstArraySize<=0){
			System.out.println("Invalid array size");
			System.exit(0);
		}
		System.out.println("Enter elements for first array:");
		int a [] = new int[firstArraySize];
		for(int i =0; i<firstArraySize; i++){
			a[i]=  sc.nextInt();
		}
		
		
//		for(int i =0; i<firstArraySize; i++){
//			System.out.println(a[i]);
//		}
		
		
		System.out.println("Enter the size of second array:");
		int secondArraySize = sc.nextInt();
		if(secondArraySize<=0){
			System.out.println("Invalid array size");
			System.exit(0);
		}
		System.out.println("Enter elements for second array:");
		int b [] = new int[secondArraySize];
		for(int i =0; i<secondArraySize; i++){
			b[i]=  sc.nextInt();
		}
		int n;
		if(secondArraySize>firstArraySize){
			n = secondArraySize;
			
		}
		else{
			n = firstArraySize;
		}
		
		int c [] = new int[n];
		for(int i = 0; i<n; i++)
		{
			if(firstArraySize>i && secondArraySize>i){
			c[i] = a[i]+b[i];}
			else if(firstArraySize>secondArraySize){
				c[i]+=a[i];
			}
			else if(secondArraySize>firstArraySize){
				c[i] = b[i];
			}
			
		}
		for(int i = 0; i<n; i++){
			System.out.println(c[i]);
		}
		
	}
	

}
