interface A{
    int x=10;
    void display();
}
interface B extends A{
    void display1();
}
 class Example implements B{
    public void display()
    {
        System.out.println("interface A");
    }
    public void display1()
    {
        System.out.println("interface b");
    }
    public static void main(String args[]){
        Example e=new Example();
        e.display();
        e.display1();
}
}