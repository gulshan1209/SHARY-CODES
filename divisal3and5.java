import java.util.Scanner;

public class divisal3and5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i =1 ; i < n; i++) {
if(i%3==0 || i%5==0){
    System.out.println(i);
i++;

}


        }


    }
}