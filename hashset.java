import java.nio.channels.NonWritableChannelException;
import java.util.*;

public class hashset {
    public static void main(String agrs[]){
        HashSet<String> k=new HashSet<String>();
        k.add("rama");
        k.add("sita");
        k.add("laxamana");
        k.add("dhasharatha");
        System.out.println(k);
        HashSet <String> k2=new HashSet<>();
        k2.add("ravana");
        k2.add("surapana");
        System.out.println(k2);
        k2.addAll(k);
        System.out.println(k2);
        Iterator itr=k2.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
            for(String i:k)
                System.out.println(i);

        
        
    }
}
