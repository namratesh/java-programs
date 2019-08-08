import java.util.Arrays;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the size of an array:");
					int firstArraySize = sc.nextInt();
					if(firstArraySize<=0){
						System.out.println("Invalid array size");
						System.exit(0);
					}
					System.out.println("Enter the elements:");
					int a [] = new int[firstArraySize];
					for(int i =0; i<firstArraySize; i++){
						a[i]=  sc.nextInt();
					}
					int min=a[0];
					
					int max=a[0];  
					for (int i = 0; i < firstArraySize; i++)   
					        {  
					             
					             
					                if (a[i] > max)   
					                {  
					                   max = a[i];
					                }
					                
					                if (a[i] < min)   
					                {  min = a[i];
					                   
					                     
					                }  
					            }  
					         
					       
				
					
					System.out.println(min+max);
					
					
					
					
					
				}
				

			


		
}

	


