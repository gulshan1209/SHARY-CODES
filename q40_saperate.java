import java.util.Scanner;

public class q40_saperate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int i = 0; i <n; i++) {
            int rem= n%10;
            System.out.print(rem);
            n=n/10;

            
        }
                
    }
}
//input 654
//output 456