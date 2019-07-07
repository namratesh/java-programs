import java.util.Scanner;
public class ArrayCompatible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the size for First array:");
					int firstArraySize = sc.nextInt();
					if(firstArraySize<=0){
						System.out.println("Invalid array size");
						System.exit(0);
					}
					System.out.println("Enter the elements for First array:");
					int a [] = new int[firstArraySize];
					for(int i =0; i<firstArraySize; i++){
						a[i]=  sc.nextInt();
					}
					
					
//					for(int i =0; i<firstArraySize; i++){
//						System.out.println(a[i]);
//					}
					
					
					System.out.println("Enter the size for Second array:");
					int secondArraySize = sc.nextInt();
					if(secondArraySize<=0){
						System.out.println("Invalid array size");
						System.exit(0);
					}
					System.out.println("Enter the elements for Second array:");
					int b [] = new int[secondArraySize];
					for(int i =0; i<secondArraySize; i++){
						b[i]=  sc.nextInt();
					}
					int n;
					if(secondArraySize!=firstArraySize){
						System.out.println("Arrays are Not Compatible");
						System.exit(0);
						
					}
					
					int count = 0;
					for(int i = 0; i<firstArraySize; i++)
					{ if(a[i]>=b[i])
						count = count+1;
					System.out.println(count);
						}
					//System.out.println(count);
					
					if(count!=firstArraySize){
						System.out.println("Arrays are Not Compatible");
					}
					else{
						System.out.println("Arrays are Compatible");
					}
					
					
				}
				

			


		}


	


