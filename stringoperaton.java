
import java.util.*;

public class stringoperaton {
    public static void main(String args[]){
       
        Scanner s1=new Scanner(System.in);
        System.out.println("enter n :");

        String n=s1.nextLine();
        
        System.out.println(n);

        String n2="welcome";
        String s2="wel";
        System.out.println(""+n2.concat(n));
        System.out.println(n.compareTo(n2));
        System.out.println(n.startsWith("hai"));
        System.out.println(n.endsWith("ing"));
        System.out.println(n.length());
      
        System.out.println(n.charAt(2));
        System.out.println(n.charAt(4));
        System.out.println(n.substring(4));
        System.out.println(n.toUpperCase());
        System.out.println(n.toLowerCase());
        System.out.println(n.compareTo(n2));
        
        

       

    }
}
