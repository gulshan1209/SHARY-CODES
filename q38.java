import java.util.Scanner;

public class q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number And find the factorial");
        int  factsum=0;
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            if (n % i == 0) {
                System.out.print( i+ " ");
                factsum=factsum+i;
            }

        }
        System.out.println("the sum of factorial:"+factsum);

    }
}
