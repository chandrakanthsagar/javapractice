import java.util.*;
import java.lang.String;
public class Reve {
    
    private static int i;

    public static void main(String args[]){
        String s="welcometojava";
        int x=s.length();
        String[] sa=new String[x-2];
       for(int i=0;i<x;i++){
     
        if(i==(x-2))
        break;
        sa[i]=s.substring(i,i+3);
     
       }
       Arrays.sort(sa);
       System.out.println(sa[x-3]);
            
    }
    
}


