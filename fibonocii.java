import java.net.PortUnreachableException;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class fibonocii {

    public static int fib(int n){

        if(n==1)
           return 1;
        else if(n==2)
            return 1;
        else
            return fib(n-1)+fib(n-2);
        
        }

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonocii f=new fibonocii();
        
        for(int i=1;i<=n;i++){
            System.out.print(f.fib(i)+"  ");
        }
    }
    
}
