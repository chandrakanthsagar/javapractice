import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.lang.*;
public class Strngpalindrome {
    public static void main(String args[]) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter string:");
    String x;
     x=sc.next(); 
    String y="";
    int a;
    a=x.length();


    for(int i=a-1;i>=0;i--)
    {
       y=y+x.charAt(i);
    }
    
    if(x.compareTo(y)==0)
    {
        System.out.println("PALINDROME");

    }
    else{
        System.out.println("Not palindrome");
    }
}
}
