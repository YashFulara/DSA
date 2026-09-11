package WhileLoop2;

public class Q017 {
    public static void main(String[] args) {
        double sum=0;
        double n=1;
        while (n<=100) {
            if (n%2==0) {
                sum+=1/n;
            }
            n++;
        }
        System.out.println(sum);
    }
}
