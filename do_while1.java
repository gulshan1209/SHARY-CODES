import java.util.Scanner;

public class do_while1 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
int a=s.nextInt();
int b=s.nextInt();
        int in = s.nextInt();
      do {
          System.out.println(" press 1 add \n press 2 sub");

          if (in == 1) {
              System.out.println(" enter two no..");
              System.out.println(a + b);
          }if (in==2) {
              System.out.println(" enter two no..");
              System.out.println(a - b);}
          else
              System.out.println("wrong input");
          }
          while (in != 1 && in != 2) ;
          System.out.println(" wrong input");
      }
}
