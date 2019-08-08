import java.util.*;
     public class EvenNumber{
         public static void main(String[] arg){
             Scanner input = new Scanner(System.in);
             System.out.println("Enter the size of an array:");
             int sizeArray = input.nextInt();
             if(sizeArray<=0){
                 System.out.println("Invalid array size");
                 System.exit(0);
            }
            System.out.println("Enter the array elements:");
            int arr [] = new int[sizeArray];
            //int arr2[] = new int[sizeArray];
            for(int i =0; i<sizeArray; i++){
              arr[i] = input.nextInt();
              }
            
            int count = 0;
            for(int i =0; i<sizeArray; i++){
            	if (arr[i]<10 && arr[i]%2==0){
            		
            	System.out.print(arr[i]);
            	}
            	else{
            		count = count+1;
            		
            	}
            	
            }
            if(sizeArray==count){
            	System.out.print("Single digit even number is not found in the array");
            	}
         }
            }
     