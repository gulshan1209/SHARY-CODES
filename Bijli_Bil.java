//0  -  100   4.2 rupi/ unit
// 101  -  200    6 rupi/ unit
// 201  -  400    8 rupi /unit
// 400 more unit   13 rupi /unit
import java.util.Scanner;
public class Bijli_Bil
{
    public static void main(String[] args) {
        Scanner Gulshan = new Scanner(System.in);
        //   int g = Gulshan.nextInt();
        long max = 10000000000000000L;
        int a=Gulshan.nextInt();

        double c=4.2*a;
        int h=a-100;
        double d=100*4.2+h*6 ;
        int j=a-200;
        double k=100*4.2+100*6+j*8;
        int m=a-400;
        double n=100*4.2+100*6+200*8+m*13;

        // double e=100*4.2+d*6;

        if (  a>=1    && a <= 100) {
            System.out.println(c);

        }else  if (  a>=101   &&    a <= 200) {
            System.out.println(d);
        }
        else   if (a>=201    && a<= 400) {
            System.out.println(k);
        } else if ( a>=400   &&    a < max) {
            System.out.println(n);

        } else
            System.out.println("congratulation program not is run");

    }
}


