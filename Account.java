public class Account {
    String name;
    int Acno;
    int balance=200000;
    void deposit( int amount){

        balance=balance+amount;
        System.out.println(" "+balance);
    }
    void withdraw(int amount){
        if(balance>amount){
            balance=balance-amount;
            System.out.println(" "+balance);
        }
        else{
            System.out.println("Insufficect balance");
        }
    }
    void balancechceck(){

        System.out.println(" "+balance);
    }


public static void main(String args[]) {
Account a=new Account();
a.deposit(10000);
a.withdraw(2000);
a.balancechceck();
    
}
}
