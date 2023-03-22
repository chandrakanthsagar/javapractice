public class Testthrow2 {
    static void fun(){
        try{
            throw new NullPointerException("hi sir");
        }
        catch(NullPointerException e){
            System.out.println("Caught inside fun ");
            throw e;
        }
        
    }
    public static void main(String ard[]) {
        try{
            fun();
        }
        catch(NullPointerException e){
            System.out.println("Caught in sisfs");
        }
        
    }
    
}
