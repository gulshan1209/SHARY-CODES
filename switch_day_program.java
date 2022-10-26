import java.util.Scanner;

public class switch_day_program {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int day = s.nextInt();
        switch (day) {
            case 1 -> {
                System.out.println(" monday");
            }
            case 2 -> {
                System.out.println(" tues");
            }
            case 3 -> {
                System.out.println("wen");
            }
            case 4 -> {
                System.out.println(" thur");

            }
            case 5 -> {
                System.out.println(" frie");
            }
            case 6 -> {
                System.out.println("sut");
            }
            case 7 -> {
                System.out.println(" sunday");

            }
            default->
                System.out.println(" wrong input");

        }
    }
}