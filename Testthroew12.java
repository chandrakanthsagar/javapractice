public class Testthroew12 {
    static void validate(int age){
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("eligible for vote");
    }
    public static void main(String args[]) {
        validate(12);
        System.out.println("resr f fdsffjds");
        
    }
    
}
