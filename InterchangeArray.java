import java.util.Scanner;
public class InterchangeArray{
    public static void main(String[]args)
    {Scanner sc=new Scanner(System.in);
        int size1,size2;
        System.out.println("Enter the number of elements in the first array :");
        size1=sc.nextInt();
        if(size1>0){int a[]=new int[size1];
        System.out.println("Enter the elements in the first array");
        for(int i=0;i<size1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the number of elements in the second array :");
        size2=sc.nextInt();
        if(size2>0)
        { int b[]=new int[size2];
            if(size1==size2)
            {
                System.out.println("Enter the elements in the second array");
               for(int j=0;j<size2;j++)
               {
                   b[j]=sc.nextInt();
               }
               
               for(int k=0;k<a.length;k++)
               { 
                   a[k]=b[k]+a[k];
                   b[k]=a[k]-b[k];
                   a[k]=a[k]-b[k];
               }
               System.out.println("The first array after swapping is :");
               for(int i1=0;i1<a.length;i1++)
               {
                   System.out.print(a[i1]+" ");
               }
               System.out.println("\nThe second array after swapping is :");
               for(int j1=0;j1<b.length;j1++)
               {
                   System.out.print(b[j1]+" ");
               }
               
            }else{
                System.out.println("Unable to swap size differs");
            }
         
            
        }else{
            System.out.println("Invalid range");
        }
        }else{
            System.out.println("Invalid range");
        }
        
    }
}