import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        int sumn = 0, sump = 0, sume = 0;
        do {
            n = s.nextInt();
            if (n < 0)
                sumn += n;
            else if (n > 0 && n % 2 == 0)
                sump += n;
            else
                sume += n;

        }
        while (n != 0);
        System.out.println(" reapet press y :");
        System.out.println("  nege " + sumn);
        System.out.println(" even sum " + sump);
        System.out.println(" odd sum " + sume);

    }


    }

