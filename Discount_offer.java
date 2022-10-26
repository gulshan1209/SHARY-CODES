/*
0  -  5000       0 Discount ;
5001  -  7000    10 Discount;
7001  -  10000   20 Discount;
10000 more Discount  30 Discount;


 */
import java .util.Scanner;
public class Discount_offer {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt();

        double j=k;
        int m= k*10/100;
        int d=k*20/100;
        int g=k*30/100;


        if (k>=0 && k<=5000){
            System.out.println(j);
        }
        else if (k>=5001&&k<=7000)
        {
            System.out.println(k-m);
        }
        else if (k>=7001&&k<=10000)
        {
            System.out.println(k-d);
        }
        else
            System.out.println(k-g);

    }


}
