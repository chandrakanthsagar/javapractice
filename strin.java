import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.lang.*;
public class strin {
    public static void main(String args[]) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String x;
     x=sc.next(); 
    System.out.println("enter n value:");
    int k=sc.nextInt();
    String y=x.substring(k-1);
     for(int i=k;i>0;i--){
         
        System.out.printf("%s",y);
     }
    
    }
}