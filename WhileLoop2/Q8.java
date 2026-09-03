package WhileLoop2;

public class Q8 {
    public static void main(String[] args) {
        int n=1;
        int sum=0;
        while (n<=100) {
            sum+=n*n*n;
            n++;
        }
        System.out.println(sum);
    }
}
