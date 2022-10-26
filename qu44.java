public class qu44 {
    public static void main(String[] args) {
        int n = 12321;
        int temp = n;

        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println(rev == temp ? "pallind" : "not pallind");
    }
}
