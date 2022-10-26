import java.util.Scanner;

public class qu41 {
    public static void main(String[] args) {
        int sum = 0, a;

        System.out.println("Enter the any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            a=n%10;
            n=n/10;
            sum=sum+a;
        }
        System.out.println("the sum of digits number="+sum);
    }
}