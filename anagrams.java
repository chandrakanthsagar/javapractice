import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner (System.in);
        String x1=sc.next();
        String y1=sc.next();
        char[] x=x1.toCharArray();
        char[] y=y1.toCharArray();
        int m=x1.length();
        int n=y1.length();
        for(int i=0;i<m;i++){
            for(int j=0;j<m-1;j++){
                int t=Character.compare(x[j],x[j+1]);
                if(t>=0)
                {
                   char  temp=x[j];
                    x[j]=x[j+1];
                    x[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m-1;j++){
                int v=Character.compare(y[j],y[j+1]);
                if(v>=0){
                    char temp1=y[j];
                    y[j]=y[j+1];
                    y[j+1]=temp1;
                }
            }
        }
        String str=new String();
        String a=str.valueOf(x);
        String b=str.valueOf(y);
       
        
        
        if(a.equalsIgnoreCase(b))
            System.out.println("Anagrams");
        else 
            System.out.println("Not Anagrams");
    
                
        
        
    }
}

}
