import java.util.*;
class Emp
{
int empid;
 String empname;
 Emp(int x,String name){
     empid=x;
     empname=name;
 }
}
class Salary extends Emp
{
String designation;
double sal;

Salary(int x, String name , String des , double salary)
{
super(x,name);
designation = des;
sal = salary;
}
void display(){
    System.out.println(super.empid+""+super.empname+" "+designation+""+sal);
}
}
public class studentExample12{
    public static void main(String args[]){
        Salary k=new Salary(23,"rama","manager",40000);
        k.display();
    }
}
