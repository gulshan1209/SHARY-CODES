import java.util.Arrays;
import java.util.Scanner;

public class Hackerra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [][] ar = new int[3][3];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = sc.nextInt();
            }
           // ar[i] = sc.nextInt();
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print( ar[i][j] +"");
            }
            System.out.println();
            // ar[i] = sc.nextInt();
        }
        //System.out.println(Arrays.toString(ar));
    }
}
