import java.util.Scanner;
public class Course{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of course:");
        int size=sc.nextInt();
        if(size>0)
        { System.out.println("Enter course names:");
        String[] a=new String[size+1];
        for(int i=0;i<=size;i++)
        {   
            a[i]=sc.nextLine();
        
        }
        System.out.println("Enter the course to be searched:");
            String c=sc.nextLine();
            int count=0;
      for(int i=0;i<=size;i++)
      { if(a[i].equals(c))
         { count++;
             System.out.println(c+" course is available");
      }
      } 
      if(count==0)
      {
          System.out.println(c+" course is not available");
      }
      
        }
        else{
            System.out.println("Invalid Range");
        }
    }
}