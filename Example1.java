interface A{
    int x=10;
    void display();
}
interface B extends A{
    void display();
}
 class Example1 implements A,B{
    public void display()
    {
        System.out.println("interface A,b");
    }
   
    
    public static void main(String args[]){
        Example1 e=new Example1();
        e.display();
       
}
}