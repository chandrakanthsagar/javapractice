abstract class Employee{
     Employee(){
            System.out.println("Programerer salary details:");
     }
     abstract void cal_salary();

     void display()
     {
        System.out.print("Programerer salary is:"); 
     }
}
class Programmer extends Employee{
   int noofdays=31;

   void cal_salary()
   {
        System.out.print(noofdays*2000);

   }
   
   public static void main(String args[])
   {
       Employee e=new Programmer();
       e.display();
       e.cal_salary();
   }
}
