package WhileLoop1;

public class Q9 {
    public static void main(String[] args) {
        int n=1;
        int count=0;
        while (n*n*n<=100) {
            count++;
            n++;
        }
        System.out.println( count);
    }
}
