import java.util.Scanner;

public class p36 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the Divided by 3 : ");
        int n=sc.nextInt();
        for (int i=1; i<n; i++) {
            if (i%3==0 )
                System.out.print(i +" ");
        }

        System.out.println("\nEnter the Divided by 5: ");
        for (int i=1; i<n; i++) {
            if (i%5==0) System.out.print(i +" ");
        }

        System.out.println("\n\nEnter the Divided by 3 & 5: ");
        for (int i=1; i<n; i++) {
            if (i%3==0 && i%5==0) System.out.print(i +",");
        }
        System.out.println(" ");
    }
}