package WhileLoop2;

public class Q015 {
    public static void main(String[] args) {
        int n=1;
        long sum=0;
        while (n<=100) {
            sum+=n*n*(n+1);
            n++;
            
        }
        System.out.println(sum);
    }
}
