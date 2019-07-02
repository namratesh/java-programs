//
//import java.util.*; 
//
//class ArraySort { 
//	
//	static void printOrder(int[] arr, int n, int k) 
//	{ 
//		int len1 = k, len2 = n - k; 
//		int[] arr1 = new int[k]; 
//		int[] arr2 = new int[n - k]; 
//
//		
//		for (int i = 0; i < k; i++) 
//			arr1[i] = arr[i]; 
//
//		
//		for (int i = k; i < n; i++) 
//			arr2[i - k] = arr[i]; 
//
//		
//		Arrays.sort(arr1, 0, k); 
//
//		
//		Arrays.sort(arr2, k, n - k); 
//
//		
//		for (int i = 0; i < n; i++) { 
//			if (i < k) 
//				arr[i] = arr1[i]; 
//
//			else { 
//				arr[i] = arr2[len2 - 1]; 
//				len2--; 
//			} 
//		} 
//		
//		for (int i = 0; i < n; i++) { 
//			System.out.print(arr[i] + " "); 
//		} 
//	} 
//
//	
//	public static void main(String[] args) 
//	{ 	Scanner input = new Scanner(System.in);
//		int n = input.nextInt(); 
//		int k =  n/2;
//		int arr[] = { 89,23,56,12,99}; 
//		
//		
//		printOrder(arr, n, k); 
//	} 
//} 
