import java.util.*;
public class arraylistdemo {
    public static void main(String args[]){
    ArrayList<Object> list=new ArrayList<Object>();

    list.add("ram");
    list.add("hari");
    list.add("Allen");
    list.add("sai");
    list.add("srikanth");
    list.add("ganesh");
    list.add("umesh");
    Iterator  itr=list.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    list.remove("ram");
    list.add("chandrakanth");
    Iterator  itr2=list.iterator();
    while(itr2.hasNext()){
        System.out.println(itr2.next());
    }

}
}