
import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter n: ");
       int n=s.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int t;
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    
                }
            }
        }
        for(int i=0;i<n;i++)
        {
             System.out.println(""+(a[i]*a[i]));
        }
    }
}


