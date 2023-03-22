import java.util.Scanner;
import java.util.*;
import java.lang.*;

public class sortingcities {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nof cites");
        int n=sc.nextInt();
         String[] sa=new String[n];
         String p;
         System.out.println("enter cities names");
         for(int i=0;i<n;i++){
            sa[i]=sc.next();
         }
         for(int i=0;i<n;i++){
             for(int j=i+1;j<n;j++){
                 if(sa[i].compareTo(sa[j])>0){

                    
                    String temp;
                    temp=sa[i];
                    sa[i]=sa[j];
                    sa[j]=temp;
                 }
             }
         }
    System.out.println("DICTIONARY ORDER OF  GIVEN CITIES");
    for(int i=0;i<n;i++){
        System.out.println(sa[i]);
    }

    }
    
}
