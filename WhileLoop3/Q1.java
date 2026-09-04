package WhileLoop3;

public class Q1 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter the no. "));
        while (n>0) {
            System.out.println(n%10);
           n= n/10;
        }
    }
}
