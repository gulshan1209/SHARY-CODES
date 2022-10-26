import java.util.Scanner;
import java.util.*;
//import java.lang.*;
public class ATM_Q {
    public static void main(String[] args) {
Scanner s=new Scanner (System.in);

        char ch = s.next().charAt(0);

            if(ch=='A'|| ch=='E' ||ch=='I' || ch=='O' || ch=='U'||ch=='a'|| ch=='e' ||ch=='i' || ch=='o' || ch=='u')
            {
                System.out.println("VOWEL");
        }
            else
        System.out.println("CONSONANT");
    }
}
