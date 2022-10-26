import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++)
            sum*=i;
        System.out.print(sum);

    }
}
