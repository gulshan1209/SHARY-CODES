import java.util.Scanner;
public class qu54 { //qu45
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any number");
        Scanner sc=new Scanner(System.in);
        int  number =sc.nextInt();
        int temp = number;
        int n = 0;

        //while (number > 0)
        for(int i=0;i<=n;i++){

            int rem = number % 10;
            n +=   (rem * rem * rem);
            number = number / 10;
        }
        if (temp == n) {
            System.out.println("It is Armstrong Number");
        }
        else {
            System.out.println( " It is not an Armstrong Number");

        }
    }
}
