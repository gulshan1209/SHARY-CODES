
import java.util.Scanner;

public class qu42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int count=0;
        int n=sc.nextInt();
        for( int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        // System.out.println(count==2 ? "prime number":"not prime number");
        if(count ==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }
}