public class q48 {
    public static void main(String[] args) {
int q=60;
int sq=q*q;
int c=0;
int temp=q;
        while(q!=0)
        {
            c++;
            q=q/10;

        }int lastdigits = sq% (int) Math.pow(10,c);
        System.out.println(lastdigits ==temp ? " auto ": "non auto");


    }
}
//auto or nonauto