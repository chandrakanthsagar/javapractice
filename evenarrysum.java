import java.util.*;
import java.util.Scanner;

public class evenarrysum{

    public static void main(String args[])
    {
         Scanner s1=new Scanner(System.in);

         int n=10;

         int a[]=new int[n];
         System.out.println("enter array elements ");

         for(int i=0;i<n;i++)
         {
             a[i]=s1.nextInt();
         }
         int sum=0;
         for(int i=0;i<n;i++)
         {
             if(a[i]%2==0)
                sum=sum+a[i];
         }

         System.out.println(sum);

    }

}