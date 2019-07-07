import java.util.Scanner;
public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the size of an array:");
					int firstArraySize = sc.nextInt();
					if(firstArraySize<=0){
						System.out.println("Invalid array size");
						System.exit(0);
					}
					System.out.println("Enter the array elements:");
					int a [] = new int[firstArraySize];
					for(int i =0; i<firstArraySize; i++){
						a[i]=  sc.nextInt();
					}	
					
					System.out.println("Enter the position of the element to be replicated:");
					int n = sc.nextInt();
					if(n>=firstArraySize){
						System.out.println("Position is greater than the size of an array");
						System.exit(0);
						
					}
					
					
					
					
					for(int i =0; i<firstArraySize; i++){
						
						System.out.println(a[i]);
					}
					System.out.println(a[n]);
					
					
					
					
				}
				

			


		}


	


