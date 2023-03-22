import java.util.*;
class emplyoee{

    
    String name;
    int eid;
    int salaray;

    emplyoee(String x,int y,int z){
        name=x;
        eid=y;
        salaray=z;
    }
}



public class linkedlist{
    public static void main(String arg[])
    {
        emplyoee e1=new emplyoee("ramu", 13, 100000);
        emplyoee e2=new emplyoee("raju", 14, 200000);
        emplyoee e3=new emplyoee("Hari", 15, 150000);
        emplyoee e4=new emplyoee("kalyan", 13, 80000);
    LinkedList<emplyoee> list=new LinkedList<emplyoee>();
    list.add(e1);
    list.add(e2);
    
    list.add(e3);
    
    list.add(e4);
    Iterator itr=list.iterator();
    while(itr.hasNext()){
        emplyoee s=(emplyoee)itr.next();
        System.out.println(s.name +" "+s.eid+" "+s.salaray);
    }
    System.out.println("***********");
  
    
    System.out.println(list.remove(list.get(1)));
    Iterator itr1=list.iterator();
    while(itr1.hasNext()){
        emplyoee s=(emplyoee)itr1.next();
        System.out.println(s.name +" "+s.eid+" "+s.salaray);
    }
    System.out.println("***********");


    


    
}
}