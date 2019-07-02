import java.util.*;

public class ArraySort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        
        if (size > 0){
            int[] arr = new int[size];
            int[] arr_final = new int[size];
            Integer[] arr_f, arr_l;
            int i;
            
            System.out.println("Enter the elements:");
            for (i = 0; i < size; i++){
                arr[i] = sc.nextInt();
            }
            
            if(size % 2 == 0){
                arr_f = new Integer[size/2];
                arr_l = new Integer[size/2];
                for (i = 0; i < size/2; i++){
                    arr_f[i] = arr[i];
                }
                
                for(;i < size; i++){
                    arr_l[i] = arr[i];
                }
                
            } else {
                arr_f = new Integer[size/2 + 1];
                arr_l = new Integer[size/2];
                for(i = 0; i< size/2 + 1; i++){
                    arr_f[i] = arr[i];
                }
                
                for(int k = 0 ;i < size; i++){
                    arr_l[k] = arr[i];
                    k++;
                }
            }
            
            Arrays.sort(arr_f);
            Arrays.sort(arr_l, Collections.reverseOrder());
            
            i = 0;
            for(int x : arr_f){
                arr_final[i] = x;
                i++;
            }
            
            for(int x : arr_l){
                arr_final[i] = x;
                i++;
            }
            
            for (i = 0; i < size; i++){
                System.out.println(arr_final[i]);
            }
        } else {
            System.out.println("Array size should be greater than 0");
        }
    }
}