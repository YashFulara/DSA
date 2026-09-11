package WhileLoop2;

public class Q022 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter no. "));
        int fact=1;
        if (n==1) {
            fact=1;
        }
        while (n>1) {
            fact+=n*(n-1);
            n--;
        }
        System.out.println(fact);
    }
}
