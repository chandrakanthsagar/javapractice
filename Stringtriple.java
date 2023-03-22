import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.lang.*;
public class Stringtriple {
    public static void main(String args[]) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String x;
     x=sc.next(); 
     int k=x.length();
     int count=0;
     for(int i=0;i<k;i++){
         char z=x.charAt(i);
         if(k<3)
         {
             System.out.println(0);
             System.exit(0);
         }
         if(i==k-2)
           {
               break;
           }

         if(x.charAt(i+1)==z && x.charAt(i+2)==z)
         {
             count++;
             
         }
     }
     System.out.println(count);
       
    }
}