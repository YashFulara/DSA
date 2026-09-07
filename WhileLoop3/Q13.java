package WhileLoop3;
public class Q13 {
    public static void main(String[] args) {
        int n=Integer.parseInt(IO.readln("Enter your no. "));
        int sum=0;
        while (n>0) {
            sum+=n%10;
            n=n/10;
        }
        System.out.println("Sum of digit is :"+ sum);
    }
}
