package WhileLoop2;

public class Q021{
    public static void main(String[] args) {
        double n=1;
        double sum=0;
        while (n<=100) {
           sum+=1/(n*(n+1));
           n++; 
        }
        System.out.println(sum);
    }
}
