import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      int temp =s.nextInt();
        for(int i=0; i<=n;i++)
        {
            int j=0;
            for( j=1;j<=temp;j++){   // n-i-1 ki jagah temp 2
                System.out.print("*");


                temp-- ;
            }
            System.out.println();
        }
    }
}
