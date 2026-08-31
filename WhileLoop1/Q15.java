package WhileLoop1;

public class Q15 {
    public static void main(String[] args) {
        int n=1;
        int count=0;
        while (n<=1000) {
            if (n%7==0 && n%10==7) {
                count++;
            }
            n++;
        }
        System.out.println(count);
    }
}
