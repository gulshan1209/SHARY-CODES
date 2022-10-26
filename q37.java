
import java.util.Scanner;

public class q37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number And find the factors");
        // int factors;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if (n%i==0){
                System.out.print(i +" ");
            }
        }


    }
}
