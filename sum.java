
import java.util.Scanner;
public class sum {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<n*2){
            if(i%3==0)
                sum=sum+i;
            i=i+2;
        }
        System.out.println("sum:"+sum);
    }
    
}
