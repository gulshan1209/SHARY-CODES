import java.util.Scanner;

public class qu40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int s;

        int sum=0;
        while (n!=0){
            s=n%10;
            sum=sum+s;
            System.out.println(s);
            n=n/10;
        }
        System.out.println();
    }
}