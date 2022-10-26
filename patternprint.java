import java.util.Scanner;

public class patternprint {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1; i<=n;i++)
        {
            int j=1;
            for( j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
