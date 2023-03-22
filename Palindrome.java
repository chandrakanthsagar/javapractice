
import java.util.*;
public class Palindrome {

    public static void main(String arg[]){
         
        Scanner s1=new Scanner(System.in);

        System.out.println("ENTER STRING: ");

        String n=s1.next();

        String k="";
        int m=n.length();
        for(int i=m-1;i>=0;i--)
        {
           char ch=n.charAt(i);
            k=k+ch;

        }
        

        if(n.compareTo(k)==0)
        {
            
        System.out.println("GIVEN STRING PALINDROME");

        }
        else{
            
        System.out.println("GIVEN STRING NOT PALINDROME");
        }




    }
    
}
