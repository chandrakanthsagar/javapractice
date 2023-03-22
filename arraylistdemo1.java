import java.util.*;
public class arraylistdemo1 {
    public static void main(String args[]){
    ArrayList<String> list=new ArrayList<String>();

    list.add("ram");
    list.add("hari");
    list.add("Allen");
    list.add("sai");
    list.add("srikanth");
    list.add("ganesh");
    list.add("umesh");

    System.out.println(list);
    ArrayList<String> list2=new ArrayList<String>();
    list.add("akash");
    list2.add("mahesh");
    System.out.println(list);
    list2.add("mobit");
    list2.add("farid");
    list2.add("akash");
    list.addAll(list2);
    
    System.out.println(list);
    list2.remove("farid");
    System.out.println(list2);
    System.out.println(list2.size());
    System.out.println(list2.contains("akash"));
    System.out.println(list);
    String a[]=new String[list.size()];
    a=list.toArray(a);
    System.out.println("after changing to array:"+ Arrays.toString(a));

    System.out.println(a[4]);
    }


}

