import java.util.*;
class Emp
{
int empid;
String empname;

}
class Salary extends Emp
{
String designation;
double sal;
Salary(int empid , String empname , String des , double salary)
{
super(empid,empname);
designation = des;
sal = salary;
}

void display()
{ 
 System.out.println(empid + " , " + empname + "," +designation + " , " +sal);
 }
}
public class Studentexample
{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of employees");
int n = sc.nextInt();
Salary s[] = new Salary[n];
 for(int i =0 ; i <n ; i++)
{
System.out.println("Enter the Employee details of " +(i+1));
int id = sc.nextInt();
String name = sc.next();
String desg = sc.next();
double sal = sc.nextDouble();
 s[i] = new Salary(id,name,desg,sal);
}
 System.out.println("The Employee details having > 20000 are");
 for(int i=0;i<n ; i++)
{ 
 if(s[i].sal >20000)
 s[i].display();
}
}
}